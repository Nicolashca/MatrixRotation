package org.example;

import java.util.Arrays;

public class Matrix {

    private int n;
    private int m;
    int[][] matrix;

    public Matrix(int n,int m) {
        this.n = n;
        this.m = m;
        this.matrix = new int[n][m];

        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = counter++;

            }
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    enum RotateType {
        LEFT,
        RIGHT
    }

    public int[][] rotateMatrix(RotateType type) {
        var rows = matrix[0].length;
        var columns = matrix.length;
        var result = new int[rows][columns];
        for (var i = 0; i < rows; i++) {
            for (var j = 0; j < columns; j++) {
                result[i][j] = (type == RotateType.LEFT) ?
                        matrix[j][rows - 1 - i] : matrix[columns - 1 - j][i];
            }
        }
        return result;
    }

    public void print(int[][] matrix) {
        var rows = matrix[0].length;
        var columns = matrix.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



