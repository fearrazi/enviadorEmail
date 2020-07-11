package br.com.alura.enviadorEmail.enviadorEmail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.alura.enviadorEmail.EmailService;

@SpringBootTest
class EnviadorEmailApplicationTests {

	@Test
	void contextLoads() {
		new EmailService().enviar("Fer", "fernanda_arrazi@hotmail.com");
	}

}
