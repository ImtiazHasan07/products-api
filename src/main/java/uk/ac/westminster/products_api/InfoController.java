package uk.ac.westminster.products_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String info(){
        return "This is a Spring Boot web application that exposes /hello and /status endpoints, documented and tested via an integrated Swagger UI browser interface.";
    }
}
