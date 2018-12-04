package org.nmu.sa15.mozoleva.lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int row=3;
        int column=3;
        int[][] matrix = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                String s = reader.readLine();
                matrix[i][j] = Integer.parseInt(s);
            }
        }
        int summa=0;
        int minElement=matrix[0][0];
        int maxElement=matrix[0][0];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++) {
                if(minElement > matrix[i][j])
                    minElement=matrix[i][j];
                if(maxElement < matrix[i][j])
                    maxElement=matrix[i][j];
                summa+=matrix[i][j];
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("sum is "+summa+", min element is "+minElement+", max element is "+maxElement);
    }
}
