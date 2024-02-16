/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author filipe
 */
public class Peixe extends Animal {
    //Atributos
    private String corEscama;
    
    //Métodos especiais
    public String getCorEscama() {    
        return corEscama;
    }
    
    public void setCorEscama(String corEscama) {    
        this.corEscama = corEscama;
    }

    //Métodos públicos
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
    
    //Métodos Sobrepostos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
}
