package xom.vikas.xmltopojo;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class SsrList {
	
	@XStreamImplicit(itemFieldName = "CarrierSSR")
	private List<CarrierSSR> carrierSSR;

	public List<CarrierSSR> getCarrierSSR() {
		return carrierSSR;
	}

	public void setCarrierSSR(List<CarrierSSR> carrierSSR) {
		this.carrierSSR = carrierSSR;
	}
}
