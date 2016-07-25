package com.logequipamentos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UNIDADEMEDIDA")
public class UnidadeMedida {
	@Id
	@Column(name = "unidademedida_id")
	private String id;
	private String nomeUnidade;
	
	@ManyToMany(mappedBy="unidadeMedida")
	private SerieTemporal serieTemporal;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomeUnidade() {
		return nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}

	public SerieTemporal getSerieTemporal() {
		return serieTemporal;
	}

	public void setSerieTemporal(SerieTemporal serieTemporal) {
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
		UnidadeMedida other = (UnidadeMedida) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
