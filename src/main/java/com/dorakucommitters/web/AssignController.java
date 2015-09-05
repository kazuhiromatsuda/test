package com.dorakucommitters.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AssignController {

    @RequestMapping(method = RequestMethod.GET)
    String list(Model model) {
        return "assign/hotentry";
    }

    @RequestMapping(value = "assign/login")
    public String login() {
        return "assign/login";
    }

    @RequestMapping(value = "assign/searchskill")
    public String searchSkill() {
        return "assign/searchskill";
    }

}
