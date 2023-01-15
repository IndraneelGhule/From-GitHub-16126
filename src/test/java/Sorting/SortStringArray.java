package Sorting;

import java.util.Scanner;

public class SortStringArray {

    public static void main(String[] args) {
        System.out.println("Enter Array Size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];

        System.out.println("Enter Array Size: ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.next();
        }

        String temp = "";
        char[] ch = temp.toCharArray();

        System.out.println("Enter Array Size: "+"\\u%04x \n" + (int) 'a');

        for(int i=1;i<size;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1].compareTo(arr[j])>0){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        System.out.println("After Sort: ");
        for(int i=0;i<size;i++) {
            System.out.print(" "+arr[i]);
        }

    }




}
