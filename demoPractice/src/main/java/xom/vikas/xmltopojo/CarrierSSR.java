package xom.vikas.xmltopojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
public class CarrierSSR {
	@XStreamAlias("ssrid")
	private String id;
	@XStreamAlias("ssrname")
	private String ssrName;
	@XStreamAlias("ssrcode")
	private String ssrCode;
	@XStreamAlias("chargeableamount")
	private String chargeableAmount;
	@XStreamAlias("currency")
	private String currency;
	@XStreamAlias("carrier")
	private String carrier;
	@XStreamAlias("markup")
	private String markup;
	@XStreamAlias("addedon")
	private String addedOn;
	@XStreamAlias("clientid")
	private String clientId;
	@XStreamAlias("ssrtype")
	private String ssrType;
	@XStreamAlias("depstation")
	private String depstation;
	@XStreamAlias("arrstation")
	private String arrstation;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSsrName() {
		return ssrName;
	}
	public void setSsrName(String ssrName) {
		this.ssrName = ssrName;
	}
	public String getChargeableAmount() {
		return chargeableAmount;
	}
	public void setChargeableAmount(String chargeableAmount) {
		this.chargeableAmount = chargeableAmount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getMarkup() {
		return markup;
	}
	public void setMarkup(String markup) {
		this.markup = markup;
	}
	public String getAddedOn() {
		return addedOn;
	}
	public void setAddedOn(String addedOn) {
		this.addedOn = addedOn;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getSsrType() {
		return ssrType;
	}
	public void setSsrType(String ssrType) {
		this.ssrType = ssrType;
	}
	public String getDepstation() {
		return depstation;
	}
	public void setDepstation(String depstation) {
		this.depstation = depstation;
	}
	public String getArrstation() {
		return arrstation;
	}
	public void setArrstation(String arrstation) {
		this.arrstation = arrstation;
	}
	public String getSsrCode() {
		return ssrCode;
	}
	public void setSsrCode(String ssrCode) {
		this.ssrCode = ssrCode;
	}
	
}
