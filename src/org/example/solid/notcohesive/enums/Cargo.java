package org.example.solid.notcohesive.enums;

import org.example.solid.notcohesive.DezOuVintePorCento;
import org.example.solid.notcohesive.QuinzeOuVinteCincoPorcento;
import org.example.solid.notcohesive.RegraDeCalculo;

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
