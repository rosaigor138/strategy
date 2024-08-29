package org.example;

public class DescontoEmDinheiro implements Desconto {

    private float valorMinimo;
    private float descontoEmDinheiro;

    public DescontoEmDinheiro(float valorMinimo, float descontoEmDinheiro) {
        this.valorMinimo = valorMinimo;
        this.descontoEmDinheiro = descontoEmDinheiro;
    }

    @Override
    public float aplicar(float valorOriginal) {
        if (valorOriginal >= valorMinimo) {
            return valorOriginal - descontoEmDinheiro;
        }
        return valorOriginal;
    }
}

