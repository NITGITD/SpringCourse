package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("per")
@PropertySource("com/nt/common/info.properties")
public class PersonInfo {

	@Value("${per.name}")
	private String pname;
	@Value("${per.addrs}")
	private String paddrs;
	@Value("${per.age}")
	private int page;
	@Override
	public String toString() {
		return "PersonInfo [pname=" + pname + ", paddrs=" + paddrs + ", page=" + page + "]";
	}
	
}
