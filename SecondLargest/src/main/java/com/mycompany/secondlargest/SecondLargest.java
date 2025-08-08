/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secondlargest;

/**
 *
 * @author Admin
 */
public class SecondLargest {

    public static void main(String[] args) {
       int[] arr={24,29,10,40,22};
       int largest=Integer.MIN_VALUE;
       int second=Integer.MAX_VALUE;
       for(int num:arr){
           if(num>largest){
               second=largest;
               largest=num;
           }
           else if(num>second && num!=largest){
               second=num;
           }
       }
       System.out.println("The Second Largest Value is "+second);
    }
}
