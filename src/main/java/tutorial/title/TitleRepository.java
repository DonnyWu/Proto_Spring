package tutorial.title;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TitleRepository extends MongoRepository<Title, ObjectId> {

}
