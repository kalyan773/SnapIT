package com.Groceries.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


public class ResourceConfig {
@Configuration
	public class ResourceConfig implements WebMvcConfigurer {
		@Override
	    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/uploads/**").addResourceLocations("file:uploads/");
	    }
}
}

