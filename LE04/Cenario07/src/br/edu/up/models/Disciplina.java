package br.edu.up;
import br.edu.up.*;
import java.util.HashSet;
import java.util.Set;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private Professor professor;
    private Set<Aluno> alunosMatriculados;
    private Set<Competencia>competencias;

    public Disciplina(String nome, String identificador, String curriculo, Professor professor) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.alunosMatriculados = new HashSet<>();
        this.competencias = new HashSet<>();
        
    }
    
}
