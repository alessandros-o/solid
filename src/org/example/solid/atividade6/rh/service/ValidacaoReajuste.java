package org.example.solid.atividade6.rh.service;

import org.example.solid.atividade6.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
