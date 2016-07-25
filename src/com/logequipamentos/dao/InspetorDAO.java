package com.logequipamentos.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.logequipamentos.model.Inspetor;

public class InspetorDAO extends GenericDAO<Integer, InspetorDAO> {

	public InspetorDAO() {
		super(InspetorDAO.class);
	}

	public List<InspetorDAO> listar() {
		String sql = "select i from Inspetor";
		Query query = super.getEntityManager().createQuery(sql);

		@SuppressWarnings("unchecked")
		List<InspetorDAO> retorno = query.getResultList();
		return retorno;
	}
	
	public Inspetor findByCPF(Long cpf){
		Query query = super.getEntityManager().
				createNamedQuery("Inspetor.findBycpf");
		query.setParameter("cpf", cpf);
		try{
			Inspetor retorno = (Inspetor)query.getSingleResult();
			return retorno;
		}catch(NoResultException nr){
			return null;
		}
	}

}
