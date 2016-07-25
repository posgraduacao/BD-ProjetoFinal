package com.logequipamentos.dao;

import java.util.List;

import javax.persistence.Query;

import com.logequipamentos.model.UnidadeMedida;

public class UnidadeMedidaDAO extends GenericDAO<String, UnidadeMedida> {

	public UnidadeMedidaDAO() {
		super(UnidadeMedida.class);
	}

	public List<UnidadeMedida> listar() {
		String sql = "select u from UnidadeMedida";
		Query query = super.getEntityManager().createQuery(sql);

		@SuppressWarnings("unchecked")
		List<UnidadeMedida> retorno = query.getResultList();
		return retorno;
	}

}
