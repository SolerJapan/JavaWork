package com.movieapi.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;

@JsonIgnoreProperties
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {
	private int movie_id;
	private String title;
	private String director;
	private int year;
	private String genre;
	
}
