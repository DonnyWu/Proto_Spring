package tutorial.title;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TitleService {
    @Autowired
    private TitleRepository titleRepository;
    public List<Title> getAllTitle(){
        return titleRepository.findAll();
    }

    public Optional<Title> singleTitle(String imdbId){
        return titleRepository.findTitleByImdbId(imdbId);
    }
}
