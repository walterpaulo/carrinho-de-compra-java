package br.com.supera.api.services.TDO;

import java.math.BigDecimal;

public class NotaTDO {
	
	private Long codigo;
    private String descricao;
    private int qtde;
    private BigDecimal unit;
    private BigDecimal vlTotal;
    private BigDecimal vlFrete;
    private BigDecimal vlTotalF;
	
    public NotaTDO(Long codigo, String descricao, int qtde, BigDecimal unit, BigDecimal vlTotal, BigDecimal vlFrete,
			BigDecimal vlTotalF) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtde = qtde;
		this.unit = unit;
		this.vlTotal = vlTotal;
		this.vlFrete = vlFrete;
		this.vlTotalF = vlTotalF;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public BigDecimal getVlTotal() {
		return vlTotal;
	}

	public void setVlTotal(BigDecimal vlTotal) {
		this.vlTotal = vlTotal;
	}

	public BigDecimal getVlFrete() {
		return vlFrete;
	}

	public void setVlFrete(BigDecimal vlFrete) {
		this.vlFrete = vlFrete;
	}

	public BigDecimal getVlTotalF() {
		return vlTotalF;
	}

	public void setVlTotalF(BigDecimal vlTotalF) {
		this.vlTotalF = vlTotalF;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getUnit() {
		return unit;
	}
    
    
	

    
    
    
    

}
