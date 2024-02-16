/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author filipe
 */
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    //Métodos Luta
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if(desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante) {
            this.setAprovada(true);
            this.setDesafiado(desafiado);
            this.setDesafiante(desafiante);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar() {
        if(this.isAprovada()) {
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            int vencedor = (int)Math.round(Math.random()*2);
            System.out.println("==Resultado da Luta==");
            switch(vencedor) {
                case 0 -> {
                    //Empate
                    System.out.println("      Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                }
                case 1 -> {
                    //Ganhou Desafiado
                    System.out.println("Vitória do " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                }
                default -> {
                    //Ganhou Desafiante
                    System.out.println("Vitória do " + this.getDesafiante().getNome());
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                }
            }
            System.out.println("=====================");
        } else {
            System.out.println("Esta Luta não pode acontecer!");
        }
    }
}
