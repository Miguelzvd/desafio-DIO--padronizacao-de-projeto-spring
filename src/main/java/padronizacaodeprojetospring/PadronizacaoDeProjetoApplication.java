package padronizacaodeprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class PadronizacaoDeProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadronizacaoDeProjetoApplication.class, args);
	}

}
