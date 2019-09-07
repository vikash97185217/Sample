package com.vikas.collections;

import java.math.BigDecimal;

public class Sallary {
	private BigDecimal basic;
	
	private BigDecimal da;
	public BigDecimal getBasic() {
		return basic;
	}
	public void setBasic(BigDecimal basic) {
		this.basic = basic;
	}
	public BigDecimal getDa() {
		return da;
	}
	public void setDa(BigDecimal da) {
		this.da = da;
	}
	@Override
	public String toString() {
		return "Sallary [basic=" + basic + ", da=" + da + "]";
	}
}
