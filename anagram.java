import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        int charCount=countCharacters(str);
        System.out.println("Enter first string to check anagram: ");
        String str1=sc.nextLine();
        System.out.println("Enter second string to check anagram:");
        String str2=sc.nextLine();
        if(isAnagram(str1,str2)){
            System.out.println("Anagram");
            
        }
        else{
            System.out.println("Not an Anagram");
        }
        
        
         
        
       
    }
    static int countCharacters(String str){
        int count=0;
        for(char c:str.toCharArray()){
            if(c!=' '){
                count++;
            }
        }
        return count;
        
    }
    static boolean isAnagram(String s1,String s2){
        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
        
    }
}
