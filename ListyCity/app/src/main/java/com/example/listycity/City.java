package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * This creates a city given a city and province name
     * @param city
     * This is the name of the created city
     * @param province
     * This is the name of the created province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This gets the name of a city
     * @return
     * Return the name of the city
     */
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    /**
     * This compares the city to another given city
     * @param o
     * The city being compared with
     * @return
     * Return the result of the comparison
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}
