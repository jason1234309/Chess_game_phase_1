package chess;

import java.util.*;

public class ChessBoardClass implements ChessBoard{
    Map<ChessPosition,ChessPiece> chessBoardMap = new HashMap<>();
    KingPiece blackKing = new KingPiece(ChessGame.TeamColor.BLACK);
    QueenPiece blackQueen = new QueenPiece(ChessGame.TeamColor.BLACK);
    BishopPiece blackBishopLeft = new BishopPiece(ChessGame.TeamColor.BLACK);
    BishopPiece blackBishopRight = new BishopPiece(ChessGame.TeamColor.BLACK);
    KnightPiece blackKnightLeft = new KnightPiece(ChessGame.TeamColor.BLACK);
    KnightPiece blackKnightRight = new KnightPiece(ChessGame.TeamColor.BLACK);
    RookPiece blackRookLeft = new RookPiece(ChessGame.TeamColor.BLACK);
    RookPiece blackRookRight = new RookPiece(ChessGame.TeamColor.BLACK);
    PawnPiece blackPawn1 = new PawnPiece(ChessGame.TeamColor.BLACK);
    PawnPiece blackPawn2 = new PawnPiece(ChessGame.TeamColor.BLACK);
    PawnPiece blackPawn3 = new PawnPiece(ChessGame.TeamColor.BLACK);
    PawnPiece blackPawn4 = new PawnPiece(ChessGame.TeamColor.BLACK);
    PawnPiece blackPawn5 = new PawnPiece(ChessGame.TeamColor.BLACK);
    PawnPiece blackPawn6 = new PawnPiece(ChessGame.TeamColor.BLACK);
    PawnPiece blackPawn7 = new PawnPiece(ChessGame.TeamColor.BLACK);
    PawnPiece blackPawn8 = new PawnPiece(ChessGame.TeamColor.BLACK);

    KingPiece whiteKing = new KingPiece(ChessGame.TeamColor.WHITE);
    QueenPiece whiteQueen = new QueenPiece(ChessGame.TeamColor.WHITE);
    BishopPiece whiteBishopLeft = new BishopPiece(ChessGame.TeamColor.WHITE);
    BishopPiece whiteBishopRight = new BishopPiece(ChessGame.TeamColor.WHITE);
    KnightPiece whiteKnightLeft = new KnightPiece(ChessGame.TeamColor.WHITE);
    KnightPiece whiteKnightRight = new KnightPiece(ChessGame.TeamColor.WHITE);
    RookPiece whiteRookLeft = new RookPiece(ChessGame.TeamColor.WHITE);
    RookPiece whiteRookRight = new RookPiece(ChessGame.TeamColor.WHITE);
    PawnPiece whitePawn1 = new PawnPiece(ChessGame.TeamColor.WHITE);
    PawnPiece whitePawn2 = new PawnPiece(ChessGame.TeamColor.WHITE);
    PawnPiece whitePawn3 = new PawnPiece(ChessGame.TeamColor.WHITE);
    PawnPiece whitePawn4 = new PawnPiece(ChessGame.TeamColor.WHITE);
    PawnPiece whitePawn5 = new PawnPiece(ChessGame.TeamColor.WHITE);
    PawnPiece whitePawn6 = new PawnPiece(ChessGame.TeamColor.WHITE);
    PawnPiece whitePawn7 = new PawnPiece(ChessGame.TeamColor.WHITE);
    PawnPiece whitePawn8 = new PawnPiece(ChessGame.TeamColor.WHITE);

    ChessPosition position1_1 = new ChessPositionClass(1,1);
    ChessPosition position1_2 = new ChessPositionClass(1,2);
    ChessPosition position1_3 = new ChessPositionClass(1,3);
    ChessPosition position1_4 = new ChessPositionClass(1,4);
    ChessPosition position1_5 = new ChessPositionClass(1,5);
    ChessPosition position1_6 = new ChessPositionClass(1,6);
    ChessPosition position1_7 = new ChessPositionClass(1,7);
    ChessPosition position1_8 = new ChessPositionClass(1,8);

    ChessPosition position2_1 = new ChessPositionClass(2,1);
    ChessPosition position2_2 = new ChessPositionClass(2,2);
    ChessPosition position2_3 = new ChessPositionClass(2,3);
    ChessPosition position2_4 = new ChessPositionClass(2,4);
    ChessPosition position2_5 = new ChessPositionClass(2,5);
    ChessPosition position2_6 = new ChessPositionClass(2,6);
    ChessPosition position2_7 = new ChessPositionClass(2,7);
    ChessPosition position2_8 = new ChessPositionClass(2,8);

    ChessPosition position3_1 = new ChessPositionClass(3,1);
    ChessPosition position3_2 = new ChessPositionClass(3,2);
    ChessPosition position3_3 = new ChessPositionClass(3,3);
    ChessPosition position3_4 = new ChessPositionClass(3,4);
    ChessPosition position3_5 = new ChessPositionClass(3,5);
    ChessPosition position3_6 = new ChessPositionClass(3,6);
    ChessPosition position3_7 = new ChessPositionClass(3,7);
    ChessPosition position3_8 = new ChessPositionClass(3,8);

    ChessPosition position4_1 = new ChessPositionClass(4,1);
    ChessPosition position4_2 = new ChessPositionClass(4,2);
    ChessPosition position4_3 = new ChessPositionClass(4,3);
    ChessPosition position4_4 = new ChessPositionClass(4,4);
    ChessPosition position4_5 = new ChessPositionClass(4,5);
    ChessPosition position4_6 = new ChessPositionClass(4,6);
    ChessPosition position4_7 = new ChessPositionClass(4,7);
    ChessPosition position4_8 = new ChessPositionClass(4,8);

    ChessPosition position5_1 = new ChessPositionClass(5,1);
    ChessPosition position5_2 = new ChessPositionClass(5,2);
    ChessPosition position5_3 = new ChessPositionClass(5,3);
    ChessPosition position5_4 = new ChessPositionClass(5,4);
    ChessPosition position5_5 = new ChessPositionClass(5,5);
    ChessPosition position5_6 = new ChessPositionClass(5,6);
    ChessPosition position5_7 = new ChessPositionClass(5,7);
    ChessPosition position5_8 = new ChessPositionClass(5,8);

    ChessPosition position6_1 = new ChessPositionClass(6,1);
    ChessPosition position6_2 = new ChessPositionClass(6,2);
    ChessPosition position6_3 = new ChessPositionClass(6,3);
    ChessPosition position6_4 = new ChessPositionClass(6,4);
    ChessPosition position6_5 = new ChessPositionClass(6,5);
    ChessPosition position6_6 = new ChessPositionClass(6,6);
    ChessPosition position6_7 = new ChessPositionClass(6,7);
    ChessPosition position6_8 = new ChessPositionClass(6,8);

    ChessPosition position7_1 = new ChessPositionClass(7,1);
    ChessPosition position7_2 = new ChessPositionClass(7,2);
    ChessPosition position7_3 = new ChessPositionClass(7,3);
    ChessPosition position7_4 = new ChessPositionClass(7,4);
    ChessPosition position7_5 = new ChessPositionClass(7,5);
    ChessPosition position7_6 = new ChessPositionClass(7,6);
    ChessPosition position7_7 = new ChessPositionClass(7,7);
    ChessPosition position7_8 = new ChessPositionClass(7,8);

    ChessPosition position8_1 = new ChessPositionClass(8,1);
    ChessPosition position8_2 = new ChessPositionClass(8,2);
    ChessPosition position8_3 = new ChessPositionClass(8,3);
    ChessPosition position8_4 = new ChessPositionClass(8,4);
    ChessPosition position8_5 = new ChessPositionClass(8,5);
    ChessPosition position8_6 = new ChessPositionClass(8,6);
    ChessPosition position8_7 = new ChessPositionClass(8,7);
    ChessPosition position8_8 = new ChessPositionClass(8,8);


    @Override
    public void addPiece(ChessPosition position, ChessPiece piece) {

        chessBoardMap.put(position, piece);
    }

    @Override
    public void removePiece(ChessPosition position) {
        chessBoardMap.remove(position);
    }

    @Override
    public ChessPiece getPiece(ChessPosition position) {
        return chessBoardMap.get(position);
    }

    @Override
    public void resetBoard() {
        chessBoardMap.clear();
        addPiece(position1_1, whiteRookLeft);
        addPiece(position1_2, whiteKnightLeft);
        addPiece(position1_3, whiteBishopLeft);
        addPiece(position1_4, whiteQueen);
        addPiece(position1_5, whiteKing);
        addPiece(position1_6, whiteBishopRight);
        addPiece(position1_7, whiteKnightRight);
        addPiece(position1_8, whiteRookRight);

        addPiece(position2_1, whitePawn1);
        addPiece(position2_2, whitePawn2);
        addPiece(position2_3, whitePawn3);
        addPiece(position2_4, whitePawn4);
        addPiece(position2_5, whitePawn5);
        addPiece(position2_6, whitePawn6);
        addPiece(position2_7, whitePawn7);
        addPiece(position2_8, whitePawn8);

        addPiece(position8_1, blackRookLeft);
        addPiece(position8_2, blackKnightLeft);
        addPiece(position8_3, blackBishopLeft);
        addPiece(position8_4, blackQueen);
        addPiece(position8_5, blackKing);
        addPiece(position8_6, blackBishopRight);
        addPiece(position8_7, blackKnightRight);
        addPiece(position8_8, blackRookRight);

        addPiece(position7_1, blackPawn1);
        addPiece(position7_2, blackPawn2);
        addPiece(position7_3, blackPawn3);
        addPiece(position7_4, blackPawn4);
        addPiece(position7_5, blackPawn5);
        addPiece(position7_6, blackPawn6);
        addPiece(position7_7, blackPawn7);
        addPiece(position7_8, blackPawn8);
    }

    @Override
    public int getNumPieces() {
        return chessBoardMap.size();
    }
    public Map<ChessPosition, ChessPiece> getChessBoardMap(){
        return chessBoardMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessBoardClass that = (ChessBoardClass) o;
        return Objects.equals(chessBoardMap, that.chessBoardMap) && Objects.equals(blackKing, that.blackKing) && Objects.equals(blackQueen, that.blackQueen) && Objects.equals(blackBishopLeft, that.blackBishopLeft) && Objects.equals(blackBishopRight, that.blackBishopRight) && Objects.equals(blackKnightLeft, that.blackKnightLeft) && Objects.equals(blackKnightRight, that.blackKnightRight) && Objects.equals(blackRookLeft, that.blackRookLeft) && Objects.equals(blackRookRight, that.blackRookRight) && Objects.equals(blackPawn1, that.blackPawn1) && Objects.equals(blackPawn2, that.blackPawn2) && Objects.equals(blackPawn3, that.blackPawn3) && Objects.equals(blackPawn4, that.blackPawn4) && Objects.equals(blackPawn5, that.blackPawn5) && Objects.equals(blackPawn6, that.blackPawn6) && Objects.equals(blackPawn7, that.blackPawn7) && Objects.equals(blackPawn8, that.blackPawn8) && Objects.equals(whiteKing, that.whiteKing) && Objects.equals(whiteQueen, that.whiteQueen) && Objects.equals(whiteBishopLeft, that.whiteBishopLeft) && Objects.equals(whiteBishopRight, that.whiteBishopRight) && Objects.equals(whiteKnightLeft, that.whiteKnightLeft) && Objects.equals(whiteKnightRight, that.whiteKnightRight) && Objects.equals(whiteRookLeft, that.whiteRookLeft) && Objects.equals(whiteRookRight, that.whiteRookRight) && Objects.equals(whitePawn1, that.whitePawn1) && Objects.equals(whitePawn2, that.whitePawn2) && Objects.equals(whitePawn3, that.whitePawn3) && Objects.equals(whitePawn4, that.whitePawn4) && Objects.equals(whitePawn5, that.whitePawn5) && Objects.equals(whitePawn6, that.whitePawn6) && Objects.equals(whitePawn7, that.whitePawn7) && Objects.equals(whitePawn8, that.whitePawn8) && Objects.equals(position1_1, that.position1_1) && Objects.equals(position1_2, that.position1_2) && Objects.equals(position1_3, that.position1_3) && Objects.equals(position1_4, that.position1_4) && Objects.equals(position1_5, that.position1_5) && Objects.equals(position1_6, that.position1_6) && Objects.equals(position1_7, that.position1_7) && Objects.equals(position1_8, that.position1_8) && Objects.equals(position2_1, that.position2_1) && Objects.equals(position2_2, that.position2_2) && Objects.equals(position2_3, that.position2_3) && Objects.equals(position2_4, that.position2_4) && Objects.equals(position2_5, that.position2_5) && Objects.equals(position2_6, that.position2_6) && Objects.equals(position2_7, that.position2_7) && Objects.equals(position2_8, that.position2_8) && Objects.equals(position3_1, that.position3_1) && Objects.equals(position3_2, that.position3_2) && Objects.equals(position3_3, that.position3_3) && Objects.equals(position3_4, that.position3_4) && Objects.equals(position3_5, that.position3_5) && Objects.equals(position3_6, that.position3_6) && Objects.equals(position3_7, that.position3_7) && Objects.equals(position3_8, that.position3_8) && Objects.equals(position4_1, that.position4_1) && Objects.equals(position4_2, that.position4_2) && Objects.equals(position4_3, that.position4_3) && Objects.equals(position4_4, that.position4_4) && Objects.equals(position4_5, that.position4_5) && Objects.equals(position4_6, that.position4_6) && Objects.equals(position4_7, that.position4_7) && Objects.equals(position4_8, that.position4_8) && Objects.equals(position5_1, that.position5_1) && Objects.equals(position5_2, that.position5_2) && Objects.equals(position5_3, that.position5_3) && Objects.equals(position5_4, that.position5_4) && Objects.equals(position5_5, that.position5_5) && Objects.equals(position5_6, that.position5_6) && Objects.equals(position5_7, that.position5_7) && Objects.equals(position5_8, that.position5_8) && Objects.equals(position6_1, that.position6_1) && Objects.equals(position6_2, that.position6_2) && Objects.equals(position6_3, that.position6_3) && Objects.equals(position6_4, that.position6_4) && Objects.equals(position6_5, that.position6_5) && Objects.equals(position6_6, that.position6_6) && Objects.equals(position6_7, that.position6_7) && Objects.equals(position6_8, that.position6_8) && Objects.equals(position7_1, that.position7_1) && Objects.equals(position7_2, that.position7_2) && Objects.equals(position7_3, that.position7_3) && Objects.equals(position7_4, that.position7_4) && Objects.equals(position7_5, that.position7_5) && Objects.equals(position7_6, that.position7_6) && Objects.equals(position7_7, that.position7_7) && Objects.equals(position7_8, that.position7_8) && Objects.equals(position8_1, that.position8_1) && Objects.equals(position8_2, that.position8_2) && Objects.equals(position8_3, that.position8_3) && Objects.equals(position8_4, that.position8_4) && Objects.equals(position8_5, that.position8_5) && Objects.equals(position8_6, that.position8_6) && Objects.equals(position8_7, that.position8_7) && Objects.equals(position8_8, that.position8_8);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chessBoardMap, blackKing, blackQueen, blackBishopLeft, blackBishopRight, blackKnightLeft, blackKnightRight, blackRookLeft, blackRookRight, blackPawn1, blackPawn2, blackPawn3, blackPawn4, blackPawn5, blackPawn6, blackPawn7, blackPawn8, whiteKing, whiteQueen, whiteBishopLeft, whiteBishopRight, whiteKnightLeft, whiteKnightRight, whiteRookLeft, whiteRookRight, whitePawn1, whitePawn2, whitePawn3, whitePawn4, whitePawn5, whitePawn6, whitePawn7, whitePawn8, position1_1, position1_2, position1_3, position1_4, position1_5, position1_6, position1_7, position1_8, position2_1, position2_2, position2_3, position2_4, position2_5, position2_6, position2_7, position2_8, position3_1, position3_2, position3_3, position3_4, position3_5, position3_6, position3_7, position3_8, position4_1, position4_2, position4_3, position4_4, position4_5, position4_6, position4_7, position4_8, position5_1, position5_2, position5_3, position5_4, position5_5, position5_6, position5_7, position5_8, position6_1, position6_2, position6_3, position6_4, position6_5, position6_6, position6_7, position6_8, position7_1, position7_2, position7_3, position7_4, position7_5, position7_6, position7_7, position7_8, position8_1, position8_2, position8_3, position8_4, position8_5, position8_6, position8_7, position8_8);
    }
}
