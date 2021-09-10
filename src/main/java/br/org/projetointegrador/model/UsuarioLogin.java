package br.org.projetointegrador.model;

public class UsuarioLogin {

	private long id;

	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String coletor;
	
	private String token;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getColetor() {
		return coletor;
	}

	public void setColetor(String coletor) {
		this.coletor = coletor;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
