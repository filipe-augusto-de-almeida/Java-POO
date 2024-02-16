/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

/**
 *
 * @author filipe
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco(1111, "Jubileu");
        ContaBanco p2 = new ContaBanco(2222, "Creuza");
        
        p1.abrirConta("cc");
        p1.depositar(100);
        p1.sacar(150);
        p1.fecharConta();
        p1.estadoAtual();
        
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(100);
        p2.estadoAtual();
        
    }
    
}
