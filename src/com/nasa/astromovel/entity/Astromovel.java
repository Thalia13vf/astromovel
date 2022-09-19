package com.nasa.astromovel.entity;

import com.nasa.astromovel.direction.Direction;
import com.nasa.astromovel.direction.Norte;
import com.nasa.astromovel.eixo.Eixo;

public class Astromovel {
    private int[][] area = new int[10][10];
    private int posicaoX;
    private int posicaoY;
    private Direction direcaoOlhar;
    private Eixo eixo;

    public Astromovel() {
        this.area[0][0] = 1;
        this.posicaoY = 0;
        this.posicaoX = 0;
        this.eixo = new Eixo(this);
        this.direcaoOlhar = new Norte(this);
    }

    public int[][] getArea() {
        return area;
    }

    public void setArea(int[][] area) {
        this.area = area;
    }

    public Eixo getEixo() {
        return eixo;
    }

    public void setEixo(Eixo eixo) {
        this.eixo = eixo;
    }

    public boolean estaNaBordaDireita() {
        int bordaLimiteDireita = area.length - 1;
        return posicaoY == bordaLimiteDireita;
    }

    public boolean estaNaBordaEsquerda() {
        return posicaoY == 0;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public void mostrarPosicaoAstromovel() {

        System.out.println("[y=" + this.posicaoY + "][x=" + this.posicaoX + "]" + "[p="+this.direcaoOlhar.getDirecao() + "]");
    }

    public Direction getDirecaoOlhar() {
        return direcaoOlhar;
    }

    public void setDirecaoOlhar(Direction direcaoOlhar) {
        this.direcaoOlhar = direcaoOlhar;
    }

    public void mudarDirecao(String direcao) {
        this.direcaoOlhar.mudarDirecao(direcao);
    }
}
