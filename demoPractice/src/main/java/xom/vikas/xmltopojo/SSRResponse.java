package xom.vikas.xmltopojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class SSRResponse {
	@XStreamAsAttribute
	@XStreamAlias("xmlns:ns2")
	private String xmlnsns2;
	@XStreamAlias("return")
	private ResponseData responseData;

	public String getXmlnsns2() {
		return xmlnsns2;
	}

	public void setXmlnsns2(String xmlnsns2) {
		this.xmlnsns2 = xmlnsns2;
	}

	public ResponseData getResponseData() {
		return responseData;
	}

	public void setResponseData(ResponseData responseData) {
		this.responseData = responseData;
	}

}
