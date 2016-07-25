package com.logequipamentos.dao;

import java.util.List;

import javax.persistence.Query;

import com.logequipamentos.model.Equipamento;

public class EquipamentoDAO extends GenericDAO<Integer, Equipamento> {
	public EquipamentoDAO() {
		super(Equipamento.class);
	}
	
	public List<Equipamento> listar() {
		String sql = "select e from Equipamento";
		Query query = super.getEntityManager().createQuery(sql);
		
		@SuppressWarnings("unchecked")
		List<Equipamento> retorno = query.getResultList();
		return retorno;
	}
}
