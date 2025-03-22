package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
         this.array = array;
    }
    // компилятор видел только переменную в методе. Добавил this чтобы была работа с полем.

    public void print() {
        for (int index : array) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
