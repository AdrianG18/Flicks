package com.example.adrian18.flicks;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.adrian18.flicks.models.Movie;

import java.util.ArrayList;

/**
 * Created by adrian18 on 6/21/17.
 */

public class MovieAdapter {

    // list of movies
    ArrayList<Movie> movies;

    // initialize with list

    public MovieAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    // create the viewholder as a static inner class
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
