package com.nikhilzzz.SpringBootP03;

import com.nikhilzzz.SpringBootP03.Beans.Flipkart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootP03Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootP03Application.class, args);
		Flipkart bean = context.getBean(Flipkart.class);
		bean.paymentGateway("2567");
	}

}
