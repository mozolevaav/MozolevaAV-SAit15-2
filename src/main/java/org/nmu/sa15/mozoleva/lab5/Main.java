package org.nmu.sa15.mozoleva.lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\t.txt";
        MatrixManager matrixManager = new MatrixManager();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of row: ");
        int numberOfRow = Integer.parseInt(reader.readLine());
        System.out.print("Enter number of column: ");
        int numberOfColumn = Integer.parseInt(reader.readLine());
        System.out.println("Enter matrix elements:");
        Matrix matrix = matrixManager.createMatrix(numberOfRow, numberOfColumn);

        MatrixWriteReader matrixWriteRead = new MatrixWriteReader();
        matrixWriteRead.write(matrix, filePath);
        Matrix matrixFromFIle = matrixWriteRead.read(filePath);

        matrixManager.displayMatrix(matrixFromFIle);
        System.out.println("sum is " + matrixManager.calculateMatrixSumOfElements(matrixFromFIle) +
                ", min element is " + matrixManager.findMatrixMinimum(matrixFromFIle) +
                ", max element is " + matrixManager.findMatrixMaximum(matrixFromFIle));
    }
}
