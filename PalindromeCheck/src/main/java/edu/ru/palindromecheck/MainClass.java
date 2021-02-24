
package edu.ru.palindromecheck;

public class MainClass {

public static boolean isPalindrome(String word){
        
        String reverse = ""; 
        
        for ( int i = word.length() - 1; i >= 0; i-- )  
         reverse = reverse + word.charAt(i);  
        if (word.equals(reverse))  
         return true;  
        else  
        return false; 
 }
 public static void main(String args[]){
        
        String _word= "adba";
	
        Boolean result = isPalindrome(_word);	
     
        System.out.println(result);
   }
   
    
}
    
