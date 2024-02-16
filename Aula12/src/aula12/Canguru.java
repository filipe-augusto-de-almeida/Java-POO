/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author filipe
 */
public class Canguru extends Mamifero {
    //Método público
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    
    //Método sobreposto
    @Override
    public void locomover() {
        System.out.println("Pulando");
    }
}
