package br.com.campominado.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PixelTest {

	private Pixel pixel; 
	
	@BeforeEach
	void iniciarPixel (){
		pixel = new Pixel(3,3);
	}
	@Test
	void testVizinhoDistancia1Esquerda() {
		Pixel vizinho = new Pixel(3, 2);
		boolean resultado = pixel.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testVizinhoDistancia1Direita() {
		Pixel vizinho = new Pixel(3, 4);
		boolean resultado = pixel.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	// TODO criar testes para casos em cima e em baixo distancia 1
	@Test
	void testVizinhoDistancia2() {
		Pixel vizinho = new Pixel(2, 2);
		boolean resultado = pixel.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testNaoVizinho() {
		Pixel vizinho = new Pixel(1,1);
		boolean resultado = pixel.AdicionarVizinho(vizinho);
		assertFalse(resultado);
	}
}
