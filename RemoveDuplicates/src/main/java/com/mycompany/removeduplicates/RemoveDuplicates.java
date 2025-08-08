/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.removeduplicates;

/**
 *
 * @author Admin
 */
import java.util.*;
public class RemoveDuplicates {

    public static void main(String[] args) {
       int[] arr={1,2,2,2,3,3,4,5,6,6,7,7,8,9};
       Set<Integer> set=new LinkedHashSet<>();
       for(int num:arr){
           set.add(num);
       }
       System.out.println("After removing Duplicates:"+ set);
    }
}
