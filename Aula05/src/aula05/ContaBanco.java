/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author filipe
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0.0f;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo) {
        
        if(this.isStatus() == false) {
            this.setStatus(true);
            this.setTipo(tipo.toUpperCase());
            if(this.getTipo().equals("CC")) {
                this.setSaldo(this.getSaldo() + 50f);
            } else if(this.getTipo().equals("CP")) {
                this.setSaldo(this.getSaldo() + 150f);
            }
            System.out.printf("%s, sua %s está aberta em nosso Banco!\n", this.getDono(), this.getTipo());
        }    
    }
    
    public void fecharConta() {
        if(this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro.");
        } else if(this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada!");
        }
    }
    
    public void depositar(float valor) {
        if(this.isStatus() == true) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.printf("Depósito no valor de R$ %.2f efetuado na %s %d."
                    + "\n", valor, this.getTipo(), this.getNumConta());
        } else {
            System.out.println("Impossível depositar.");
        }
    }
    
    public void sacar(float valor) {
        if(this.isStatus() == true) {
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.printf("Saque no valor de R$ %.2f efetuado na %s "
                        + "%d.\n", valor,this.getTipo(), this.getNumConta());
            } else {
                System.out.println("Saldo Insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar.");
        }
    }
    
    public void pagarMensal() {
        float v = 0f;
        
        if(this.getTipo().equals("CC")){
            v = 12f;
        } else if(this.getTipo().equals("CP")) {
            v = 20f;
        }
        
        if(this.isStatus() == true) {
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
            
                System.out.printf("Mensalidade da conta %s Nº %d debitada com "
                    + "sucesso.\n", this.getTipo(), this.getNumConta());
            } else {
                System.out.println("Saldo insuficiente.");
            }
            
        } else {
            System.out.println("Impossível pagar!");
        }
        
    }
    
    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + (this.isStatus()?"Aberta":"Fechada"));
        System.out.println("-----------------------------");
    }
}
