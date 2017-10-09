package authenticationCamelApp.main;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class nameProcessor implements Processor {
	public void process(Exchange exchange) {
		String name = (String) exchange.getIn().getHeader(exchange.FILE_NAME);
		 int index = name.indexOf("-");
		 int index2 = name.indexOf(".");
		 String newName = name.replace(name.substring(index, index2), "");
		 exchange.getIn().setHeader(exchange.FILE_NAME, newName);
	}
}