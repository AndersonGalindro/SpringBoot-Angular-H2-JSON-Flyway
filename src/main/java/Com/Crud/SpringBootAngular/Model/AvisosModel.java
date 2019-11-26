package Com.Crud.SpringBootAngular.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AvisosModel {

	@Id
	@GeneratedValue
	private Integer id;
	private String titulo;
	private String descricao;
	private Date dataDoEvento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataDoEvento() {
		return dataDoEvento;
	}

	public void setDataDePublicacao(Date dataDoEvento) {
		this.dataDoEvento = dataDoEvento;
	}

}
