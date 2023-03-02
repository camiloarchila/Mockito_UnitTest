package org.adaschool.Weather;

import org.adaschool.Weather.controller.WeatherReportController;
import org.adaschool.Weather.data.WeatherReport;
import org.adaschool.Weather.service.WeatherReportService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class WeatherApplicationTests {

	@InjectMocks
	private WeatherReportService weatherReportService;

	@Mock
	private WeatherReport weatherReport;

	@Test
	void testWeatherReport() {
		MockitoAnnotations.initMocks(this);
		 WeatherReportController weatherReportController = mock(WeatherReportController.class);
		weatherReportController.getWeatherReport(37.8267, -122.4233);
		Assertions.assertEquals(weatherReport.getHumidity(), weatherReportService.getWeatherReport(37.8267,-122.4233).getHumidity());
	}

}
