package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo{
@Autowired
private EntityManager entityManager;
	@Override
	public void agregar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bancaria);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bancaria);
		
	}

	@Override
	public CuentaBancaria encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, id);
	}

}
