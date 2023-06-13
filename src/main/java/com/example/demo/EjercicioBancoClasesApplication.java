package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.CuentaBancaria;
import com.example.demo.service.ICuentaBancariaService;

@SpringBootApplication
public class EjercicioBancoClasesApplication implements CommandLineRunner{
@Autowired
private ICuentaBancariaService bancariaService;
	public static void main(String[] args) {
		SpringApplication.run(EjercicioBancoClasesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		CuentaBancaria bancaria= new CuentaBancaria();
		bancaria.setCedulaPropietario("1721");
		bancaria.setNumero("123");
		bancaria.setSaldo(new BigDecimal(200));
		bancaria.setTipo("A");
		
		//this.bancariaService.apertura(bancaria);
		
		
		CuentaBancaria cuentaEncontrar=this.bancariaService.consultar(1);
		cuentaEncontrar.setNumero("321");
		System.out.println(cuentaEncontrar.getCedulaPropietario());
		System.out.println("El saldo es " + cuentaEncontrar.getSaldo());
		
	}

}
