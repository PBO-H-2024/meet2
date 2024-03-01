/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livingthings;

/**
 *
 * @author Lenovo
 */
public class Animals {
    // attributes
    public String name = "Cat";
    public int legs = 4;
    public int eyes = 2;
    
    // constructor
    public Animals(){
        System.out.println("Constructor is called!!");
    }
    
    public Animals(String name, int legs, int eyes){
        this.name = name;
        this.legs = legs;
        this.eyes = eyes;
        System.out.println("Constructor 2 is called!!");
    }
    
    // method
    public void eating(){
        System.out.println(this.name + " is eating");
    }
    
    
}
