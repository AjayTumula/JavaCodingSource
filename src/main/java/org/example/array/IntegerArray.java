package org.example.array;

public class IntegerArray {
    public static int getDiffArray(int[] a){
        int i, b, max=0, index=0;
        for(i = 0; i< a.length -1; i++)
        {
            if(a[i]< a[i + 1])
            {
                b = a[i+1] - a[i];
            }
            else {
                b = a[i] - a[i +1];
            }
            if(b > max) {
                max = b;
                if(a[i] > a[i+1])
                {
                    index = i;
                }
                else {
                    index = i + 1;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] a = {3,5,8,2,6};
        System.out.println(getDiffArray(a));
        System.out.println(a[getDiffArray(a)]);
        System.out.println(a[0]);
    }
}
