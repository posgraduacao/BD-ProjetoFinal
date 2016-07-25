package com.logequipamentos.dao;

import java.util.List;

import javax.persistence.Query;

import com.logequipamentos.model.Fabricante;

public class FabricanteDAO extends GenericDAO<Integer, Fabricante>{

	public FabricanteDAO() {
		super(Fabricante.class);
	}
	
	public List<Fabricante> listar() {
		String sql = "select f from Fabricante";
		Query query = super.getEntityManager().createQuery(sql);
		
		@SuppressWarnings("unchecked")
		List<Fabricante> retorno = query.getResultList();
		return retorno;
	}
}
