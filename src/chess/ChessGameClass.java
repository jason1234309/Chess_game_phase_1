package chess;

import java.util.*;

public class ChessGameClass implements ChessGame{
    TeamColor currentTeamTurn;
    ChessBoardClass currentChessBoard = new ChessBoardClass();
    @Override
    public TeamColor getTeamTurn() {
        return currentTeamTurn;
    }

    @Override
    public void setTeamTurn(TeamColor team) {
        currentTeamTurn = team;
    }

    @Override
    public Collection<ChessMove> validMoves(ChessPosition startPosition) {

        return currentChessBoard.getPiece(startPosition).pieceMoves(
                currentChessBoard, startPosition);
    }

    @Override
    public void makeMove(ChessMove move) throws InvalidMoveException {
        if(currentChessBoard.getPiece(move.getStartPosition()) == null){
            throw new InvalidMoveException();
        }
        ChessPiece currentChessPiece = currentChessBoard.getPiece(
                move.getStartPosition());
        boolean isValidMove = false;

        if(currentChessPiece.getTeamColor() != currentTeamTurn){
            throw new InvalidMoveException();
        }
        if(move.getEndPosition().getRow() < 1 || move.getEndPosition().getRow() > 8 ||
        move.getEndPosition().getColumn() < 1 || move.getEndPosition().getColumn() > 8){
            throw new InvalidMoveException();
        }
        if(currentChessBoard.getPiece(move.getEndPosition()) != null){
            if(currentChessBoard.getPiece(move.getEndPosition()).getTeamColor() ==
                    currentChessPiece.getTeamColor()){
                throw new InvalidMoveException();
            }
        }
        Collection<ChessMove> pieceValidMoveList = new ArrayList<>();
        pieceValidMoveList = currentChessPiece.pieceMoves(
                currentChessBoard, move.getStartPosition());
        for(ChessMove currentValidMove: pieceValidMoveList){
            if(move.equals(currentValidMove)){
                isValidMove = true;
                break;
            }
        }
        if(!isValidMove){
            throw new InvalidMoveException();
        }
        if(isInCheck(currentTeamTurn)){
            currentChessBoard.removePiece(move.getStartPosition());
            currentChessBoard.addPiece(move.getEndPosition(), currentChessPiece);
            if(isInCheck(currentTeamTurn)){
                currentChessBoard.removePiece(move.getEndPosition());
                currentChessBoard.addPiece(move.getStartPosition(), currentChessPiece);
                throw new InvalidMoveException();
            }
        }else{
            currentChessBoard.removePiece(move.getStartPosition());
            currentChessBoard.addPiece(move.getEndPosition(), currentChessPiece);
        }

        if(currentTeamTurn == TeamColor.WHITE){
            currentTeamTurn = TeamColor.BLACK;
        }else{
            currentTeamTurn = TeamColor.WHITE;
        }
    }

    @Override
    public boolean isInCheck(TeamColor teamColor) {
        ChessPosition kingPosition = new ChessPositionClass(0,0);
        for(Map.Entry<ChessPosition, ChessPiece> currentEntry:
                currentChessBoard.getChessBoardMap().entrySet()){
            if(currentEntry.getValue().getTeamColor() == teamColor){
                if(currentEntry.getValue().getPieceType() == ChessPiece.PieceType.KING){
                    kingPosition = currentEntry.getKey();
                    break;
                }
            }
        }
        for(Map.Entry<ChessPosition, ChessPiece> currentEntry:
                currentChessBoard.getChessBoardMap().entrySet()){
            if(currentEntry.getValue().getTeamColor() != teamColor){
                Collection<ChessMove> possibleCheckMoves =
                        currentEntry.getValue().pieceMoves(currentChessBoard,
                                currentEntry.getKey());
                for(ChessMove currentMove : possibleCheckMoves){
                    if(currentMove.getEndPosition().equals(kingPosition)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean isInCheckmate(TeamColor teamColor) {
        ChessBoard deepCopyChessBoard = new ChessBoardClass();
        boolean hasValidMove = false;

        for(Map.Entry<ChessPosition,ChessPiece> currentEntry: currentChessBoard.getChessBoardMap().entrySet()){
            deepCopyChessBoard.addPiece(currentEntry.getKey(), currentEntry.getValue());
        }
        for(Map.Entry<ChessPosition, ChessPiece> currentEntry:
                currentChessBoard.getChessBoardMap().entrySet()){
            if(currentEntry.getValue().getTeamColor() == teamColor){
                Collection<ChessMove> possibleCheckMoves =
                        currentEntry.getValue().pieceMoves(currentChessBoard,
                                currentEntry.getKey());
                ChessPiece tempPieceVar = currentEntry.getValue();
                for(ChessMove currentMove : possibleCheckMoves){
                    deepCopyChessBoard.removePiece(currentMove.getStartPosition());
                    deepCopyChessBoard.addPiece(currentMove.getEndPosition(), tempPieceVar);
                    if(!isInCheck(teamColor)){
                        hasValidMove = true;
                        deepCopyChessBoard.removePiece(currentMove.getEndPosition());
                        deepCopyChessBoard.addPiece(currentMove.getStartPosition(), tempPieceVar);
                        break;
                    }
                    deepCopyChessBoard.removePiece(currentMove.getEndPosition());
                    deepCopyChessBoard.addPiece(currentMove.getStartPosition(), tempPieceVar);
                }
            }
            if(hasValidMove){
                break;
            }
        }
        if(hasValidMove){
            return false;
        }
        else{
            if(isInCheck(teamColor)){
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean isInStalemate(TeamColor teamColor) {
        ChessPosition kingPosition = new ChessPositionClass(0,0);
        for(Map.Entry<ChessPosition, ChessPiece> currentEntry:
                currentChessBoard.getChessBoardMap().entrySet()){
            if(currentEntry.getValue().getTeamColor() == teamColor){
                if(currentEntry.getValue().getPieceType() == ChessPiece.PieceType.KING){
                    kingPosition = currentEntry.getKey();
                    break;
                }
            }
        }
        if(currentChessBoard.getPiece(kingPosition).pieceMoves(currentChessBoard,kingPosition).size() != 0){
            return false;
        }
        else{
            if(!isInCheck(teamColor)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void setBoard(ChessBoard board) {
        currentChessBoard = (ChessBoardClass) board;
    }

    @Override
    public ChessBoard getBoard() {
        return currentChessBoard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessGameClass that = (ChessGameClass) o;
        return currentTeamTurn == that.currentTeamTurn && Objects.equals(currentChessBoard, that.currentChessBoard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentTeamTurn, currentChessBoard);
    }
}