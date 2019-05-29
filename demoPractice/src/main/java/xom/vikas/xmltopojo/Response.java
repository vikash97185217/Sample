package xom.vikas.xmltopojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Response {
	@XStreamAsAttribute
	@XStreamAlias("xmlns:ns2")
	private String xmlnsns2;
	@XStreamAlias("return")
	private RespData respData;

	public String getXmlnsns2() {
		return xmlnsns2;
	}

	public void setXmlnsns2(String xmlnsns2) {
		this.xmlnsns2 = xmlnsns2;
	}

	public RespData getRespData() {
		return respData;
	}

	public void setRespData(RespData respData) {
		this.respData = respData;
	}

}
