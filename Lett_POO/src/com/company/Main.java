package com.company;

import com.company.animais.especies.Galinha;
import com.company.animais.especies.Morcego;
import com.company.animais.especies.Pato;
import com.company.animais.especies.Vaca;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Pato pato = criarPato();
        Galinha galinha = criarGalinha();
        Vaca vaca = criarVaca();
        Morcego morcego = criarMorcego();

        imprime(pato);
        imprime(galinha);
        imprime(vaca);
        imprime(morcego);


    }

    public static void imprime(Pato pato) {
        System.out.printf("Pato\n" +
                "\tTamanho: %f\n" +
                "\tIdade: %d\n" +
                "\tAltitude de voo: %f\n" +
                "\tOvos botados: %d\n" +
                "\tCor da pena: %s", pato.getTamanho(), pato.getIdade(),pato.getAltitude(),pato.getOvosBotados(),pato.getCorPena());
    }

    public static void imprime(Galinha galinha) {
        System.out.printf("Galinha\n" +
                "\tTamanho: %f\n" +
                "\tIdade: %d\n" +
                "\tAltitude de voo: %f\n" +
                "\tOvos botados: %d\n" +
                "\tCor da pena: %s", galinha.getTamanho(), galinha.getIdade(),galinha.getAltitude(),galinha.getOvosBotados(),galinha.getCorPena());
    }

    public static void imprime(Vaca vaca) {
        System.out.printf("Vaca\n" +
                "\tTamanho: %f\n" +
                "\tIdade: %d\n" +
                "\tCor do pelo: %s", vaca.getTamanho(), vaca.getIdade(),vaca.getCorDoPelo());
    }

    public static void imprime(Morcego morcego) {
        System.out.printf("Morcego\n" +
                "\tTamanho: %f\n" +
                "\tIdade: %d\n" +
                "\tAltitude de voo: %f\n" +
                "\tCor do pelo: %s", morcego.getTamanho(), morcego.getIdade(),morcego.getAltitude(),morcego.getCorDoPelo());
    }


    public static Pato criarPato() {
        //criação do pato
        Scanner scn = new Scanner(System.in);
        System.out.print("Criando pato\n" +
                "digite o tamanho em metros: ");
        float Tamanho = scn.nextFloat();
        System.out.print("digite a idade anos: ");
        int idade = scn.nextInt();
        System.out.print("didite a quantidade de ovos botados: ");
        int ovosBotados = scn.nextInt();
        System.out.print("digite o altitude de voo em metros\n");
        float altitude = scn.nextFloat();
        scn.nextLine();//Limpa o lixo no imput
        System.out.println("digite a cor da pena :");
        String cor = scn.nextLine();
        System.out.println("\n\n");
        return new Pato(Tamanho, idade, ovosBotados, altitude, cor);
    }

    public static Galinha criarGalinha() {
        //criação do pato
        Scanner scn = new Scanner(System.in);
        System.out.print("Criando Galinha\n" +
                "digite o tamanho em metros: ");
        float Tamanho = scn.nextFloat();
        System.out.print("digite a idade: ");
        int idade = scn.nextInt();
        System.out.print("didite a quantidade de ovos botados: ");
        int ovosBotados = scn.nextInt();
        scn.nextLine();//Limpa o lixo no imput
        System.out.println("digite a cor da pena :");
        String cor = scn.nextLine();
        System.out.println("\n\n");
        return new Galinha(Tamanho, idade, ovosBotados, cor);
    }

    public static Vaca criarVaca() {
        //criação do pato
        Scanner scn = new Scanner(System.in);
        System.out.print("Criando Vaca\n" +
                "digite o tamanho em metros: ");
        float Tamanho = scn.nextFloat();
        System.out.print("digite a idade: ");
        int idade = scn.nextInt();
        scn.nextLine();//Limpa o lixo no imput
        System.out.println("digite a cor do pelo :");
        String cor = scn.nextLine();
        System.out.println("\n\n");
        return new Vaca(Tamanho, idade, cor);
    }

    public static Morcego criarMorcego() {
        //criação do pato
        Scanner scn = new Scanner(System.in);
        System.out.print("Criando Morcego\n" +
                "digite o tamanho em metros: ");
        float Tamanho = scn.nextFloat();
        System.out.print("digite a idade anos: ");
        int idade = scn.nextInt();
        System.out.print("digite o altitude de voo em metros\n");
        float altitude = scn.nextFloat();
        scn.nextLine();//Limpa o lixo no imput
        System.out.println("digite a cor do pelo :");
        String cor = scn.nextLine();
        System.out.println("\n\n");
        return new Morcego(Tamanho, idade, altitude, cor);
    }

}



