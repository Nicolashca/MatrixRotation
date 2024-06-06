package org.example;


public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,3);
        matrix.print();

        System.out.println();
        System.out.println();

        int[][] rotateLeft = matrix.rotateMatrix( Matrix.RotateType.LEFT);
        matrix.print(rotateLeft);
        System.out.println();
        System.out.println();


        int[][] rotateRight = matrix.rotateMatrix(Matrix.RotateType.RIGHT);
        matrix.print(rotateRight);



    }
}



