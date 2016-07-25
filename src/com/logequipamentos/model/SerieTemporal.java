package com.logequipamentos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SERIETEMPORAL")
public class SerieTemporal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "serietemporal_id")
	private Integer id;
	private String nomeSerie;
	
	@ManyToMany
	@JoinColumn(name = "unidademedida_id")
	private UnidadeMedida unidadeMedida;
	
	@ManyToMany
	@JoinColumn(name = "equipamento_id")
	private Equipamento equipamento;
	
	@OneToMany(mappedBy="serieTemporal")
	private List<PontoSerieTemporal> pontoSerieTemporal;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeSerie() {
		return nomeSerie;
	}

	public void setNomeSerie(String nomeSerie) {
		this.nomeSerie = nomeSerie;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public List<PontoSerieTemporal> getPontoSerieTemporal() {
		return pontoSerieTemporal;
	}

	public void setPontoSerieTemporal(List<PontoSerieTemporal> pontoSerieTemporal) {
		this.pontoSerieTemporal = pontoSerieTemporal;
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
		SerieTemporal other = (SerieTemporal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
