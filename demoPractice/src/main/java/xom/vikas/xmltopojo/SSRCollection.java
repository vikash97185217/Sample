package xom.vikas.xmltopojo;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SSRCollection {
	@XStreamAlias("list")
	private SsrList ssrlist;

	public SsrList getSsrlist() {
		return ssrlist;
	}

	public void setSsrlist(SsrList ssrlist) {
		this.ssrlist = ssrlist;
	}

	
}
