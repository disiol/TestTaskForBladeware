
package com.denisimusit.testtask.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Result {

    @SerializedName("abbr")
    private String abbr;
    @SerializedName("area")
    private String area;
    @SerializedName("capital")
    private String capital;
    @SerializedName("country")
    private String country;
    @SerializedName("id")
    private Long id;
    @SerializedName("largest_city")
    private String largestCity;
    @SerializedName("name")
    private String name;

    public Result(String abbr, String area, String capital, String country, Long id, String largestCity, String name) {
        this.abbr = abbr;
        this.area = area;
        this.capital = capital;
        this.country = country;
        this.id = id;
        this.largestCity = largestCity;
        this.name = name;
    }

    public String getAbbr() {
        return abbr;
    }

    public String getArea() {
        return area;
    }

    public String getCapital() {
        return capital;
    }

    public String getCountry() {
        return country;
    }

    public Long getId() {
        return id;
    }

    public String getLargestCity() {
        return largestCity;
    }

    public String getName() {
        return name;
    }
}
