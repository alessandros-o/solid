package org.example.solid.atividade3;

public class Teste {

    public static void main(String[] args) {

        TabelaDePreco tabelaDePreco = new TabelaDePrecoPadrao();
        ServicoDeEntrega frete = new Frete();

        CalculadoraDePrecos calculadoraDePrecos = new CalculadoraDePrecos(tabelaDePreco, frete);
    }
}
