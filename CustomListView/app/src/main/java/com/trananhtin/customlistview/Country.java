package com.trananhtin.customlistview;

public class Country {
    private String countryName;
    private String countryFlag;
    private int population;
    public Country(String countryName,String countryFlag,int population){
        this.countryName=countryName;
        this.countryFlag=countryFlag;
        this.population=population;
    }
    public String getCountryName(){
        return countryName;
    }
    public String getCountryFlag(){
        return countryFlag;
    }
    public int getPopulation(){
        return population;
    }
}
