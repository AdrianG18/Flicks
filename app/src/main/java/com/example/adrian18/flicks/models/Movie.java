package com.example.adrian18.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

/**
 * Created by adrian18 on 6/21/17.
 */

@Parcel // annotation indicates class is Parcelable
public class Movie {

    // value from API
    String title;
    String overview;
    String posterPath; //only the path
    String backdropPath;
    Double voteAverage;
    Integer id;

    // no-arg, empty constructor required for Parceler
    public Movie() {}

    // initialize from JSON data
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
        id = object.getInt("id");
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public Integer getId() {
        return id;
    }
}
