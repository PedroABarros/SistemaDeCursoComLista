package classes;

import classes.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private List<Turma> turmas;

    public Professor(String nome) {
        super(nome);
        this.turmas = new ArrayList<>();
    }

    public void addTurma(Turma turma) {
        turmas.add(turma);
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}
