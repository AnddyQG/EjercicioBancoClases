package com.example.demo.service;

import com.example.demo.repo.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	
	public void apertura(CuentaBancaria bancaria);
	public void actualizar(CuentaBancaria bancaria);
	public CuentaBancaria consultar(Integer id);
	
	
}
