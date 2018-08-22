package silva.cloud.practica.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SilvaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SilvaServerApplication.class, args);
	}
}
