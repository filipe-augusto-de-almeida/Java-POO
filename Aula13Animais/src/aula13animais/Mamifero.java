/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13animais;

/**
 *
 * @author filipe
 */
public class Mamifero extends Animal {
    //Atributo de Mamífero
    protected String corPelo;    
    
    //Método sobreposto
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }

    //Métodos especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
