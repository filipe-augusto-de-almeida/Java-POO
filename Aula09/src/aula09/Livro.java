/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

/**
 *
 * @author filipe
 */
public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private Pessoa autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos Públicos
    public String detalhes(){
        return "Livro {\nTítulo: " + this.getTitulo() +
        "\nAutor: " + this.getAutor().getNome() +
        "\nTotal de páginas: " + this.getTotPaginas() +
        "\nPágina Atual: " + this.getPagAtual() +
        "\nEstá Aberto: " + this.isAberto() + 
        "\nLeitor: " + this.getLeitor().getNome() + "\n}";
    }
    
    //Métodos Especiais
    public Livro(String titulo, Pessoa autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        this.setPagAtual(1);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if(this.isAberto() && pagina <= this.getTotPaginas() && pagina > 0){
            this.setPagAtual(pagina);
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto() && this.getPagAtual() < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto() && this.getPagAtual() > 0){
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
    
}
