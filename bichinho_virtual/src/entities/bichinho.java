package entities;

public class bichinho {
	
	private String nome;
	private String tipo;
	private int idade;
	private boolean estado;
	private int caloria;
	private int forca;

	public bichinho(String nome, String tipo, int idade, int caloria, int forca) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.idade = 0;
		this.estado = estado;
		this.caloria = caloria;
		this.forca = forca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getCaloria() {
		return caloria;
	}

	public void setCaloria(int caloria) {
		this.caloria = caloria;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	
	public String nascer() {
		return nome 
				+ " nasceu :)"
				+ " Idade: "
				+ idade
				+ " ano(s). Tipo:"
				+ tipo
				+ ". Estado: Vivo"
				+ ". Calorias: "
				+ caloria
				+ ". Força: "
				+ forca
				+ ".";
	}
	
	
	
}
