package tutorial.title;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TitleService {
    @Autowired
    private TitleRepository titleRepository;
    public List<Title> getAllTitle(){
        return titleRepository.findAll();
    }
}
