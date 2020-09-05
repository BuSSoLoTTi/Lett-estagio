package com.company.animais;

public abstract class Animal {
    private int idade;
    private float tamanho;

    public abstract void som();

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idade=" + idade +
                ", tamanho=" + tamanho +
                '}';
    }
}


