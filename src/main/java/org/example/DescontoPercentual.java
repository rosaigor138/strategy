package org.example;

public class DescontoPercentual implements Desconto {

    private float percentual;

    public DescontoPercentual(float percentual) {
        this.percentual = percentual;
    }

    @Override
    public float aplicar(float valorOriginal) {
        return valorOriginal * (1 - percentual / 100);
    }
}

