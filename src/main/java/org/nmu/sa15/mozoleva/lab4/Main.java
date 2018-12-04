package org.nmu.sa15.mozoleva.lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        MatrixManager matrixManager = new MatrixManager();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of row: ");
        int numberOfRow = Integer.parseInt(reader.readLine());
        System.out.print("Enter number of column: ");
        int numberOfColumn = Integer.parseInt(reader.readLine());
        System.out.println("Enter matrix elements:");
        Matrix matrix = matrixManager.createMatrix(numberOfRow, numberOfColumn);
        matrixManager.displayMatrix(matrix);
        System.out.println("sum is " + matrixManager.calculateMatrixSumOfElements(matrix) +
                ", min element is " + matrixManager.findMatrixMinimum(matrix) +
                ", max element is " + matrixManager.findMatrixMaximum(matrix));
    }
}
