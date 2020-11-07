package br.com.campominado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pixel {
	
	private boolean minado; // padrão false
	private boolean aberto;
	private boolean marcado;
	
	private final int linha;
	private final int coluna;
	
	private List<Pixel> vizinhos = new ArrayList<>();
	
	Pixel(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public boolean AdicionarVizinho (Pixel vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if (deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
}
