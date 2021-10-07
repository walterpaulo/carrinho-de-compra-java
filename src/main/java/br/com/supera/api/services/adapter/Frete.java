package br.com.supera.api.services.adapter;

import java.math.BigDecimal;

public interface Frete {

	public BigDecimal calcularFrete(BigDecimal valorTotalDaCompra, BigDecimal valorFrete);
}
