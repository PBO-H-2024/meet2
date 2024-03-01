/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livingthings;

/**
 *
 * @author Lenovo
 */
public class Capybarry extends Animals {
    //attribute
    String aksesoris;
    
    //constructor
    public Capybarry(String aksesoris, String name, int legs, int eyes){
        super(name, legs, eyes);
        this.aksesoris = aksesoris;
    }
    
    //method
    public void chilling(){
        System.out.println(name + " sedang bertahajud");
    }
    
    public void styling(){
        System.out.println(name + " sedang memakai " + aksesoris);
    }
    
    public void styling(String aksesoris){
        System.out.println(name + " sedang memakai " + aksesoris);
    }
    
    public void sepakBola(){
        throw new UnsupportedOperationException(name + " can't play football");
    }
}
