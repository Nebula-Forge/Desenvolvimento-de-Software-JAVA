package br.edu.up.controllers;

public class Livro {
    private String codigo;
    private String titulo;
    private String[] autores;
    private String isbn;
    private Integer ano;

    public Livro() {
    }

    public Livro(String codigo, String titulo, String[] autores, String isbn, Integer ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.ano = ano;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getAno() {
        return ano;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getIsbn() {
        return isbn;
    }


}
