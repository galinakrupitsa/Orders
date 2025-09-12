package com.example.resttemplate;

import java.util.List;

public class NationalizeResponse {
    private String name;
    private List<Country> country;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Country> getCountry() { return country; }
    public void setCountry(List<Country> country) { this.country = country; }

    public static class Country {
        private String country_id;
        private double probability;

        public String getCountry_id() { return country_id; }
        public void setCountry_id(String country_id) { this.country_id = country_id; }

        public double getProbability() { return probability; }
        public void setProbability(double probability) { this.probability = probability; }
    }
}
