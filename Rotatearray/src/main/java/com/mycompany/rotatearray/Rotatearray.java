/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rotatearray;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Rotatearray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=2;
        int n=arr.length;
        int[] rotated=new int[n];
        for(int i=0;i<n;i++){
            rotated[i]=arr[(i+k)%n];
        }
        System.out.println("After left rotation:"+ Arrays.toString(rotated));
        
    }
}
