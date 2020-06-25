/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*1) create an interface with abstract methods
2) Create another abstract class that implements the interface created
in step(1) and implements one of its method.
3)Create another class with main method that extends the abstract
class of the interface. Create an object of this class with refrence to the
interface and call all the methods */
package interf;

/**
 *
 * @author dell
 */
public class Interfexample extends NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewInterface n=new Interfexample();
        n.t1();
        n.t2();
        n.t3();
        n.t4();
        
    }

   
    public void t2() {
        System.out.println("Dog barks");  
    }

    
    public void t3() {
        System.out.println("Cat Meows"); 
    }

    
    public void t4() {
        System.out.println ("snake hisss"); 
    }
    
}
