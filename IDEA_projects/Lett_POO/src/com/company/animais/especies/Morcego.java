package com.company.animais.especies;

import com.company.caracteristica.AnimalVoador;
import com.company.animais.classes.Mamiferos;

public class Morcego extends Mamiferos implements AnimalVoador {

    private float altitude;

    public Morcego(float tamanho,int idade,float altitude,String corDoPelo){
        this.setTamanho(tamanho);
        this.setIdade(idade);
        this.setAltitude(altitude);
        this.setCorDoPelo(corDoPelo);
    }

    @Override
    public void voar() {

    }

    @Override
    public void amamentar() {

    }

    @Override
    public void som() {
        System.out.println("*Farfalho*");
    }

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }


}
