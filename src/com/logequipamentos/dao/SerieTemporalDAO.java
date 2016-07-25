package com.logequipamentos.dao;

import java.util.List;

import javax.persistence.Query;

import com.logequipamentos.model.SerieTemporal;

public class SerieTemporalDAO extends GenericDAO<Integer, SerieTemporal> {

	public SerieTemporalDAO() {
		super(SerieTemporal.class);
	}

	public List<SerieTemporal> listar() {
		String sql = "select s from SerieTemporal";
		Query query = super.getEntityManager().createQuery(sql);

		@SuppressWarnings("unchecked")
		List<SerieTemporal> retorno = query.getResultList();
		return retorno;
	}

}
