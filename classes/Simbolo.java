package classes;

public class Simbolo {
	private String nome; // nome do identificador
	private char tipo; // tipo da variável
	private int referencia; // é uma referência usada na geração do código
							// destino
	private static int marcador = 1; // armazena a última referência incluída na
										// tabela

	public String toString() {
		return "\n" + "Nome:" + this.getNome() + "\t" + "Tipo:"
				+ this.getTipo() + "\t" + "Referência:" + this.getReferencia();
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
