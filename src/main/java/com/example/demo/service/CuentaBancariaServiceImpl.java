package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.ICuentaBancariaRepo;
import com.example.demo.repo.modelo.CuentaBancaria;
@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{
@Autowired
private ICuentaBancariaRepo bancariaRepo;
	@Override
	public void apertura(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		LocalDateTime fechaAper=LocalDateTime.now();
		bancaria.setFechaApertura(fechaAper);
		int diaMes=fechaAper.getDayOfMonth();
		if(diaMes%2==0) {
			BigDecimal saldoAper=bancaria.getSaldo();
			BigDecimal saldoPromocion=bancaria.getSaldo().multiply(new BigDecimal(0.05));
			BigDecimal saldoFinal=saldoAper.add(saldoPromocion);
			bancaria.setSaldo(saldoFinal);
		}
		
		
		this.bancariaRepo.agregar(bancaria);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepo.actualizar(bancaria);
	}

	@Override
	public CuentaBancaria consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.bancariaRepo.encontrar(id);
	}

}
