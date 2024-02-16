/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author filipe
 */
public class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos públicos
    public void cancelarMatricula() {
        this.setCurso(null);
        System.out.println("Matrícula cancelada.");
    }
    
    //Métodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
