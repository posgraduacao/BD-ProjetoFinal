package com.logequipamentos.dao;

import java.util.List;

import javax.persistence.Query;

import com.logequipamentos.model.PontoSerieTemporal;

public class PontoSerieTemporalDAO extends GenericDAO<Integer, PontoSerieTemporal> {

	public PontoSerieTemporalDAO() {
		super(PontoSerieTemporal.class);
	}

	public List<PontoSerieTemporal> listar() {
		String sql = "select p from PontoSerieTemporal";
		Query query = super.getEntityManager().createQuery(sql);

		@SuppressWarnings("unchecked")
		List<PontoSerieTemporal> retorno = query.getResultList();
		return retorno;
	}

}
