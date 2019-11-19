package ifsc.projeto.pesquisa.sd.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import ifsc.projeto.pesquisa.sd.ws.utilidades.ProjetosUtil;


/*
 * Heroku Aplicação - https://projetos-pesquisa-api.herokuapp.com/
 * Heroku swagger - https://projetos-pesquisa-api.herokuapp.com/swagger-ui.html
 * 
 * LocalHost swagger - http://localhost:8081/swagger-ui.htm
 * LocalHost Aplicação - http://localhost:8081
 * */

@SpringBootApplication
@ComponentScan
public class ProjetoIfscSdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoIfscSdApplication.class, args);
	}

}
