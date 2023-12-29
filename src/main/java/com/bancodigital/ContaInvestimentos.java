package com.bancodigital;

public class ContaInvestimentos extends Conta{

    public ContaInvestimentos(Cliente cliente) {
		super(cliente);
	}


    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Investimentos ===");
        
    }
    
}
