Find the frequency of each digit from the given number.
import java.util.*;
class DigitFrequency{
  public static void main(String args[]){
    int[] digitcounts=new int[10];
    
    Scanner scanner=new Scanner(System.in);
    String numberStr=scanner.next();
    scanner.close();
    for(int i=0; i<numberStr.length(); i++){
      char digitChar=numberStr.charAt(i);
      int digit=digitChar  -'0';
      digitCounts[digit]++;
    }
    
    for(int i=0;i<10;i++){
      System.out.printf("%d occurs %d times\n", i, digitCounts[i]);
    }
  }
}
  2) Anagram for 2 numbers. Two numbers are said to be an anagram if both numbers are formed with the same digits.

import java.util.Arrays;
import java.util.Scanner;
class AnagramCheck {
  public static void main(string args[]){
    Scanner scanner =new Scanner(System.in);
    long num1=scanner.nextLong();
    long num2=scanner.nextLong();
    scanner.close();
    boolean areAnagram= checkAnagrams(num1, num2);
    if(are Anagram){
      System.out.println("Anagram");
    }else{
      System.out.println("Not");
    }
  }
  public static booleancheckAnagrams(long num1,long num2){
    String str1=long.toString(num1);
    String str2=long.toString(num2);
    if(str1.length() != str2.length()) {
      return false;
    }
    char[] arr1=str1.toCharArray();
    char[] arr2=str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Array.equals(arr1,arr2);
  }
}

3)Leap year or Not

public class Main {
  public static void main(String[] args) {
    int year = 2020;
    boolean isLeapYear;

    // divisible by 4
    isLeapYear = (year % 4 == 0);

    // divisible by 4, not by 100, or divisible by 400
    isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

    if (isLeapYear) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }
}

4)Reverse a number using while loop

public class ReverseNumberExample1   
{  
public static void main(String[] args)   
{  
int number = 987654, reverse = 0;  
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  

5)ATM program Java

import java.util.Scanner;  
  
public class ATMExample  
{  
    
    public static void main(String args[] )  
    {    
        int balance = 100000, withdraw, deposit;  
            
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
               
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
 
        withdraw = sc.nextInt();  
                      
        
        if(balance >= withdraw)  
        {  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
       
        deposit = sc.nextInt();  
                        
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
         
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        
        System.exit(0);  
            }  
        }  
    }  
}  
 
