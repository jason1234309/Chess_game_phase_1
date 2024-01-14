package chess;

import java.util.*;

public class QueenPiece implements ChessPiece{
    public QueenPiece(ChessGame.TeamColor color){
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
    return PieceType.QUEEN;
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> validMoveList = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList1 = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList2 = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList3 = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList4 = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList5 = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList6 = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList7 = new ArrayList<>();
        ArrayList<ChessMove> possibleMoveList8 = new ArrayList<>();
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
            possibleMoveList5.add(new ChessMoveClass());
            possibleMoveList5.get(i).setStartPosition(myPosition);
            possibleMoveList6.add(new ChessMoveClass());
            possibleMoveList6.get(i).setStartPosition(myPosition);
            possibleMoveList7.add(new ChessMoveClass());
            possibleMoveList7.get(i).setStartPosition(myPosition);
            possibleMoveList8.add(new ChessMoveClass());
            possibleMoveList8.get(i).setStartPosition(myPosition);
        }
        for(int i = 0; i < possibleMoveList1.size(); i++){
            possibleMoveList1.get(i).setEndPosition(
                    new ChessPositionClass(myPosition.getRow()+i+1,
                            myPosition.getColumn()+i+1));
            possibleMoveList2.get(i).setEndPosition(
                    new ChessPositionClass(myPosition.getRow()+i+1,
                            myPosition.getColumn()-i-1));
            possibleMoveList3.get(i).setEndPosition(
                    new ChessPositionClass(myPosition.getRow()-i-1,
                            myPosition.getColumn()+i+1));
            possibleMoveList4.get(i).setEndPosition(
                    new ChessPositionClass(myPosition.getRow()-i-1,
                            myPosition.getColumn()-i-1));
        }
        for(int i = 0; i < possibleMoveList5.size(); i++){
            possibleMoveList5.get(i).setEndPosition(
                    new ChessPositionClass(
                            myPosition.getRow()+i+1, myPosition.getColumn()));
        }
        for(int i = 0; i < possibleMoveList6.size(); i++){
            possibleMoveList6.get(i).setEndPosition(
                    new ChessPositionClass(
                            myPosition.getRow(), myPosition.getColumn()+i+1));
        }
        for(int i = 0; i < possibleMoveList7.size(); i++){
            possibleMoveList7.get(i).setEndPosition(
                    new ChessPositionClass(
                            myPosition.getRow()-i-1, myPosition.getColumn()));
        }
        for(int i = 0; i < possibleMoveList8.size(); i++){
            possibleMoveList8.get(i).setEndPosition(
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
        for(int i = 0; i < possibleMoveList5.size(); ++i){
            if(possibleMoveList5.get(i).getEndPosition().getRow() >= 1 &&
                    possibleMoveList5.get(i).getEndPosition().getRow() <= 8 &&
                    possibleMoveList5.get(i).getEndPosition().getColumn() >= 1 &&
                    possibleMoveList5.get(i).getEndPosition().getColumn() <= 8){
                if(board.getPiece(possibleMoveList5.get(i).getEndPosition()) == null){
                    validMoveList.add(possibleMoveList5.get(i));
                }
                else{
                    if(this.getTeamColor() !=
                            board.getPiece(possibleMoveList5.get(i).getEndPosition()).getTeamColor()){
                        validMoveList.add(possibleMoveList5.get(i));
                    }
                    break;
                }
            }
        }
        for(int i = 0; i < possibleMoveList6.size(); ++i){
            if(possibleMoveList6.get(i).getEndPosition().getRow() >= 1 &&
                    possibleMoveList6.get(i).getEndPosition().getRow() <= 8 &&
                    possibleMoveList6.get(i).getEndPosition().getColumn() >= 1 &&
                    possibleMoveList6.get(i).getEndPosition().getColumn() <= 8){
                if(board.getPiece(possibleMoveList6.get(i).getEndPosition()) == null){
                    validMoveList.add(possibleMoveList6.get(i));
                }
                else{
                    if(this.getTeamColor() !=
                            board.getPiece(possibleMoveList6.get(i).getEndPosition()).getTeamColor()){
                        validMoveList.add(possibleMoveList6.get(i));
                    }
                    break;
                }
            }
        }
        for(int i = 0; i < possibleMoveList7.size(); ++i){
            if(possibleMoveList7.get(i).getEndPosition().getRow() >= 1 &&
                    possibleMoveList7.get(i).getEndPosition().getRow() <= 8 &&
                    possibleMoveList7.get(i).getEndPosition().getColumn() >= 1 &&
                    possibleMoveList7.get(i).getEndPosition().getColumn() <= 8){
                if(board.getPiece(possibleMoveList7.get(i).getEndPosition()) == null){
                    validMoveList.add(possibleMoveList7.get(i));
                }
                else{
                    if(this.getTeamColor() !=
                            board.getPiece(possibleMoveList7.get(i).getEndPosition()).getTeamColor()){
                        validMoveList.add(possibleMoveList7.get(i));
                    }
                    break;
                }
            }
        }
        for(int i = 0; i < possibleMoveList8.size(); ++i){
            if(possibleMoveList8.get(i).getEndPosition().getRow() >= 1 &&
                    possibleMoveList8.get(i).getEndPosition().getRow() <= 8 &&
                    possibleMoveList8.get(i).getEndPosition().getColumn() >= 1 &&
                    possibleMoveList8.get(i).getEndPosition().getColumn() <= 8){
                if(board.getPiece(possibleMoveList8.get(i).getEndPosition()) == null){
                    validMoveList.add(possibleMoveList8.get(i));
                }
                else{
                    if(this.getTeamColor() !=
                            board.getPiece(possibleMoveList8.get(i).getEndPosition()).getTeamColor()){
                        validMoveList.add(possibleMoveList8.get(i));
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
        QueenPiece that = (QueenPiece) o;
        return pieceTeamColor == that.pieceTeamColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceTeamColor);
    }
}
