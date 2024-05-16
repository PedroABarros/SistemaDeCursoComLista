package classes;

import classes.Aluno;
import classes.Curso;
import classes.Disciplina;
import classes.Professor;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private Curso curso;
    private Professor professor;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public Turma(String nome, Curso curso, Professor professor) {
        this.nome = nome;
        this.curso = curso;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
