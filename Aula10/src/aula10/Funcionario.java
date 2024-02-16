/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author filipe
 */
public class Funcionario extends Pessoa {
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Métodos Públicos
    public void mudarTrabalhando() {
        this.setTrabalhando(!this.isTrabalhando());
    }

    //Métodos Especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
