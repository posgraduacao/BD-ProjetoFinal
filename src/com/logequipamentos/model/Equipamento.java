package com.logequipamentos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EQUIPAMENTO")
public class Equipamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "equipamento_id")
	private Integer id;
	private String nome;
	private String descricao;

	@OneToMany
	@JoinColumn(name = "fabricante_id")
	private List<Fabricante> fabricante;

	@OneToMany(mappedBy = "equipamento", fetch = FetchType.EAGER)
	private List<Inspecao> inspecao;

	@OneToMany(mappedBy = "equipamento", fetch = FetchType.EAGER)
	private List<SerieTemporal> serieTemporal;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Fabricante> getFabricante() {
		return fabricante;
	}

	public void setFabricante(List<Fabricante> fabricante) {
		this.fabricante = fabricante;
	}

	public List<Inspecao> getInspecao() {
		return inspecao;
	}

	public void setInspecao(List<Inspecao> inspecao) {
		this.inspecao = inspecao;
	}

	public List<SerieTemporal> getSerieTemporal() {
		return serieTemporal;
	}

	public void setSerieTemporal(List<SerieTemporal> serieTemporal) {
		this.serieTemporal = serieTemporal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipamento other = (Equipamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
