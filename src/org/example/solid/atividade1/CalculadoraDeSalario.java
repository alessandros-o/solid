package org.example.solid.atividade1;

public class CalculadoraDeSalario {
    public double calcula(Funcionario funcionario) {

        return funcionario.getCargo().getRegra().calcula(funcionario);
    }
}
