/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author Dell
 */

abstract class Shape{
abstract void draw();

}

class Rectangle extends Shape{
void draw(){System.out.println("Drawing Circle ➡ ⏺");}
}

class Circle1 extends Shape{
void draw(){System.out.println("Drawing rectangle ➡ ⏹");}
}



class TestAbstraction1{
public static void main(String args[]){
Shape s=new Rectangle();
Shape a=new Circle1();
s.draw();
a.draw();
}
}


   
    
    

