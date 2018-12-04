package org.nmu.sa15.mozoleva.lab4;

import java.util.List;

public class Matrix {
    private int row;
    private int column;
    private List<List<Integer>> list;
    String Author = "Mozoleva";

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setList(List<List<Integer>> list) {
        this.list = list;
    }

    public List<List<Integer>> getList() {
        return list;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
