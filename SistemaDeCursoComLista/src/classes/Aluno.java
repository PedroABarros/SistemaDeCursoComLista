package classes;

import java.util.ArrayList;
import java.util.List;


public class Aluno extends Pessoa {
    private List<Turma> turmas;

    public Aluno(String nome) {
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

