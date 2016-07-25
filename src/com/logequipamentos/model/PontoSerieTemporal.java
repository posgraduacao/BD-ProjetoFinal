package com.logequipamentos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="PONTOSERIETEMPORAL")
public class PontoSerieTemporal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pontoserietemporal_id")
	private Integer id;
	private Date dataHoraMedicao;
	
	@ManyToMany
	@JoinColumn(name="serietemporal_id")
	private SerieTemporal serieTemporal;
	
	private double valor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataHoraMedicao() {
		return dataHoraMedicao;
	}

	public void setDataHoraMedicao(Date dataHoraMedicao) {
		this.dataHoraMedicao = dataHoraMedicao;
	}

	public SerieTemporal getSerieTemporal() {
		return serieTemporal;
	}

	public void setSerieTemporal(SerieTemporal serieTemporal) {
		this.serieTemporal = serieTemporal;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
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
		PontoSerieTemporal other = (PontoSerieTemporal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
