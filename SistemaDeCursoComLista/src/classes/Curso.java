package classes;

import java.util.ArrayList;
import java.util.List;


public class Curso {
    private String nome;
    private List<Turma> turmas;

    public Curso(String nome) {
        this.nome = nome;
        this.turmas = new ArrayList<>();
    }

    public void addTurma(Turma turma) {
        turmas.add(turma);
    }

    public String getNome() {
        return nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}
