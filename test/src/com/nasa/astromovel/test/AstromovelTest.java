package src.com.nasa.astromovel.test;

import com.nasa.astromovel.direction.Direcoes;
import com.nasa.astromovel.direction.Leste;
import com.nasa.astromovel.direction.Norte;
import com.nasa.astromovel.direction.Oeste;
import com.nasa.astromovel.entity.Astromovel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AstromovelTest {

    @InjectMocks
    Astromovel astromovel;

    @Test
    public void iniciarPorDefaultNoNorte() {

        Assert.assertEquals(astromovel.getDirecaoOlhar().getDirecao(), Direcoes.NORTE.name());
    }

    @Test
    public void estandoNoNorteComPosicaoXeYIgualAZeroAoMoverVirarParaOSul(){
        astromovel.mover(1);
        Assert.assertEquals(astromovel.getPosicaoX(), 0);
        Assert.assertEquals(astromovel.getPosicaoY(), 1);
        Assert.assertEquals(astromovel.getDirecaoOlhar().getDirecao(), Direcoes.SUL.name());
    }

    @Test
    public void comandoParaMover3PosicoesParaADirecaoSul() {
        astromovel.moverAstromovel("MMM");

        Assert.assertEquals(astromovel.getDirecaoOlhar().getDirecao(), Direcoes.SUL.name());
        Assert.assertEquals(3, astromovel.getPosicaoY());
    }

    @Test
    public void comandoParaMover3PosicoesParaADirecaoLeste() {
        astromovel.getDirecaoOlhar().mudarDirecao("DIREITA");
        astromovel.moverAstromovel("MMM");

        Assert.assertEquals(astromovel.getDirecaoOlhar().getDirecao(), Direcoes.LESTE.name());
        Assert.assertEquals(3, astromovel.getPosicaoX());
    }

    @Test
    public void comandoParaMoverParaADirecaoOesteEXIgualA4() {
        Astromovel astromovel1 = new Astromovel();
        astromovel1.setDirecaoOlhar(new Norte(astromovel1));
        astromovel1.moverAstromovel("L");

        Assert.assertEquals(astromovel1.getDirecaoOlhar(), new Oeste(astromovel1));
    }

    @Test
    public void comandoParaMoverParaADirecaoLeste() {
        Astromovel astromovel1 = new Astromovel();
        astromovel1.setDirecaoOlhar(new Norte(astromovel1));
        astromovel1.moverAstromovel("R");

        Assert.assertEquals(astromovel1.getDirecaoOlhar(), new Leste(astromovel1));
    }


}
