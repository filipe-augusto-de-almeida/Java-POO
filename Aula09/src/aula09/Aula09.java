/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09;

/**
 *
 * @author filipe
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa leitor[] = new Pessoa[2];
        Pessoa escritor[] = new Pessoa[3];
        Livro livro[] = new Livro[3];
        
        leitor[0] = new Pessoa("Filipe", 31 , "M");
        leitor[1] = new Pessoa("Taís", 31, "F");
        
        escritor[0] = new Pessoa("José", 50, "M");
        escritor[1] = new Pessoa("João", 45, "M");
        escritor[2] = new Pessoa("Kléber", 34, "M");
        
        livro[0] = new Livro("Aprendendo Java", escritor[0], 400, leitor[0]);
        livro[1] = new Livro("POO para iniciantes", escritor[1], 500, leitor[0]);
        livro[2] = new Livro("O presente", escritor[2], 800, leitor[1]);
        
        livro[2].abrir();
        livro[2].folhear(378);
        livro[2].avancarPag();
        System.out.println(livro[2].detalhes());
        
        System.out.println(livro[1].detalhes());
    }
    
}
