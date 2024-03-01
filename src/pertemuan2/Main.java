/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import livingthings.Animals;
import livingthings.Capybarry;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animals object = new Animals("Spider", 8, 4);
//        System.out.println("This is a " + object.name);
//        System.out.println("It has " + object.legs + " legs");
//        System.out.println("And " + object.eyes + " eyes");
//        System.out.println("------------------------------------------");
        
        Animals object2 = new Animals();
//        System.out.println(object2.name);

        Capybarry barry = new Capybarry("sunglass","Barry", 2, 10);
        
        object.eating();
        object2.eating();
        barry.chilling();
        barry.eating();
//        object2.chilling();
        barry.styling("Baju pantai");
        barry.sepakBola();
    }
    
}
