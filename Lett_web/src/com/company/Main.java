package com.company;

import com.company.scraper.Scraper;
import com.sun.jdi.event.StepEvent;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.println("insira o link");
        String[] links = scn.nextLine().split(";");
        for (String url : links) {
            Scraper scraper = new Scraper(url);
            if (!scraper.getPrecoAntigo().isEmpty()) {
                System.out.printf("**PRODUTO EM PROMOCAO**\n" +
                        "Nome: %s\n" +
                        "preco: %s\n" +
                        "%s  %s \n" +
                        "ou %s\n" +
                        "*imagens do produto*\n", scraper.getNomeProduto(), scraper.getPrecoAntigo(), scraper.getPrecoAtual(), scraper.getPrecoParcela(), scraper.getPrecoDesconto());
                for (String img : scraper.getImgs()){
                    System.out.println(img);
                }
            }
            else {
                System.out.printf("Nome: %s\n" +
                        "preco: %s\n" +
                        "por %s  \n" +
                        "ou %s\n" +
                        "*imagens do produto*\n", scraper.getNomeProduto(), scraper.getPrecoAtual(), scraper.getPrecoParcela(), scraper.getPrecoDesconto());
                for (String img : scraper.getImgs()){
                    System.out.println(img);
                }
            }
            for (short i=0;i<50;i++){
                System.out.printf("-");
            }
            System.out.println();
        }
    }
}
