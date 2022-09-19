package com.nasa.astromovel;

import com.nasa.astromovel.entity.Astromovel;

public class AstromovelTest {
    public static void main(String[] args) {
        Astromovel astromovel = new Astromovel();
        astromovel.mostrarPosicaoAstromovel();

        astromovel.getEixo().moverNoEixoX(2);
        astromovel.getEixo().moverNoEixoY(2);

        astromovel.mudarDirecao("DIREITA");

        astromovel.mostrarPosicaoAstromovel();
    }
}
