package com.company.animais.classes;

import com.company.animais.Animal;

public abstract class Mamiferos extends Animal {

    private String corDoPelo;

    public abstract void amamentar();

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    @Override
    public String toString() {
        return "Mamiferos{" +
                "corDoPelo='" + corDoPelo + '\'' +
                "} " + super.toString();
    }
}
