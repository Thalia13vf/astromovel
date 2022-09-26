package com.nasa.astromovel.entity;

import com.nasa.astromovel.direction.Direction;
import com.nasa.astromovel.direction.Norte;

public class Astromovel {
    private int[][] area = new int[10][10];
    private int posicaoX;
    private int posicaoY;
    private Direction direcaoOlhar;

    private String comandoMover;

    public Astromovel() {
        this.area[0][0] = 1;
        this.posicaoY = 0;
        this.posicaoX = 0;
        this.direcaoOlhar = new Norte(this);
    }

    public int[][] getArea() {
        return area;
    }

    public void setArea(int[][] area) {
        this.area = area;
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

        System.out.println("[y=" + this.posicaoY + "][x=" + this.posicaoX + "]" + "[p=" + this.direcaoOlhar.getDirecao() + "]");
    }

    public Direction getDirecaoOlhar() {
        return direcaoOlhar;
    }

    public void setDirecaoOlhar(Direction direcaoOlhar) {
        this.direcaoOlhar = direcaoOlhar;
    }

    public void mover(int quantidade) {
        this.direcaoOlhar.mover(quantidade);
    }

    public void moverAstromovel(String comando) {
        this.comandoMover = comando;
        this.comandoMover();
    }

    public void comandoMover() {
        char[] comandos = this.comandoMover.toCharArray();
        for (char comando : comandos) {
            if (comando == 'M') {
                mover(1);
            }
            if (comando == 'R') {
                this.getDirecaoOlhar().mudarDirecao("DIREITA");
            }
            if (comando == 'L') {
                this.getDirecaoOlhar().mudarDirecao("ESQUERDA");
            }
        }
    }

}
