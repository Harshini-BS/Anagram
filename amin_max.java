package com.mycompany.min_max;
ublic class Min_Max {

    public static void main(String[] args) {
       int[] arr={1,10,99,999,10000,346947748};
       int min=arr[0];
       int max=arr[0];
       for(int num:arr){
           if (num>max){
               max=num;
           }
           if(num<min){
               num=min;
           }
       }
       System.out.println("Max is "+max+" Min is "+min);
       
    }
}
