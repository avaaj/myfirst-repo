package com.avaaj.application;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class MyServletInitializer extends SpringBootServletInitializer{
	
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder application){ {
		return application.sources(MyServletInitializer.class);
	}
	}

}
