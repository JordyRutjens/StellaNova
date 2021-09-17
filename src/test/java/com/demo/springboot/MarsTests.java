package com.demo.springboot;

import com.demo.springboot.Logic.Mars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class MarsTests {

	@Test
	void getMarsWeather() {
		Date date = new Date();
		Mars mars = new Mars(4, 20,date, 1);

		Assertions.assertEquals(mars.getTemperature(), 4);
	}

	@Test
	void getMarsHumidity() {
		Date date = new Date();
		Mars mars = new Mars(4, 20,date, 1);

		Assertions.assertEquals(mars.getHumidity(), 20);
	}
}
