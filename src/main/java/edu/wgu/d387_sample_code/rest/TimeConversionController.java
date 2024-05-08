package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.TimeConversion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class TimeConversionController {

    @GetMapping("/time-conversion")
    public ResponseEntity<String> getTimeConversion() {
        TimeConversion timeConversion = new TimeConversion();
        String convertedTime = timeConversion.convertTime();
        return ResponseEntity.ok(convertedTime);
    }

}
