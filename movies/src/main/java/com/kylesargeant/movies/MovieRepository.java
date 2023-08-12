//Data Access Layer of API, talks to database to retrieve data
package com.kylesargeant.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId); //Framework is smart enough to know what we want from this. It know we want to be able to search movies by imdbId
}
