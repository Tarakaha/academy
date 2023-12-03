package by.academy.lesson9.homework.telegram.task3;


import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    double[][] numbers;
    int columns;
    int lines;
    static Scanner scanner = new Scanner(System.in);

    public Matrix(int lines, int columns) {
        this.lines = lines;
        this.columns = columns;
        this.numbers = new double[lines][columns];
    }

    public void fillInTheMatrix() {


        int count = 1;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                do {
                    System.out.println("Введите число #" + count + ":");

                    try {
                        String num = scanner.next();
                        double numb = Double.parseDouble(num);
                        numbers[i][j] = numb;
                        count++;
                        break;
                    } catch (NumberFormatException n) {
                        System.out.println("Нужно ввести цифру!!!");
                    }
                } while (true);
            }
        }
    }

    Matrix sumMatrix(Matrix b) {
        if (this.getNumbers().length != b.getNumbers().length) {
            System.out.println("Работать можно только с матрицами одной размерности!");
            scanner.close();
            System.exit(0);
        }
        Matrix newMatrix = new Matrix(this.lines, this.columns);
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                newMatrix.numbers[i][j] = this.numbers[i][j] + b.numbers[i][j];
            }
        }
        return newMatrix;
    }

    Matrix multiplyWithNum(double num) { // С сохранением старой матрицы
        Matrix newMatrix = new Matrix(this.lines, this.columns);
        for (int i = 0; i <lines; i++) {
            for (int j = 0; j < columns; j++) {
                newMatrix.numbers[i][j] = this.numbers[i][j] * num;
            }
        }
        return newMatrix;
    }
    void multiplyWithNumber(double num) { // С замещением старой матрицы
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                this.numbers[i][j] *= num;
            }
        }
    }

    void print() {
        System.out.println("Матрица " + this);
        for (int i = 0; i <lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(this.numbers[i][j] + "    ");

            }
            System.out.println();
        }
    }

    Matrix multiplyWith(Matrix b) {
        if (this.getNumbers().length != b.getNumbers().length) {
            System.out.println("Работать можно только с матрицами одной размерности!");
            scanner.close();
            System.exit(0);
        }
        Matrix newMatrix = new Matrix(this.lines, this.columns);
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    newMatrix.numbers[i][j] += this.numbers[i][k] * b.numbers[k][j];
                }
            }
        }

        return newMatrix;
    }


    public double[][] getNumbers() {
        return numbers;
    }

    public void setNumbers(double[][] numbers) {
        this.numbers = numbers;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix = (Matrix) o;

        if (columns != matrix.columns) return false;
        if (lines != matrix.lines) return false;
        return Arrays.deepEquals(numbers, matrix.numbers);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(numbers);
        result = 31 * result + columns;
        result = 31 * result + lines;
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "numbers=" + Arrays.deepToString(numbers) +
                ", columns=" + columns +
                ", lines=" + lines +
                '}';
    }
}
