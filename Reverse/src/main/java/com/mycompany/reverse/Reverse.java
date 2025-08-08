/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reverse;

/**
 *
 * @author Admin
 */
import java.util.Arrays;
public class Reverse {

    public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
       int n=arr.length;
       for(int i=0;i<n/2;i++){
           int temp=arr[i];
           arr[i]=arr[n-1-i];
           arr[n-1-i]=temp;
       }
       System.out.println("Reversed using in-place "+Arrays.toString(arr));
    }
}
