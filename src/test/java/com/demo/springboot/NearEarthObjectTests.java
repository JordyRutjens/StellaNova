package com.demo.springboot;

import com.demo.springboot.Logic.Mars;
import com.demo.springboot.Logic.NearEarthObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class NearEarthObjectTests {

	@Test
	void getNEO() {
		Date date = new Date();
		NearEarthObject neo = new NearEarthObject(4000f, date,"Earth", 23.33f, 211.45f);

		Assertions.assertEquals(neo.getOrbitingBody(), "Earth");
	}

	@Test
	void getNEOMaxDiameter() {
		Date date = new Date();
		NearEarthObject neo = new NearEarthObject(4000f, date,"Earth", 21.21f, 26.1f);

		Assertions.assertEquals(neo.getDiameterMaxEstemate(), 26.1f);
	}
	@Test
	void getNEOMinDiameter() {
		Date date = new Date();
		NearEarthObject neo = new NearEarthObject(4000f, date,"Earth", 21.21f, 26.1f);

		Assertions.assertEquals(neo.getDiameterMinEstemate(), 21.21f);
	}

}
