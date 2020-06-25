/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpalindromicword;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class TestPalindromicWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        
        String str = sc.next();
        String org_str=str;
        
        String rev="";
        int len = str.length();
        
        for(int i=len-1; i>=0;i--)
        {
            rev = rev+ str.charAt(i);
        }
        if(org_str.equals(rev)){
            System.out.println(org_str+" is Palindrome");
        }
        else 
            System.out.println(org_str+" is non Palindrome");
    }
    
}
