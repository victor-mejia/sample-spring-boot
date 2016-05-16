package vams.controller.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vicmejia on 12/05/16.
 */
@RestController
public class HelloController {

    @RequestMapping("/service/hello")
    public String index(){
        return "Greetings from Spring Boot!";
    }


}
