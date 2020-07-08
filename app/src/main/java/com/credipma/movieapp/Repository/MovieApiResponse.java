package com.credipma.movieapp.Repository;

import com.credipma.movieapp.Room.MovieEntity;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class MovieApiResponse {

    public MovieApiResponse() {
        this.results = new ArrayList<>();
    }

    private long page;

    @SerializedName("total_pages")
    private long totalPAges;

    @SerializedName("total_results")
    private long totalResults;

    private List<MovieEntity> results;


    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getTotalPAges() {
        return totalPAges;
    }

    public void setTotalPAges(long totalPAges) {
        this.totalPAges = totalPAges;
    }

    public long getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(long totalResults) {
        this.totalResults = totalResults;
    }

    public List<MovieEntity> getResults() {
        return results;
    }

    public void setResults(List<MovieEntity> results) {
        this.results = results;
    }
}
