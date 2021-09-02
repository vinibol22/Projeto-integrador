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
@Table(name = "tb_temas")
public class Tema{
	    
	    @Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull(message = "O atributo Descrição deve ser obrigatório")
		@Size(min = 5, max = 400, message="o atributo Descrição deve ter no minimo 5 e no máximo 400 carácteres")
		private String descricao;
		
		@NotNull(message = "O tipo do tema é obrigatório")
		@Size(min = 5, max = 400, message="o atributo Tema-tipo deve ter no minimo 5 e no máximo 400 carácteres")
		private String temaTipo;
		
		@NotNull(message = "Palavra chave é obrigatório")
		@Size(min = 5, max = 255, message="o atributo Palavra-chave deve ter no minimo 5 e no máximo 255 carácteres")
		private String palavraChave;	
		
		
		
		@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
		@JsonIgnoreProperties({"tema"})
		private List<Postagem> postagem;
		
		
		public String getTemaTipo() {
			return temaTipo;
		}

		public void setTemaTipo(String temaTipo) {
			this.temaTipo = temaTipo;
		}

		public String getPalavraChave() {
			return palavraChave;
		}

		public void setPalavraChave(String palavraChave) {
			this.palavraChave = palavraChave;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public List<Postagem> getPostagem() {
			return postagem;
		}

		public void setPostagem(List<Postagem> postagem) {
			this.postagem = postagem;
		}
		
		}