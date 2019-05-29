package xom.vikas.xmltopojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class FaultResp {

	@XStreamAsAttribute
	@XStreamAlias("xmlns:ns4")
	private String xmlnsns4;
	@XStreamAlias("faultcode")
	private String faultCode;
	@XStreamAlias("faultstring")
	private String faultString;

	public String getXmlnsns4() {
		return xmlnsns4;
	}

	public void setXmlnsns4(String xmlnsns4) {
		this.xmlnsns4 = xmlnsns4;
	}

	public String getFaultCode() {
		return faultCode;
	}

	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}

	public String getFaultString() {
		return faultString;
	}

	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}
}
