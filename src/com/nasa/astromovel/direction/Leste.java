package com.nasa.astromovel.direction;

import com.nasa.astromovel.entity.Astromovel;

import java.util.Objects;

public class Leste implements Direction {
    private Astromovel astromovel;

    public Leste(Astromovel astromovel) {
        this.astromovel = astromovel;
    }

    @Override
    public void mudarDirecao(String direcao) {
        if (direcao.equals("DIREITA")) {
            this.astromovel.setDirecaoOlhar(new Norte(this.astromovel));
        } else if (direcao.equals("ESQUERDA")) {
            this.astromovel.setDirecaoOlhar(new Sul(this.astromovel));
        }
    }

    @Override
    public String getDirecao() {
        return Direcoes.LESTE.name();
    }

    @Override
    public void mover(int quantidade) {
        if (this.estaNaBorda()) {
            this.astromovel.setDirecaoOlhar(new Oeste(astromovel));
            this.astromovel.getDirecaoOlhar().mover(quantidade);
        } else {
            int x = astromovel.getPosicaoX() + quantidade;
            int[][] atualizarPosicao = new int[10][10];
            atualizarPosicao[astromovel.getPosicaoY()][x] = 1;
            astromovel.setPosicaoX(x);
            this.astromovel.setArea(atualizarPosicao);
        }

    }

    @Override
    public boolean estaNaBorda() {
        return this.astromovel.getPosicaoX() == 9;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leste leste = (Leste) o;
        return Objects.equals(astromovel, leste.astromovel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(astromovel);
    }
}
