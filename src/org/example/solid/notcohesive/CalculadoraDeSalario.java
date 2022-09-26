package org.example.solid.notcohesive;

import static org.example.solid.notcohesive.enums.Cargo.*;

public class CalculadoraDeSalario {
    public double calcula(Funcionario funcionario) {

        return funcionario.getCargo().getRegra().calcula(funcionario);
    }
}
