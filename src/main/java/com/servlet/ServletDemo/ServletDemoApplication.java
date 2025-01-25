package com.servlet.ServletDemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ServletDemoApplication {

	public static void main(String[] args) throws LifecycleException, ServletException {
		SpringApplication.run(ServletDemoApplication.class, args);
		System.out.println("Hey Dummy!!");
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		Context context = tomcat.addContext("",null);
		Tomcat.addServlet(context,"DummyServlet", new DummyServlet());
		context.addServletMappingDecoded("/dummy", "DummyServlet");
		tomcat.start();
		tomcat.getServer().await();
	}

}
