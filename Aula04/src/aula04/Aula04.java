/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

/**
 *
 * @author filipe
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("BIC", 0.5f, "Vermelha");
        c1.setTampada(false);
        c1.status();
        Caneta c2 = new Caneta("Compactor", 0.4f, "Azul");
        c2.status();
    }
    
}
