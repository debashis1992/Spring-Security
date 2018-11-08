package org.debashis.practice.app;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String sayGreeting(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "greetings";
    }

}
