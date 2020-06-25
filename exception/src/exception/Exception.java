/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Dell
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try{
        int a=10;
        int n=1;
        int res = a/n;
        int g[]= {1};
        g[20]=100;
    }
       catch (ArithmeticException e){
           System.out.println("exception dur to" +e);
       }
       catch (ArrayIndexOutOfBoundsException aob){
            System.out.println("Error =" +aob);
}
       
        
       finally {
           System.out.println("Error handled");
       }
       
    }

   
    }

        
      
        
    
/*catch (ArithmeticException ae){
            System.out.println("Exception due to" +ae);*/


