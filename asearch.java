package com.mycompany.search;
public class Search {

    public static void main(String[] args) {
       int[] arr={1,2,3,4};
       int x=7;
       boolean flag=false;
       for(int num:arr){
           if(num==x){
               flag=true;
               break;
           }
           
       }
       System.out.println(flag?"Found":"Not Found");
    }
}