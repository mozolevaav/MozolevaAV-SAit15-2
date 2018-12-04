package org.nmu.sa15.mozoleva.lab5;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MatrixWriteReaderTest {
    private final static int ROW = 2;
    private final static int COLUMN = 2;
    private static final String FILE_PATH = "E:\\test.txt";
    private static Matrix matrix;
    private static MatrixWriteReader matrixWriteRead;

    private static Matrix createBaseMatrix() {
        Matrix matrix = new Matrix();
        matrix.setRow(ROW);
        matrix.setColumn(COLUMN);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int count = 1;
        for (int i = 0; i < ROW; i++) {
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < COLUMN; j++) {
                list.get(i).add(count);
                count++;
            }
        }
        matrix.setList(list);
        return matrix;
    }

    @BeforeClass
    public static void init() {
        matrix = createBaseMatrix();
        matrixWriteRead = new MatrixWriteReader();
        matrixWriteRead.write(matrix, FILE_PATH);
    }

    @Test
    public void write() throws IOException {
        BufferedReader fin = new BufferedReader(new FileReader(FILE_PATH));
        List<String> listFromFile = new ArrayList<String>();
        List<String> expectedList = new ArrayList<String>();
        expectedList.add("{\"row\":2,\"column\":2,\"list\":[[1,2],[3,4]],\"Author\":\"Mozoleva\"}");
        String line;
        while ((line = fin.readLine()) != null) {
            listFromFile.add(line);
        }
        assertEquals(expectedList, listFromFile);
    }

    @Test
    public void readAndWrite() throws IOException {
        Matrix matrixFromFIle = matrixWriteRead.read(FILE_PATH);
        assertEquals(matrix, matrixFromFIle);
    }
}