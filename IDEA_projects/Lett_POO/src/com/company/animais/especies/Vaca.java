package com.company.animais.especies;

import com.company.animais.classes.Mamiferos;

import java.util.List;

public class Vaca extends Mamiferos {

    public Vaca(float tamaho,int idade,String corDoPelo){
        this.setTamanho(tamaho);
        this.setIdade(idade);
        this.setCorDoPelo(corDoPelo);
    }

    @Override
    public void amamentar() {
        List.of();
    }

    @Override
    public void som() {
        System.out.println("*Mugido*");
    }
}
