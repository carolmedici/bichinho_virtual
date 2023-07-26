package entities;

public class bichinho {
	
	private String nome;
	private String tipo;
	private int idade;
	private boolean estado;
	private int energia;
	private int forca;
	

	public bichinho(String nome, String tipo, int idade, int energia, int forca) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.idade = 0;
		this.estado = estado;
		this.energia = energia;
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

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
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
				+ " ano(s). Tipo: "
				+ tipo
				+ ". Estado: Vivo"
				+ ". Energia: "
				+ energia
				+ ". Força: "
				+ forca
				+ ".";
	}
	
	public void comer(String comida, int caloriasComida) {
        energia += caloriasComida;
        System.out.println(nome 
				+ " comeu "
				+ comida
				+ " Dados atualizados."
				+ " Idade: "
				+ idade
				+ " ano(s). Tipo: "
				+ tipo
				+ ". Estado: Vivo"
				+ ". Energia: "
				+ energia
				+ ". Força: "
				+ forca
				+ ".");
	}
	
	public void brincar( int energiaGasta, int forcaAdquirida) {
        energia += energiaGasta;
        forca += forcaAdquirida;
        System.out.println(nome 
				+ " brincou muito!"
				+ " Dados atualizados."
				+ " Idade: "
				+ idade
				+ " ano(s). Tipo: "
				+ tipo
				+ ". Estado: Vivo"
				+ ". Energia: "
				+ energia
				+ ". Força: "
				+ forca
				+ ".");
	}
	
	public void dormir(int energiaRecuperada) {
		energia = energiaRecuperada;
		System.out.println(nome 
				+ " dormiu zzzzz"
				+ " Dados atualizados."
				+ " Idade: "
				+ idade
				+ " ano(s). Tipo: "
				+ tipo
				+ ". Estado: Vivo"
				+ ". Energia: "
				+ energia
				+ ". Força: "
				+ forca
				+ ".");
	}
	
}
