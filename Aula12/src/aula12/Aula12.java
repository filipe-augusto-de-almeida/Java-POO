/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

/**
 *
 * @author filipe
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Animal z = new Animal(); //Classe abstrata não instancia objeto
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        m.setPeso(5.7f);
        m.setIdade(8);
        m.setMembros(4);
        m.setCorPelo("Marrom");
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("-------------");
        
        /*p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        System.out.println("-------------");
        
        a.setPeso(.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println("-------------");*/
        
        c.setPeso(55.3f);
        c.setIdade(5);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        System.out.println("-------------");
        
        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        System.out.println("-------------");
    }
    
}
