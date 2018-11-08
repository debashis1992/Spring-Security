package org.debashis.practice.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/greeting")
    public String sayGreeting() {
        return "greetings";
    }

}
