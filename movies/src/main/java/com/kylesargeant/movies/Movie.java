package com.kylesargeant.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection="movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id //lets the framework know that this attribute will act as the main ID for the movie object
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference //allows the DB to only store the review's ID and call to a diff collection for the text with that id
    private List<Review> reviewIds;

}
