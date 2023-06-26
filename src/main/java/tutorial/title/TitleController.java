package tutorial.title;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/title")

public class TitleController {
    @Autowired
    private TitleService titleService;
    @GetMapping
    public ResponseEntity<List<Title>> getAllTitle() {
        return new ResponseEntity<List<Title>>(titleService.getAllTitle(), HttpStatus.OK);
    }

}
