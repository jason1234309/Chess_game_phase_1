package chess;

import java.util.*;

public class KingPiece implements ChessPiece{
    public KingPiece(ChessGame.TeamColor color){
        pieceTeamColor = color;
    }
    ChessGame.TeamColor pieceTeamColor;
    @Override
    public ChessGame.TeamColor getTeamColor() {
        return pieceTeamColor;
    }
    public void setTeamColor(ChessGame.TeamColor teamColor){
        pieceTeamColor = teamColor;
    }

    @Override
    public PieceType getPieceType() {
        return PieceType.KING;
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> validMoveList = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList = new ArrayList<>();
        ArrayList<ChessMove> inBoardMoveList = new ArrayList<ChessMove>();
        int maxMoveNumber = 8;
        for(int i = 0; i < maxMoveNumber; i++){
            possibleMoveList.add(new ChessMoveClass());
            possibleMoveList.get(i).setStartPosition(myPosition);
        }
        possibleMoveList.get(0).setEndPosition(new ChessPositionClass(
                myPosition.getRow()+1, myPosition.getColumn()));
        possibleMoveList.get(1).setEndPosition(new ChessPositionClass(
                myPosition.getRow(), myPosition.getColumn()+1));
        possibleMoveList.get(2).setEndPosition(new ChessPositionClass(
                myPosition.getRow()-1, myPosition.getColumn()));
        possibleMoveList.get(3).setEndPosition(new ChessPositionClass(
                myPosition.getRow(), myPosition.getColumn()-1));
        possibleMoveList.get(4).setEndPosition(new ChessPositionClass(
                myPosition.getRow()+1, myPosition.getColumn()+1));
        possibleMoveList.get(5).setEndPosition(new ChessPositionClass(
                myPosition.getRow()-1, myPosition.getColumn()+1));
        possibleMoveList.get(6).setEndPosition(new ChessPositionClass(
                myPosition.getRow()+1, myPosition.getColumn()-1));
        possibleMoveList.get(7).setEndPosition(new ChessPositionClass(
                myPosition.getRow()-1, myPosition.getColumn()-1));

        for(int i = 0; i < maxMoveNumber; i++){
            if(possibleMoveList.get(i).getEndPosition().getRow() >= 1 &&
                    possibleMoveList.get(i).getEndPosition().getRow() <= 8 &&
                    possibleMoveList.get(i).getEndPosition().getColumn() >= 1 &&
                    possibleMoveList.get(i).getEndPosition().getColumn() <= 8){
                inBoardMoveList.add(possibleMoveList.get(i));
            }
        }
        for(int i = 0; i < inBoardMoveList.size(); i++){
            if(board.getPiece(inBoardMoveList.get(i).getEndPosition()) == null){
                validMoveList.add(inBoardMoveList.get(i));
            }else{
                if(this.getTeamColor() !=
                        board.getPiece(inBoardMoveList.get(i).getEndPosition()).getTeamColor()){
                    validMoveList.add(inBoardMoveList.get(i));
                }
            }
        }
        return validMoveList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KingPiece kingPiece = (KingPiece) o;
        return pieceTeamColor == kingPiece.pieceTeamColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceTeamColor);
    }
}
