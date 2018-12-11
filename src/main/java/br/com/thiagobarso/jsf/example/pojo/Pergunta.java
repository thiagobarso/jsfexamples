package br.com.thiagobarso.jsf.example.pojo;

public class Pergunta {

	private Long id;
	
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pergunta(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Pergunta() {
		super();
	}
	
	
}
