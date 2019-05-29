package xom.vikas.xmltopojo;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Result {
	@XStreamAlias("SSRCollection")
	private SSRCollection ssrCollection;

	public SSRCollection getSsrCollection() {
		return ssrCollection;
	}

	public void setSsrCollection(SSRCollection ssrCollection) {
		this.ssrCollection = ssrCollection;
	}


	
}
