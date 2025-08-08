package com.mycompany.sample;
import java.util.Scanner;
class Sample{
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int  reversed=0;
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
            
        }
        System.out.println("Reversed:"+reversed);
        
        
    }
}
