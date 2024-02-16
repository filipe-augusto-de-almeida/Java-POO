/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13animais;

/**
 *
 * @author filipe
 */
public class Cachorro extends Lobo {
    //Método sobreposto
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    //Métodos sobrecarregados
    public void reagir(String frase) {
        if(frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int minuto) {
        if(hora < 12) {
            System.out.println("Abanar");
        } else if(hora < 18) {
            System.out.println("Abanar e latir");
        } else  {
            System.out.println("ignorar");
        }
    }
    
    public void reagir(boolean dono) {
        String s = dono?"Abanar":"Rosnar e Latir";
        System.out.println(s);
    }
    
    public void reagir(int idade, float peso) {
        if(idade < 5)  { //novo
            if(peso < 10) { //novo e leve
                System.out.println("Abanar");
            } else {    //novo e pesado
                System.out.println("Latir");
            }
        } else {    //velho
            if(peso < 10) { //velho e leve
                System.out.println("Rosnar");
            } else  {   //velho e pesado
                System.out.println("Ignorar");
            }
        }
    }

}
