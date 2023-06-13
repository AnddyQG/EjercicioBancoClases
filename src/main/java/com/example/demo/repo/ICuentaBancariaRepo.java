package com.example.demo.repo;

import com.example.demo.repo.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {

	public void agregar(CuentaBancaria bancaria);
	public void actualizar(CuentaBancaria bancaria);
	public CuentaBancaria encontrar(Integer id);
	
}
