package br.edu.up.controllers;
import java.util.ArrayList;
import java.util.List;

public class InstituicaoController {
    private List<Professor> professors;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;


    public InstituicaoController() {
        professors = new ArrayList<>();
        alunos = new ArrayList<>();
        disciplinas = new ArrayList<>();
    }
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarDisciplina(Disciplina disciplina) {

    }

}
