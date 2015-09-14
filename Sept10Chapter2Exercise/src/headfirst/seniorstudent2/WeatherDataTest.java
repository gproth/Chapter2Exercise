package headfirst.seniorstudent2;

import static org.junit.Assert.*;

import java.util.Observable;
import java.util.Observer;

import org.junit.Test;

public class WeatherDataTest {
	
	
	@Test
	public void testSetMeasurements() {
		WeatherData weather = new WeatherData();
		weather.setMeasurements(20, 30, 40);
		assertEquals(weather.getTemperature(),20,.1);
		assertEquals(weather.getHumidity(),30,.1);
		assertEquals(weather.getPressure(),40,.1);
	}

	@Test
	public void testAddObserver() {
		Observable weather = new WeatherData();
		Observer test = new TestObserver();
		int initial = weather.countObservers();
		weather.addObserver(test);
		int end = weather.countObservers(); 
		if(end == initial){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testDeleteObserver() {
		Observable weather = new WeatherData();
		Observer test = new TestObserver();
		weather.addObserver(test);
		int initial = weather.countObservers();
		weather.deleteObserver(test);
		if(weather.countObservers() != (initial-1) ){
			fail("Not yet implemented");
		}
	}
	
	
	public class TestObserver implements Observer{

		public TestObserver(){
			
		}
		
		
		@Override
		public void update(Observable o, Object arg) {
		}
		
	}

}
