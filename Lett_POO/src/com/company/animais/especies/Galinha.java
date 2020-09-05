package com.company.animais.especies;

import com.company.animais.classes.Ave;

public class Galinha extends Ave {

    public Galinha(float tamanho, int idade, int ovosBotados, String cor) {
        this.setTamanho(tamanho);
        this.setIdade(idade);
        this.setOvosBotados(ovosBotados);
        this.setCorPena(cor);
        this.setAltitude(0);
    }

    @Override
    public void som() {
        System.out.println("*Cacarejo*");
    }

    @Override
    public void botarOvo() {
        setOvosBotados(getOvosBotados() + 1);
    }

    @Override
    public void voar() {
        System.out.println("voando...");
    }
}
