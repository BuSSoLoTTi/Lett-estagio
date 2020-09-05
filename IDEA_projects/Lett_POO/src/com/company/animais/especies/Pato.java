package com.company.animais.especies;

import com.company.animais.classes.Ave;

public class Pato extends Ave {

    public Pato(float tamanho,int idade,int ovosBotados,float altitude,String cor){
        this.setTamanho(tamanho);
        this.setIdade(idade);
        this.setOvosBotados(ovosBotados);
        this.setAltitude(altitude);
        this.setCorPena(cor);
    }

    @Override
    public void botarOvo() {
        setOvosBotados(getOvosBotados()+1);
    }

    @Override
    public void som() {
        System.out.println("*Grasnido*");
    }

    @Override
    public void voar() {
        System.out.println("voando...");
    }

}
