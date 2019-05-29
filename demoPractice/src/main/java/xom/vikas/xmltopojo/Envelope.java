package xom.vikas.xmltopojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("S:Envelope")
public class Envelope {

	@XStreamAsAttribute
	@XStreamAlias("xmlns:S")
	private String xmlnss;
	@XStreamAlias("S:Body")
	private Body body;

	public String getXmlnss() {
		return xmlnss;
	}

	public void setXmlnss(String xmlnss) {
		this.xmlnss = xmlnss;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

}
