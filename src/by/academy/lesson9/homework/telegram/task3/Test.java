package by.academy.lesson9.homework.telegram.task3;
/** 3. Создать класс "Матрица". Класс должен иметь следующие поля:
 1) двумерный массив вещественных чисел;
 2) количество строк и столбцов в матрице.

 Класс должен иметь следующие методы:
 1) сложение с другой матрицей; +++
 2) умножение на число;
 3) вывод на печать;
 4) умножение матриц - по желанию. */

// Вопросы: 1. Где закрывать сканер?
//          2. При умножении на число итогом должна быть новая матрица, или замещение старой матрицы результатом умножения?

public class Test {
    public static void main(String[] args) {
        Matrix a = new Matrix(2,2);
        a.fillInTheMatrix();
        a.print();

        Matrix b = new Matrix(2,2);
        b.fillInTheMatrix();
        b.print();

        Matrix c = a.multiplyWith(b);
        c.print();

        Matrix.scanner.close();
    }
}
