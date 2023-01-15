package Sorting;

import javafx.scene.Scene;

import java.util.Scanner;

public class Sort {

    public static void main(String[] args){

        System.out.println("Enter the count: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Nos:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int temp;

        for(int i=1;i<size;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){

                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        System.out.println("Sorted Array: ");
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }



    }


}
