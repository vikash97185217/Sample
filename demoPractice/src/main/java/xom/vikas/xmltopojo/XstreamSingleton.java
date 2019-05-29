package xom.vikas.xmltopojo;

import java.io.Serializable;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.thoughtworks.xstream.mapper.CannotResolveClassException;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class XstreamSingleton implements Serializable,Cloneable{

	private static final long serialVersionUID = -4021316089851114794L;
	
	private static XStream xstream =null;
	
	private XstreamSingleton(){
		
	}
	
	public static XStream getInStance(){
		if(null==xstream){
			 xstream = new XStream(new XppDriver()) {
				protected MapperWrapper wrapMapper(MapperWrapper next) {
					return new MapperWrapper(next) {
						public boolean shouldSerializeMember(Class definedIn, String fieldName) {
							try {
								return definedIn != Object.class || realClass(fieldName) != null;
							} catch(CannotResolveClassException cnrce) {
								return false;
							}
						}
					};
				}
			};
		}
		return xstream;
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Unsupported Operation");
	}

}
