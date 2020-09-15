package model.vo;

public class Endereco {
	
	//Atributos
	private int id;
	private String rua;
	private String numero;
	private String estado;
	private String cidade;
	
	//Construtores()
	public Endereco() {
		
	}
	
	public Endereco(int id, String rua, String numero, String estado, String cidade) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.estado = estado;
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return rua + ", n." + numero + ", " + cidade + " - " + estado;
	}

	//Getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
