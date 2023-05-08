package org.example.array;

import java.util.ArrayList;
import java.util.List;

public class StringArray {
    public String[] testStringArray(){
        String[] sArray = {"hi", "hello", "how", "are", "you"};
        for(String str : sArray) {
            System.out.println(str);
        }

        int a[] = new int[10];

        int[] b = {1, 2, 3, 4, 5, 6};
        for(int i: b) {
            System.out.println(i);
        }

        List<User> strList = new ArrayList<>();
        strList.add(new User("Ajay", 23));
        strList.add(new User("Sowmya", 22));
//        strList.add("hi");
//        strList.add("hi");
//        strList.add("hi");
//        strList.add("hi");
//        strList.add("hi");
        System.out.println(strList);

       return sArray;
    }

    public static void main(String[] args) {
        StringArray sa = new StringArray();
        sa.testStringArray();
    }
}
