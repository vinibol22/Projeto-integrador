package br.org.projetointegrador.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "tb_postagens")
public class Postagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	
	@NotNull(message="o atributo titulo é obrigatório")
	@Size(min = 5, max = 255, message="o atributo título deve ter no minimo 5 e no máximo 100 carácteres")
	private String titulo;
	
	@NotNull(message="o atributo texto é obrigatório")
	@Size(min = 5, max = 5000, message="o atributo título deve ter no minimo 5 e no máximo 5000 carácteres")
	private String texto;
	
	
	@NotNull(message="o atributo localização é obrigatório")
	@Size(min = 5, max=255,message="o atributo localização deve ter no minimo 5 e no máximo 255 caracteres" )
	private String localizacao;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data=new java.sql.Date(System.currentTimeMillis());

	

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	}


