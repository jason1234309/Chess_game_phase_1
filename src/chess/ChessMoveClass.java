package chess;

import java.util.Objects;

public class ChessMoveClass implements ChessMove{
    public ChessMoveClass(){
        startingPosition = null;
        endingPosition = null;
        promotionPieceVal = null;
    }
    public ChessMoveClass(ChessPosition start, ChessPosition end,ChessPiece.PieceType promotionPiece){
        startingPosition = start;
        endingPosition = end;
        promotionPieceVal = promotionPiece;
    }
    ChessPosition startingPosition = new ChessPositionClass(-1,-1);
    ChessPosition endingPosition =  new ChessPositionClass(-1,-1);
    ChessPiece.PieceType promotionPieceVal;

    @Override
    public ChessPosition getStartPosition() {
        return startingPosition;
    }

    @Override
    public ChessPosition getEndPosition() {
        return endingPosition;
    }

    @Override
    public void setEndPosition(ChessPosition newPosition) {
        endingPosition = newPosition;
    }

    @Override
    public void setStartPosition(ChessPosition myPosition) {
        startingPosition = myPosition;
    }

    @Override
    public ChessPiece.PieceType getPromotionPiece() {
        return promotionPieceVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessMoveClass that = (ChessMoveClass) o;
        return Objects.equals(startingPosition, that.startingPosition) && Objects.equals(endingPosition, that.endingPosition) && promotionPieceVal == that.promotionPieceVal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(startingPosition, endingPosition, promotionPieceVal);
    }
}

