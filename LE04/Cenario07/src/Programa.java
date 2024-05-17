import.br.edu.br.models;
import.br.edu.br.controllers;
import.br.edu.br.view;


public class Programa {
    public static void main(String[] args) {
        // Exemplo de uso do controlador
        AcademicoController controller = new AcademicoController();

        // Criação de alguns professores, alunos e disciplinas
        ProfessorModel professor1 = new ProfessorModel("João", "123456", "001", "lattes123", "Doutorado");
        AlunoModel aluno1 = new AlunoModel("Maria", "654321", "2021001", 2021, "Engenharia", "Manhã");
        DisciplinaModel disciplina1 = new DisciplinaModel("Programação", "PROG001", "Engenharia de Software", professor1);

        // Adiciona os objetos ao controlador
        controller.adicionarProfessor(professor1);
        controller.adicionarAluno(aluno1);
        controller.adicionarDisciplina(disciplina1);
    }
}
