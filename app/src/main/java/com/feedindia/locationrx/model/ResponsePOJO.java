package com.feedindia.locationrx.model;

import java.util.List;

public class ResponsePOJO {

    private String code;
    private List<List<Double>> distances = null;
    private List<List<Double>> durations = null;
    private List<Loc> destinations = null;
    private List<Loc> sources = null;

    public ResponsePOJO(String code) {
        this.code = code;
    }

    public ResponsePOJO(String code, List<List<Double>> distances, List<List<Double>> durations, List<Loc> destinations, List<Loc> sources) {
        this.code = code;
        this.distances = distances;
        this.durations = durations;
        this.destinations = destinations;
        this.sources = sources;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<List<Double>> getDistances() {
        return distances;
    }

    public void setDistances(List<List<Double>> distances) {
        this.distances = distances;
    }

    public List<List<Double>> getDurations() {
        return durations;
    }

    public void setDurations(List<List<Double>> durations) {
        this.durations = durations;
    }

    public List<Loc> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Loc> destinations) {
        this.destinations = destinations;
    }

    public List<Loc> getSources() {
        return sources;
    }

    public void setSources(List<Loc> sources) {
        this.sources = sources;
    }
}

class Loc{
    private Double distance;
    private String name;
    private List<Double> location;

    public Loc() {
    }

    public Loc(Double distance, String name, List<Double> location) {
        this.distance = distance;
        this.name = name;
        this.location = location;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }
}