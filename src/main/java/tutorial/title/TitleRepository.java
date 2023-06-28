package tutorial.title;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface TitleRepository extends MongoRepository<Title, ObjectId> {
    Optional<Title> findTitleByImdbId(String imdbId);
}