/*
 * WeatherData.java 1.0 Sept 10, 2015
 *
 * Copyright (c) 2015 HFDP and DJP
 */
package headfirst.seniorstudent2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

/**
 * Observable (Subject) broadcasts out pressure, temperature and
 * humidity to all Observer
 * 
 * @author dpowell2
 * @version 1.0
 * 
 */
public class WeatherData extends Observable implements Serializable {

  private float humidity;
  private float pressure;
  private float temperature;

  /**
   * Initializes empty list of Observers
   */
  public WeatherData() {
    
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public float getTemperature() {
    return temperature;
  }

  public void measurementsChanged() {
	this.setChanged();
    System.out.println(this.toString());
    this.notifyObservers();
  }

  /**
   * Notifies all observers that data has changed. Precondition
   * assumed that any observer that has registered will all remove
   * itself when it no longer desires service
   */
  
  public void
    setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  @Override
  public String toString() {
    String s = "temperature: " + temperature;
    s = s + "\n" + "humidity: " + humidity;
    s = s + "\n" + "pressure: " + pressure;
    return s;
  }
}
