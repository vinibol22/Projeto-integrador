package br.org.projetointegrador.model;




import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	
	@NotNull(message ="o atributo nome é obrigatório")	
	@Size(min = 5, max = 255, message="o atributo nome deve ter no minimo 5 e no máximo 255 carácteres")
	private String nome;
	
	@NotNull(message ="o atributo e-mail é obrigatório")	
	@Size(min = 5, max = 255, message="o atributo e-mail deve ter no minimo 5 e no máximo 255 carácteres")
	private String email;
	
	@NotNull(message ="o atributo senha é obrigatório")	
	@Size(min = 5, max = 500, message="o atributo senha deve ter no minimo 5 e no máximo 500 carácteres")
	private String senha;
	
	@NotNull(message ="o atributo coletor é obrigatório")	
	@Size(min = 5, max = 255, message="o atributo coletor deve ter no minimo 5 e no máximo 255 carácteres")
	private String coletor;
	
	
	

	
	/*@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<Postagem>postagem;*/

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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


	
	
}
