package xom.vikas.xmltopojo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.mysql.jdbc.StringUtils;
import com.thoughtworks.xstream.XStream;


public class XmlToPojo {
	public static void main (String[] args){
		String s = "";
		try {
			s = new String(Files.readAllBytes(Paths.get("C:/Users/ecare/Desktop/new.txt")));
			s =s.replaceAll("&lt;", "<").replaceAll("&gt;", ">").trim();
			//s="<S:Envelope xmlns:S='http://schemas.xmlsoap.org/soap/envelope/'><S:Body><ns2:GetSSRResponse xmlns:ns2='http://mercuryws.nextra.com/'><return><message>OK</message><operation>GetSSR</operation><result><SSRCollection><list><CarrierSSR><ssrid>2</ssrid><ssrname>Infant</ssrname><ssrcode>INFT</ssrcode><chargeableamount>1250.0</chargeableamount><currency>INR</currency><carrier>6E</carrier><markup>0</markup><addedon>2016-09-25 16:01:35.0</addedon><clientid>all</clientid><ssrtype>infant</ssrtype><depstation></depstation><arrstation></arrstation><ssrid>2</ssrid><ssrname>Infant</ssrname><ssrcode>INFT</ssrcode><chargeableamount>1250.0</chargeableamount><currency>INR</currency><carrier>6E</carrier><markup>0</markup><addedon>2016-09-25 16:01:35.0</addedon><clientid>all</clientid><ssrtype>infant</ssrtype><depstation></depstation><arrstation></arrstation></CarrierSSR></list></SSRCollection></result><resultFormat>XML</resultFormat><status>OK</status><statusCode>200</statusCode><transactionStatus></transactionStatus></return></ns2:GetSSRResponse></S:Body></S:Envelope>";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Body s2 = new XmlToPojo().parseResponse(s);
			Result s3 =s2.getSsrResp().getResponseData().getSsrResult();
			SSRCollection s4 =s3.getSsrCollection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  Body parseResponse(String response) throws Exception {
		try {
			if (StringUtils.isNullOrEmpty(response)) {
				throw new Exception("Response can't be null");
			}
			XStream xstream = XstreamSingleton.getInStance();
			xstream.processAnnotations(Envelope.class);
			Object o = xstream.fromXML(response);
			Envelope envelope = (Envelope) o;
			Body body = envelope.getBody();
			FaultResp faultResp = body.getFaultResp();
			if (faultResp != null) {
				throw new Exception(faultResp.getFaultString());
			}
			return body;
		} catch (Exception e) {
			String errorMsg = "Error occur while parsing response due to: " + e.getMessage();
			
			throw new Exception(e.getMessage());
		}
	}
}
