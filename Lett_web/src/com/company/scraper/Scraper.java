package com.company.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Scraper {
    private String url;
    private String nomeProduto;
    private String precoAntigo;
    private String precoAtual;
    private String precoParcela;
    private String precoDesconto;
    private List<String> imgs = new ArrayList<>();

    public Scraper(String url){
        this.url =url;
        busca();
    }

    public void busca() {
        try {
            Document doc = Jsoup.connect(url).timeout(5000).get();
            this.nomeProduto = doc.getElementsByClass("titulo_det").text();
            this.precoAntigo = doc.select("[class~=^preco_antigo]").text();
            this.precoAtual = doc.select("[class~=^preco_normal]").text();
            this.precoParcela = doc.select("12x").text();
            this.precoDesconto = doc.select("[class~=^preco_desconto]").text();
            Elements elements = doc.select(".container .slider");
            for (Element e : elements.select("img")){
                this.imgs.add(e.attr("data-zoom-image"));
            }
        }
        catch (IOException e){

        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getPrecoAntigo() {
        return precoAntigo;
    }

    public void setPrecoAntigo(String precoAntigo) {
        this.precoAntigo = precoAntigo;
    }

    public String getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(String precoAtual) {
        this.precoAtual = precoAtual;
    }

    public String getPrecoParcela() {
        return precoParcela;
    }

    public void setPrecoParcela(String precoParcela) {
        this.precoParcela = precoParcela;
    }

    public String getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto(String precoDesconto) {
        this.precoDesconto = precoDesconto;
    }

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }
}
