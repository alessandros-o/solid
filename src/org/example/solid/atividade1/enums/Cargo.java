package org.example.solid.atividade1.enums;

import org.example.solid.atividade1.DezOuVintePorCento;
import org.example.solid.atividade1.QuinzeOuVinteCincoPorcento;
import org.example.solid.atividade1.RegraDeCalculo;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
