package com.nasa.astromovel.direction;

import com.nasa.astromovel.entity.Astromovel;

public class Norte implements Direction {
    private Astromovel astromovel;

    public Norte(Astromovel astromovel) {
        this.astromovel = astromovel;
    }

    @Override
    public void mudarDirecao(String direcao) {
        if (direcao.equals("DIREITA")) {
            this.astromovel.setDirecaoOlhar(new Leste(this.astromovel));
        } else if (direcao.equals("ESQUERDA")) {
            this.astromovel.setDirecaoOlhar(new Oeste(this.astromovel));
        }
    }

    @Override
    public String getDirecao() {
        return Direcoes.NORTE.name();
    }

    @Override
    public void mover(int quantidade) {
        if (this.estaNaBorda()) {
            this.astromovel.setDirecaoOlhar(new Sul(astromovel));
            this.astromovel.getDirecaoOlhar().mover(quantidade);
        } else {
            int y = astromovel.getPosicaoY() - quantidade;
            int[][] atualizarPosicao = new int[10][10];
            atualizarPosicao[y][this.astromovel.getPosicaoX()] = 1;
            astromovel.setPosicaoY(y);
            this.astromovel.setArea(atualizarPosicao);
        }

    }

    @Override
    public boolean estaNaBorda() {
        return this.astromovel.getPosicaoY() == 0;
    }

}
