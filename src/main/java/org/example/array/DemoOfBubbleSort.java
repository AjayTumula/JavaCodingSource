package org.example.array;

public class DemoOfBubbleSort {
    public static void main(String[] args) {
        BubbleSort bs= new BubbleSort();
        bs.getData();
        System.out.println("Unsorted Array:");
        bs.putData();
        System.out.println("Sorted Array:");
        bs.sort();
        bs.putData();
    }
}
