package com.nasa.astromovel.direction;

import com.nasa.astromovel.entity.Astromovel;

public class Oeste implements Direction{

    private Astromovel astromovel;

    public Oeste(Astromovel astromovel) {
        this.astromovel = astromovel;
    }

    @Override
    public void mudarDirecao(String direcao) {
        if(direcao.equals("DIREITA")){
            this.astromovel.setDirecaoOlhar(new Norte(this.astromovel));
        } else if(direcao.equals("ESQUERDA")) {
            this.astromovel.setDirecaoOlhar(new Sul(this.astromovel));
        }
    }

    @Override
    public String getDirecao() {
        return Direcoes.OESTE.name();
    }
}
