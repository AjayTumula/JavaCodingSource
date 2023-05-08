package org.example.array;

public class DemoOfInsertionSort {
    public static void main(String[] args) {
        InsertionSort is= new InsertionSort();
        is.getData();
        System.out.println("unsorted array:");
        is.putData();
        System.out.println("sorted array:");
        is.sort();
        is.putData();
    }
}
