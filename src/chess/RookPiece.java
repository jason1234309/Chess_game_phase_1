package chess;

import java.util.*;

public class RookPiece implements ChessPiece{
    public RookPiece(ChessGame.TeamColor color){
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
        return PieceType.ROOK;
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> validMoveList = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList1 = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList2 = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList3 = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList4 = new ArrayList<>();
        int maxMoveNumber = 7;
        for(int i = 0; i < maxMoveNumber; i++){
            possibleMoveList1.add(new ChessMoveClass());
            possibleMoveList1.get(i).setStartPosition(myPosition);
            possibleMoveList2.add(new ChessMoveClass());
            possibleMoveList2.get(i).setStartPosition(myPosition);
            possibleMoveList3.add(new ChessMoveClass());
            possibleMoveList3.get(i).setStartPosition(myPosition);
            possibleMoveList4.add(new ChessMoveClass());
            possibleMoveList4.get(i).setStartPosition(myPosition);
        }
        for(int i = 0; i < possibleMoveList1.size(); i++){
            possibleMoveList1.get(i).setEndPosition(
                    new ChessPositionClass(
                            myPosition.getRow()+i+1, myPosition.getColumn()));
        }
        for(int i = 0; i < possibleMoveList2.size(); i++){
            possibleMoveList2.get(i).setEndPosition(
                    new ChessPositionClass(
                            myPosition.getRow(), myPosition.getColumn()+i+1));
        }
        for(int i = 0; i < possibleMoveList3.size(); i++){
            possibleMoveList3.get(i).setEndPosition(
                    new ChessPositionClass(
                            myPosition.getRow()-i-1, myPosition.getColumn()));
        }
        for(int i = 0; i < possibleMoveList4.size(); i++){
            possibleMoveList4.get(i).setEndPosition(
                    new ChessPositionClass(
                            myPosition.getRow(), myPosition.getColumn()-i-1));
        }

        for(int i = 0; i < possibleMoveList1.size(); ++i){
            if(possibleMoveList1.get(i).getEndPosition().getRow() >= 1 &&
                    possibleMoveList1.get(i).getEndPosition().getRow() <= 8 &&
                    possibleMoveList1.get(i).getEndPosition().getColumn() >= 1 &&
                    possibleMoveList1.get(i).getEndPosition().getColumn() <= 8){
                if(board.getPiece(possibleMoveList1.get(i).getEndPosition()) == null){
                    validMoveList.add(possibleMoveList1.get(i));
                }
                else{
                    if(this.getTeamColor() !=
                            board.getPiece(possibleMoveList1.get(i).getEndPosition()).getTeamColor()){
                        validMoveList.add(possibleMoveList1.get(i));
                    }
                    break;
                }
            }
        }
        for(int i = 0; i < possibleMoveList2.size(); ++i){
            if(possibleMoveList2.get(i).getEndPosition().getRow() >= 1 &&
                    possibleMoveList2.get(i).getEndPosition().getRow() <= 8 &&
                    possibleMoveList2.get(i).getEndPosition().getColumn() >= 1 &&
                    possibleMoveList2.get(i).getEndPosition().getColumn() <= 8){
                if(board.getPiece(possibleMoveList2.get(i).getEndPosition()) == null){
                    validMoveList.add(possibleMoveList2.get(i));
                }
                else{
                    if(this.getTeamColor() !=
                            board.getPiece(possibleMoveList2.get(i).getEndPosition()).getTeamColor()){
                        validMoveList.add(possibleMoveList2.get(i));
                    }
                    break;
                }
            }
        }
        for(int i = 0; i < possibleMoveList3.size(); ++i){
            if(possibleMoveList3.get(i).getEndPosition().getRow() >= 1 &&
                    possibleMoveList3.get(i).getEndPosition().getRow() <= 8 &&
                    possibleMoveList3.get(i).getEndPosition().getColumn() >= 1 &&
                    possibleMoveList3.get(i).getEndPosition().getColumn() <= 8){
                if(board.getPiece(possibleMoveList3.get(i).getEndPosition()) == null){
                    validMoveList.add(possibleMoveList3.get(i));
                }
                else{
                    if(this.getTeamColor() !=
                            board.getPiece(possibleMoveList3.get(i).getEndPosition()).getTeamColor()){
                        validMoveList.add(possibleMoveList3.get(i));
                    }
                    break;
                }
            }
        }
        for(int i = 0; i < possibleMoveList4.size(); ++i){
            if(possibleMoveList4.get(i).getEndPosition().getRow() >= 1 &&
                    possibleMoveList4.get(i).getEndPosition().getRow() <= 8 &&
                    possibleMoveList4.get(i).getEndPosition().getColumn() >= 1 &&
                    possibleMoveList4.get(i).getEndPosition().getColumn() <= 8){
                if(board.getPiece(possibleMoveList4.get(i).getEndPosition()) == null){
                    validMoveList.add(possibleMoveList4.get(i));
                }
                else{
                    if(this.getTeamColor() !=
                            board.getPiece(possibleMoveList4.get(i).getEndPosition()).getTeamColor()){
                        validMoveList.add(possibleMoveList4.get(i));
                    }
                    break;
                }
            }
        }
        return validMoveList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RookPiece rookPiece = (RookPiece) o;
        return pieceTeamColor == rookPiece.pieceTeamColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceTeamColor);
    }
}
