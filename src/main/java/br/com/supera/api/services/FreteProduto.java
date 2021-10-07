package br.com.supera.api.services;

import java.math.BigDecimal;

import br.com.supera.api.services.adapter.Frete;

public class FreteProduto implements Frete {

	@Override
	public BigDecimal calcularFrete(BigDecimal valorTotalDaCompra, BigDecimal valorFrete) {
		if (valorTotalDaCompra.intValue() >= 250) {
			return new BigDecimal("0.00");
		}
		return valorFrete;
	}

}
