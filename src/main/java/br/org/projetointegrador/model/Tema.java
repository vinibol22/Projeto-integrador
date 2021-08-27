package br.org.projetointegrador.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_temas")
public class Tema{
	    
	    @Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull(message = "O atributo Descrição deve ser obrigatório")
		private String descricao;
		
		@NotNull(message = "O tipo do tema é obrigatório")
		private String temaTipo;
		
		@NotNull(message = "Palavra chave é obrigatório")
		private String palavraChave;	
		
		@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("tema")
		
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
		}