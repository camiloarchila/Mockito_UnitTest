package org.adaschool.Weather;

import org.adaschool.Weather.service.WeatherReportService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class WeatherApplicationTests {

	@Test
	void testWeatherReport() {
		WeatherReportService weatherReportService = new WeatherReportService();
		Assertions.assertEquals(86.0, weatherReportService.getWeatherReport(37.8267,-122.4233).getHumidity());
	}

}
