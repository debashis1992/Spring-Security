package org.debashis.practice.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("classpath:application-local.properties")
@ConfigurationProperties(prefix = "myspace")
public class MyDomain {
    private String app;
    private String name;
    private List<String> resource;

	public List<String> getResource() {
		return resource;
	}

	public void setResource(List<String> resource) {
		this.resource = resource;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyDomain{" +
				"app='" + app + '\'' +
				", name='" + name + '\'' +
				", resource=" + resource +
				'}';
	}
}
