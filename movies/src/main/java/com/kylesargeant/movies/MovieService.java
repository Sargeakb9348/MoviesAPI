// where business logic will take place
package com.kylesargeant.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired //lets the framework know we want it to instantiate the below class for us.
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();//findAll() is a MongoRepository method
    }

    public Optional<Movie> singleMovie(String imdbId){ //Optional<> allows us to return Objects AND Null
        return movieRepository.findMovieByImdbId(imdbId);//findMovieByImdbId() is a method we added to movie repository class
    }
}
