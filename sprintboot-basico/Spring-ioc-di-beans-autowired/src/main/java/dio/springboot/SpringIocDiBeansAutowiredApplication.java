package dio.springboot;

import dio.springboot.app.ConversorJson;
import dio.springboot.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringIocDiBeansAutowiredApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIocDiBeansAutowiredApplication.class, args);
	}

    @Bean
    public CommandLineRunner run (ConversorJson conversor) throws Exception{
        return args -> {
          String json = "{\"cep\": \"01001-00\",\"logadouro\":\"Praca da Se\",\"localidade}";
          ViaCepResponse response = conversor.coverter(json);
            System.out.println("Dados do CEP: " + response);

        };

    };

}
