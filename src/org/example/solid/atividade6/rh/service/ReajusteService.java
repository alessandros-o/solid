package org.example.solid.atividade6.rh.service;

import org.example.solid.atividade6.rh.ValidacaoException;
import org.example.solid.atividade6.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){

        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioAjustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioAjustado);
    }
}
