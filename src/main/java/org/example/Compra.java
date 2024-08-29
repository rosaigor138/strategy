package org.example;

public class Compra {

    private float valorOriginal;
    private float valorFinal;

    public Compra(float valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public void aplicarDesconto(Desconto desconto) {
        this.valorFinal = desconto.aplicar(valorOriginal);
    }

    public float getValorFinal() {
        return valorFinal;
    }
}
