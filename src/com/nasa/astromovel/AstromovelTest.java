package com.nasa.astromovel;

import com.nasa.astromovel.direction.Leste;
import com.nasa.astromovel.direction.Oeste;
import com.nasa.astromovel.entity.Astromovel;

public class AstromovelTest {
    public static void main(String[] args) {
        Astromovel astromovel = new Astromovel();
        astromovel.mostrarPosicaoAstromovel();

        astromovel.moverAstromovel("MMRMMLM");
        astromovel.mostrarPosicaoAstromovel();

    }


}
