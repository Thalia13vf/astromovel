package com.nasa.astromovel.direction;

public interface Direction {
    public void mudarDirecao(String direcao);
    public String getDirecao();

    public void mover(int quantidade);

    public boolean estaNaBorda();

}
