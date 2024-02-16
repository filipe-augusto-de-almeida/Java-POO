/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11pessoas;

/**
 *
 * @author filipe
 */
public class Bolsista extends Aluno {
    //Atributos
    private float bolsa;
    
    //Métodos públicos
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void PagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }
    
    //Métodos especiais
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
