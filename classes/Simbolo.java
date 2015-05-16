package classes;

public class Simbolo {
	private String nome; // nome do identificador
	private char tipo; // tipo da vari�vel
	private int referencia; // � uma refer�ncia usada na gera��o do c�digo
							// destino
	private static int marcador = 1; // armazena a �ltima refer�ncia inclu�da na
										// tabela

	public String toString() {
		return "\n" + "Nome:" + this.getNome() + "\t" + "Tipo:"
				+ this.getTipo() + "\t" + "Refer�ncia:" + this.getReferencia();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(char tipo) {
		switch (tipo) {
		case 'N':
			Simbolo.marcador += 2;
			break;
		case 'S':
			Simbolo.marcador++;
			break;
		}
		this.referencia = Simbolo.marcador;
	}

	public static int getMarcador() {
		return marcador;
	}

	public static void setMarcador(int marcador) {
		Simbolo.marcador = marcador;
	}
}
