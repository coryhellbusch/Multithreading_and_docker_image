package edu.wgu.d387_sample_code.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.wgu.d387_sample_code.WelcomeMessage;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class WelcomeMessageController {

    @GetMapping("/welcome")
    public ResponseEntity<List<String>> getWelcomeMessage() {
        WelcomeMessage welcomeMessage = new WelcomeMessage();
        List<String> listWelcomeMessage = welcomeMessage.runWelcomeMessage();
        return ResponseEntity.ok(listWelcomeMessage);
    }
}
