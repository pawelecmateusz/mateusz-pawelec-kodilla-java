package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public double calculateForecastAverage() {
        double sum = 0;
        for (Double temperature : temperatures.getTemperatures().values()) {
            sum += temperature;
        }
        return sum / temperatures.getTemperatures().size();
    }
    public double calculateForecastMedian() {
        List<Double> temperatureList = new ArrayList<>(temperatures.getTemperatures().values());
        temperatureList.sort(Comparator.naturalOrder());
        int middle = temperatureList.size() / 2;
        if (temperatureList.size() % 2 == 1) {
            return temperatureList.get(middle);
        } else {
            return (temperatureList.get(middle - 1) + temperatureList.get(middle)) / 2.0;
        }
    }
    public Map<String, Double> calculateForeceast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
}
