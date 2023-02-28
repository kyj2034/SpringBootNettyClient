package study.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.server.Client;

@SpringBootApplication
public class SpringBootNettyClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Client.class, args);
		
	}

}
