package chess;

import java.util.Objects;

public class ChessPositionClass implements ChessPosition{
    public ChessPositionClass(int row, int column){
        rowInt = row;
        columnInt = column;
    }
    private int rowInt = 0;
    private int columnInt = 0;
    @Override
    public int getRow() {
        return rowInt;
    }

    @Override
    public int getColumn() {
        return columnInt;
    }
    @Override
    public void setRow(int row) {
        rowInt = row;
    }

    @Override
    public void setColumn(int column) {
        columnInt = column;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        else if(o.getClass() != this.getClass()){
            return false;
        }
        else if(((ChessPositionClass) o).getRow() != this.getRow()){
            return false;
        }
        else if(((ChessPositionClass) o).getColumn() != this.getColumn()){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowInt, columnInt);
    }
}
