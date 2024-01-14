package chess;

import java.util.*;

public class PawnPiece implements ChessPiece{
    ChessGame.TeamColor pieceTeamColor;
    public PawnPiece(ChessGame.TeamColor color){
        pieceTeamColor = color;
    }
    @Override
    public ChessGame.TeamColor getTeamColor() {
        return pieceTeamColor;
    }

    @Override
    public void setTeamColor(ChessGame.TeamColor teamColor){
        pieceTeamColor = teamColor;
    }

    @Override
    public PieceType getPieceType() {
        return PieceType.PAWN;
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> validMoveList = new ArrayList<>();
        ChessMove forwardMove = new ChessMoveClass();
        ChessMove positiveDiagonalMove = new ChessMoveClass();
        ChessMove negativeDiagonalMove = new ChessMoveClass();
        boolean isFirstMove = true;

        // as there are only 3 options, depending on if the piece is a white or black piece
        // they can be set individually and checked for valid state individually
        if(this.getTeamColor() == ChessGame.TeamColor.WHITE){
            forwardMove.setStartPosition(myPosition);
            forwardMove.setEndPosition(new ChessPositionClass(
                    myPosition.getRow()+1, myPosition.getColumn()));
            if(board.getPiece(forwardMove.getEndPosition()) == null &&
                    forwardMove.getEndPosition().getRow() >= 1 &&
                    forwardMove.getEndPosition().getRow() <= 8 &&
                    forwardMove.getEndPosition().getColumn() >= 1 &&
                    forwardMove.getEndPosition().getColumn() <= 8){
                if(forwardMove.getStartPosition().getRow() == 2){
                    ChessMove doubleForwardMove = new ChessMoveClass();
                    doubleForwardMove.setStartPosition(myPosition);
                    doubleForwardMove.setEndPosition(new ChessPositionClass(
                            myPosition.getRow()+2, myPosition.getColumn()));
                    if(board.getPiece(doubleForwardMove.getEndPosition()) == null){
                        validMoveList.add(doubleForwardMove);
                    }
                }
                //if the pawn has reached the other side then it adds the promotion moves
                if(forwardMove.getEndPosition().getRow() == 8){
                    validMoveList.add(new ChessMoveClass(
                            forwardMove.getStartPosition(),
                            forwardMove.getEndPosition(), PieceType.QUEEN));
                    validMoveList.add(new ChessMoveClass(
                            forwardMove.getStartPosition(),
                            forwardMove.getEndPosition(), PieceType.BISHOP));
                    validMoveList.add(new ChessMoveClass(
                            forwardMove.getStartPosition(),
                            forwardMove.getEndPosition(), PieceType.KNIGHT));
                    validMoveList.add(new ChessMoveClass(
                            forwardMove.getStartPosition(),
                            forwardMove.getEndPosition(), PieceType.ROOK));
                }
                else{
                    validMoveList.add(forwardMove);
                }
            }

            positiveDiagonalMove.setStartPosition(myPosition);
            positiveDiagonalMove.setEndPosition(new ChessPositionClass(
                    myPosition.getRow()+1, myPosition.getColumn()+1));
            if(board.getPiece(positiveDiagonalMove.getEndPosition()) != null &&
                    this.getTeamColor() != board.getPiece(
                            positiveDiagonalMove.getEndPosition()).getTeamColor() &&
                    positiveDiagonalMove.getEndPosition().getRow() >= 1 &&
                    positiveDiagonalMove.getEndPosition().getRow() <= 8 &&
                    positiveDiagonalMove.getEndPosition().getColumn() >= 1 &&
                    positiveDiagonalMove.getEndPosition().getColumn() <= 8){
                //if the pawn has reached the other side then it adds the promotion moves
                if(positiveDiagonalMove.getEndPosition().getRow() == 8){
                    validMoveList.add(new ChessMoveClass(
                            positiveDiagonalMove.getStartPosition(),
                            positiveDiagonalMove.getEndPosition(), PieceType.QUEEN));
                    validMoveList.add(new ChessMoveClass(
                            positiveDiagonalMove.getStartPosition(),
                            positiveDiagonalMove.getEndPosition(), PieceType.BISHOP));
                    validMoveList.add(new ChessMoveClass(
                            positiveDiagonalMove.getStartPosition(),
                            positiveDiagonalMove.getEndPosition(), PieceType.KNIGHT));
                    validMoveList.add(new ChessMoveClass(
                            positiveDiagonalMove.getStartPosition(),
                            positiveDiagonalMove.getEndPosition(), PieceType.ROOK));
                }
                else{
                    validMoveList.add(positiveDiagonalMove);
                }
            }


            negativeDiagonalMove.setStartPosition(myPosition);
            negativeDiagonalMove.setEndPosition(new ChessPositionClass(
                    myPosition.getRow()+1, myPosition.getColumn()-1));
            if(board.getPiece(negativeDiagonalMove.getEndPosition()) != null &&
                    this.getTeamColor() != board.getPiece(
                            negativeDiagonalMove.getEndPosition()).getTeamColor() &&
                    negativeDiagonalMove.getEndPosition().getRow() >= 1 &&
                    negativeDiagonalMove.getEndPosition().getRow() <= 8 &&
                    negativeDiagonalMove.getEndPosition().getColumn() >= 1 &&
                    negativeDiagonalMove.getEndPosition().getColumn() <= 8){
                //if the pawn has reached the other side then it adds the promotion moves
                if(negativeDiagonalMove.getEndPosition().getRow() == 8){
                    validMoveList.add(new ChessMoveClass(
                            negativeDiagonalMove.getStartPosition(),
                            negativeDiagonalMove.getEndPosition(), PieceType.QUEEN));
                    validMoveList.add(new ChessMoveClass(
                            negativeDiagonalMove.getStartPosition(),
                            negativeDiagonalMove.getEndPosition(), PieceType.BISHOP));
                    validMoveList.add(new ChessMoveClass(
                            negativeDiagonalMove.getStartPosition(),
                            negativeDiagonalMove.getEndPosition(), PieceType.KNIGHT));
                    validMoveList.add(new ChessMoveClass(
                            negativeDiagonalMove.getStartPosition(),
                            negativeDiagonalMove.getEndPosition(), PieceType.ROOK));
                }
                else{
                    validMoveList.add(negativeDiagonalMove);
                }
            }
        }
        else{
            forwardMove.setStartPosition(myPosition);
            forwardMove.setEndPosition(new ChessPositionClass(
                    myPosition.getRow()-1, myPosition.getColumn()));
            if(board.getPiece(forwardMove.getEndPosition()) == null &&
                    forwardMove.getEndPosition().getRow() >= 1 &&
                    forwardMove.getEndPosition().getRow() <= 8 &&
                    forwardMove.getEndPosition().getColumn() >= 1 &&
                    forwardMove.getEndPosition().getColumn() <= 8){
                if(forwardMove.getStartPosition().getRow() == 7){
                    ChessMove doubleForwardMove = new ChessMoveClass();
                    doubleForwardMove.setStartPosition(myPosition);
                    doubleForwardMove.setEndPosition(new ChessPositionClass(
                            myPosition.getRow()-2, myPosition.getColumn()));
                    if(board.getPiece(doubleForwardMove.getEndPosition()) == null){
                        validMoveList.add(doubleForwardMove);
                    }
                }
                //if the pawn has reached the other side then it adds the promotion moves
                if(forwardMove.getEndPosition().getRow() == 1){
                    validMoveList.add(new ChessMoveClass(
                            forwardMove.getStartPosition(),
                            forwardMove.getEndPosition(), PieceType.QUEEN));
                    validMoveList.add(new ChessMoveClass(
                            forwardMove.getStartPosition(),
                            forwardMove.getEndPosition(), PieceType.BISHOP));
                    validMoveList.add(new ChessMoveClass(
                            forwardMove.getStartPosition(),
                            forwardMove.getEndPosition(), PieceType.KNIGHT));
                    validMoveList.add(new ChessMoveClass(
                            forwardMove.getStartPosition(),
                            forwardMove.getEndPosition(), PieceType.ROOK));
                }
                else{
                    validMoveList.add(forwardMove);
                }
            }

            positiveDiagonalMove.setStartPosition(myPosition);
            positiveDiagonalMove.setEndPosition(new ChessPositionClass(
                    myPosition.getRow()-1, myPosition.getColumn()+1));
            if(board.getPiece(positiveDiagonalMove.getEndPosition()) != null &&
                    this.getTeamColor() != board.getPiece(
                            positiveDiagonalMove.getEndPosition()).getTeamColor() &&
                    positiveDiagonalMove.getEndPosition().getRow() >= 1 &&
                    positiveDiagonalMove.getEndPosition().getRow() <= 8 &&
                    positiveDiagonalMove.getEndPosition().getColumn() >= 1 &&
                    positiveDiagonalMove.getEndPosition().getColumn() <= 8){
                if(positiveDiagonalMove.getEndPosition().getRow() == 1){
                    validMoveList.add(new ChessMoveClass(
                            positiveDiagonalMove.getStartPosition(),
                            positiveDiagonalMove.getEndPosition(), PieceType.QUEEN));
                    validMoveList.add(new ChessMoveClass(
                            positiveDiagonalMove.getStartPosition(),
                            positiveDiagonalMove.getEndPosition(), PieceType.BISHOP));
                    validMoveList.add(new ChessMoveClass(
                            positiveDiagonalMove.getStartPosition(),
                            positiveDiagonalMove.getEndPosition(), PieceType.KNIGHT));
                    validMoveList.add(new ChessMoveClass(
                            positiveDiagonalMove.getStartPosition(),
                            positiveDiagonalMove.getEndPosition(), PieceType.ROOK));
                }
                else{
                    validMoveList.add(positiveDiagonalMove);
                }
            }


            negativeDiagonalMove.setStartPosition(myPosition);
            negativeDiagonalMove.setEndPosition(new ChessPositionClass(
                    myPosition.getRow()-1, myPosition.getColumn()-1));
            if(board.getPiece(negativeDiagonalMove.getEndPosition()) != null &&
                    this.getTeamColor() != board.getPiece(
                            negativeDiagonalMove.getEndPosition()).getTeamColor() &&
                    negativeDiagonalMove.getEndPosition().getRow() >= 1 &&
                    negativeDiagonalMove.getEndPosition().getRow() <= 8 &&
                    negativeDiagonalMove.getEndPosition().getColumn() >= 1 &&
                    negativeDiagonalMove.getEndPosition().getColumn() <= 8){
                if(negativeDiagonalMove.getEndPosition().getRow() == 1){
                    validMoveList.add(new ChessMoveClass(
                            negativeDiagonalMove.getStartPosition(),
                            negativeDiagonalMove.getEndPosition(), PieceType.QUEEN));
                    validMoveList.add(new ChessMoveClass(
                            negativeDiagonalMove.getStartPosition(),
                            negativeDiagonalMove.getEndPosition(), PieceType.BISHOP));
                    validMoveList.add(new ChessMoveClass(
                            negativeDiagonalMove.getStartPosition(),
                            negativeDiagonalMove.getEndPosition(), PieceType.KNIGHT));
                    validMoveList.add(new ChessMoveClass(
                            negativeDiagonalMove.getStartPosition(),
                            negativeDiagonalMove.getEndPosition(), PieceType.ROOK));
                }
                else{
                    validMoveList.add(negativeDiagonalMove);
                }
            }
        }
        return validMoveList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PawnPiece pawnPiece = (PawnPiece) o;
        return pieceTeamColor == pawnPiece.pieceTeamColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceTeamColor);
    }
}
