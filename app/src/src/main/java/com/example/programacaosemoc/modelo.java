package com.example.programacaosemoc;
public class modelo {
    String eixo;
    String datahora;
    String tema;
    String local;
    int imagem;

    public modelo(String eixo, String datahora, String tema, String local, int imagem) {
        this.eixo = eixo;
        this.datahora = datahora;
        this.tema = tema;
        this.imagem = imagem;
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public String getEixo() {
        return eixo;
    }

    public String getDatahora() {
        return datahora;
    }

    public String getTema() {
        return tema;
    }

    public int getImagem() {
        return imagem;
    }
}
