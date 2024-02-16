/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11pessoas;

/**
 *
 * @author filipe
 */
public class Aula11Pessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        /*v1.setNome("Juvenal");
        v1.setIdade(53);
        v1.setSexo("M");        
        System.out.println(v1.toString());*/
        
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("TI");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.PagarMensalidade();
        //System.out.println(a1.toString());
        
        b1.setMatricula(2222);
        b1.setNome("Jubileu");
        b1.setBolsa(21.5f);
        b1.setSexo("M");
        b1.PagarMensalidade();
    }
    
}
