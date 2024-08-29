package org.example;

public class DescontoFixo implements Desconto {

    private float valorDesconto;

    public DescontoFixo(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public float aplicar(float valorOriginal) {
        return valorOriginal - valorDesconto;
    }
}

