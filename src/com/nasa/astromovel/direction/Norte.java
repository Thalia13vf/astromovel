package com.nasa.astromovel.direction;

import com.nasa.astromovel.entity.Astromovel;

public class Norte implements Direction{
    private Astromovel astromovel;

    public Norte(Astromovel astromovel) {
        this.astromovel = astromovel;
    }

    @Override
    public void mudarDirecao(String direcao) {
        if(direcao.equals("DIREITA")){
            this.astromovel.setDirecaoOlhar(new Leste(this.astromovel));
        } else if(direcao.equals("ESQUERDA")) {
            this.astromovel.setDirecaoOlhar(new Oeste(this.astromovel));
        }
    }

    @Override
    public String getDirecao() {
        return Direcoes.NORTE.name();
    }
}
