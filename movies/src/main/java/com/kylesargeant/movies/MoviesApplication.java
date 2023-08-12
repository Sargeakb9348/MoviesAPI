package com.kylesargeant.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

//	private static void loadEnvVars() {
//		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
//		System.setProperty("spring.data.mongodb.uri", "mongodb+srv://" +
//				dotenv.get("MONGO_USERNAME") + ":" +
//				dotenv.get("MONGO_PASSWORD") + "@" +
//				dotenv.get("MONGO_CLUSTER") + "/" +
//				dotenv.get("MONGO_DATABASE") + "?retryWrites=true&w=majority");
//	}
}
