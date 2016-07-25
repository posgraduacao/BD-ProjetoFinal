package com.logequipamentos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="INSPECAO")
public class Inspecao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="inspecao_id")
	private Integer id;
	private Date dataInspecao;
	private String relatorio;
	
	@OneToOne
	@JoinColumn(name="inspetor_id")
	private Inspetor inspetor;
	
	@ManyToOne
	@JoinColumn(name="equipamento_id")
	private Equipamento equipamento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataInspecao() {
		return dataInspecao;
	}

	public void setDataInspecao(Date dataInspecao) {
		this.dataInspecao = dataInspecao;
	}

	public String getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(String relatorio) {
		this.relatorio = relatorio;
	}

	public Inspetor getInspetor() {
		return inspetor;
	}

	public void setInspetor(Inspetor inspetor) {
		this.inspetor = inspetor;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
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
		Inspecao other = (Inspecao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
