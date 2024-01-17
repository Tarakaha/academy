package by.academy.homework4.task3;

import java.util.Arrays;

public class GenericArray<T> {
        private T[] array;
        private int current;

        public GenericArray() {
            super();
            this.array = (T[]) new Object[16];
        }

        public GenericArray(int size) {
            this.array = (T[]) new Object[size];
        }

        public void add(T element) {
            if (array == null) {
                this.array = (T[]) new Object[10];
            }
            if (array.length <= current) {
                grow();
            }
            array[current++] = element;
        }

        public void grow() {
            T[] temp = (T[]) new Object[array.length * 2 + 1];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }

        public void getElement(int i) {
            if (i >= this.current || i < 0) {
                System.out.println("Элемента с таким индексом не существует.");
            } else {
                System.out.println(array[i]);
            }
        }

        public T getLastElement() {
            return (T) array[current - 1];
        }

        public T getFirstElement() {
            return (T) array[0];
        }

        public int indexOfLastElement() {
            return current - 1;
        }
        public void removeElement(int i) {
            if (i >= this.current || i < 0) {
                System.out.println("Удаление невозможно");
                return;
            }
            if (i != array.length - 1) {
                System.arraycopy(array, i + 1, array, i, array.length - i - 1);
            }
            array[--current] = null;
        }

        public void removeObjElement(T obj) {
            for (int i = 0; i < this.current; i++) {
                if (array[i].equals(obj)) {
                    System.arraycopy(array, i + 1, array, i, array.length - i - 1);
                    array[--current] = null;
                    return;
                }
            }
            System.out.println("Данный объект отсутствует в массиве");
        }

        @Override
        public String toString() {
            return "Первый элемент массива: " + (T) array[0] +
                    "\nПоследний элемент массива: " + (T) array[current - 1] +
                    "\nЗаполненность массива: " + current + " из: " + array.length;
        }
    }