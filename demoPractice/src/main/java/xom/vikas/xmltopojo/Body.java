package xom.vikas.xmltopojo;



import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("S:Body")
public class Body {

	@XStreamAlias("S:Fault")
	private FaultResp faultResp;
	@XStreamAlias("ns2:GetFareRulesResponse")
	private Response fareRuleResp;

	@XStreamAlias("ns2:BookFlightResponse")
	private Response bookResp;

	@XStreamAlias("ns2:BookFlightIntlResponse")
	private Response bookRespIntl;

	@XStreamAlias("ns2:GetItineraryDetailsResponse")
	private Response FlightItineraryResp;

	@XStreamAlias("ns2:GetSSRResponse")
	private SSRResponse ssrResp;

	@XStreamAlias("ns2:CancelFlightResponse")
	private Response cancelFlightResp;

	@XStreamAlias("ns2:GetCancellationStatusResponse")
	private Response getCancelStatusResp;


	public FaultResp getFaultResp() {
		return faultResp;
	}

	public void setFaultResp(FaultResp faultResp) {
		this.faultResp = faultResp;
	}


	public Response getFareRuleResp() {
		return fareRuleResp;
	}

	public void setFareRuleResp(Response fareRuleResp) {
		this.fareRuleResp = fareRuleResp;
	}

	public Response getBookResp() {
		return bookResp;
	}

	public void setBookResp(Response bookResp) {
		this.bookResp = bookResp;
	}

	public Response getFlightItineraryResp() {
		return FlightItineraryResp;
	}

	public void setFlightItineraryResp(Response flightItineraryResp) {
		FlightItineraryResp = flightItineraryResp;
	}

	public SSRResponse getSsrResp() {
		return ssrResp;
	}

	public void setSsrResp(SSRResponse ssrResp) {
		this.ssrResp = ssrResp;
	}

	public Response getCancelFlightResp() {
		return cancelFlightResp;
	}

	public void setCancelFlightResp(Response cancelFlightResp) {
		this.cancelFlightResp = cancelFlightResp;
	}

	public Response getBookRespIntl() {
		return bookRespIntl;
	}

	public void setBookRespIntl(Response bookRespIntl) {
		this.bookRespIntl = bookRespIntl;
	}

	public Response getGetCancelStatusResp() {
		return getCancelStatusResp;
	}

	public void setGetCancelStatusResp(Response getCancelStatusResp) {
		this.getCancelStatusResp = getCancelStatusResp;
	}

}
