package org.ensias.cours.controleur;


import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControleurTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@DisplayName("helloSpringTest")
	@Test
	public void helloSpringTest() throws Exception{
		this.mockMvc.perform(get("/hellospring"))
					.andDo(print())
					.andExpect(status().isOk())
					.andExpect(content().string(containsString("Bienvenue au framework Spring Boot")));
	}

}
