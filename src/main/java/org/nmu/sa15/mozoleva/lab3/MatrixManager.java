package org.nmu.sa15.mozoleva.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixManager {

    public Matrix createMatrix(int row, int column) throws IOException {
        Matrix matrix = new Matrix();
        matrix.setColumn(column);
        matrix.setRow(row);
        int[][] matrixData = new int[row][column];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //final Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                String s = reader.readLine();
                matrixData[i][j] = Integer.parseInt(s);
                //matrix[i][j] = random.nextInt(10);
            }
        }
        matrix.setMatrixBody(matrixData);
        return matrix;
    }

    public int calculateMatrixSumOfElements(Matrix matrix) {
        int summa = 0;
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                summa += matrix.getMatrixBody()[i][j];
            }
        }
        return summa;
    }

    public int findMatrixMinimum(Matrix matrix) {
        int minElement = matrix.getMatrixBody()[0][0];
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                int tmpMinElement = matrix.getMatrixBody()[i][j];
                if (minElement > tmpMinElement)
                    minElement = tmpMinElement;
            }
        }
        return minElement;
    }

    public int findMatrixMaximum(Matrix matrix) {
        int maxElement = matrix.getMatrixBody()[0][0];
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                int tmpMaxElement = matrix.getMatrixBody()[i][j];
                if (maxElement < tmpMaxElement)
                    maxElement = tmpMaxElement;
            }
        }
        return maxElement;
    }

    public void displayMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                System.out.print(matrix.getMatrixBody()[i][j] + " ");
            }
            System.out.println();
        }
    }
}
