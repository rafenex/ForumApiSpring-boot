package br.com.alura.monitoramento;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class MonitoramentoApplication {

	 public static void main(String[] args) {
	        // SpringApplication.run(MonitoramentoApplication.class, args);
	        new SpringApplicationBuilder(MonitoramentoApplication.class).web(WebApplicationType.REACTIVE).run(args);
	    }

}
