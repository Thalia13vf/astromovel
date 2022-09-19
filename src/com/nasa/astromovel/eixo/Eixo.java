package com.nasa.astromovel.eixo;

import com.nasa.astromovel.entity.Astromovel;

public class Eixo implements State {
    private Astromovel astromovel;

    public Eixo(Astromovel astromovel) {
        this.astromovel = astromovel;
    }

    @Override
    public void moverNoEixoX(int quantidadeCasas) {
        int x = astromovel.getPosicaoX() + quantidadeCasas;
        int [][] atualizarPosicao = new int[10][10];
        atualizarPosicao[astromovel.getPosicaoY()][x] = 1;
        astromovel.setPosicaoX(x);
        this.astromovel.setArea(atualizarPosicao);
    }

    public void moverNoEixoY(int quantidadeCasas) {
        int y = astromovel.getPosicaoY() + quantidadeCasas;
        int [][] atualizarPosicao = new int[10][10];
        atualizarPosicao[y][this.astromovel.getPosicaoX()] = 1;
        astromovel.setPosicaoY(y);
        this.astromovel.setArea(atualizarPosicao);
    }

}
