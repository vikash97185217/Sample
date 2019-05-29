package xom.vikas.xmltopojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class RespData {

	@XStreamAlias("message")
	private String msg;
	@XStreamAlias("operation")
	private String operation;
	@XStreamAlias("result")
	private String result;
	@XStreamAlias("resultFormat")
	private String resultFmt;
	@XStreamAlias("status")
	private String status;
	@XStreamAlias("statusCode")
	private int statusCode;
	@XStreamAlias("transactionStatus")
	private String txnStatus;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResultFmt() {
		return resultFmt;
	}
	public void setResultFmt(String resultFmt) {
		this.resultFmt = resultFmt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getTxnStatus() {
		return txnStatus;
	}
	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}

}
