package org.nmu.sa15.mozoleva.lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MatrixManager {

    public Matrix createMatrix(int row, int column) throws IOException {
        Matrix matrix = new Matrix();
        matrix.setColumn(column);
        matrix.setRow(row);
        List<List<Integer>> listData = new ArrayList<List<Integer>>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < matrix.getRow(); i++) {
            listData.add(new ArrayList<Integer>());
            for (int j = 0; j < matrix.getColumn(); j++) {
                listData.get(i).add(Integer.parseInt(reader.readLine()));
            }
        }
        matrix.setList(listData);
        return matrix;
    }

    public int calculateMatrixSumOfElements(Matrix matrix) {
        int summa = 0;
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                summa += matrix.getList().get(i).get(j);
            }
        }
        return summa;
    }

    public int findMatrixMinimum(Matrix matrix) {
        int minElement = matrix.getList().get(0).get(0);
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                int tmpMinElement = matrix.getList().get(i).get(j);
                if (minElement > tmpMinElement)
                    minElement = tmpMinElement;
            }
        }
        return minElement;
    }

    public int findMatrixMaximum(Matrix matrix) {
        int maxElement = matrix.getList().get(0).get(0);
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                int tmpMaxElement = matrix.getList().get(i).get(j);
                if (maxElement < tmpMaxElement)
                    maxElement = tmpMaxElement;
            }
        }
        return maxElement;
    }

    public void displayMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                System.out.print(matrix.getList().get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
