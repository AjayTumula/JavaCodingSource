package org.example.array;

public class DemoOfSelectionSort {
    public static void main(String[] args) {
        SelectionSort ss= new SelectionSort();
        ss.getData();
        System.out.println("Unsorted Array");
        ss.putData();
        System.out.println("Sorted Array");
        ss.sort();
        ss.putData();
    }
}
