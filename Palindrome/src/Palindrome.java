
        
import java.util.Scanner;

/**
 *
 * @author Dell
 */

    class Palindrome{  
 
    public static void main(String args[]){
        Palindrome pal=new Palindrome();
        pal.palin();
                }
    
    public void palin()
    {
        int r,sum=0,temp; 
        Scanner pal=new Scanner (System.in);
        System.out.println("Enter any Number");
        int n=pal.nextInt();
        temp=n;    
  while(n>0){    
   r=n%10;   
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  
  if(temp==sum)    
   
      System.out.println(" It is palindrome number ");    
 
  else    
   
      System.out.println(" It is not palindrome number");    
}  
} 
        





