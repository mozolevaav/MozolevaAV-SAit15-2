package org.nmu.sa15.mozoleva.lab5;

import com.google.gson.Gson;

import java.io.*;

public class MatrixWriteReader {
    private Gson gson = new Gson();

    public void write(Matrix matrix, String filePath) {
        try {
            Writer writer = new FileWriter(filePath);
            gson.toJson(matrix, writer);
            writer.flush();
        } catch (Exception e) {
            System.out.println("File path is not correct");
        }
    }

    public Matrix read(String filePath) {
        Matrix matrix = new Matrix();
        try {
            matrix = gson.fromJson(new FileReader(filePath), Matrix.class);
        } catch (Exception e) {
            System.out.println("File not found");
        }
        return matrix;
    }
}
