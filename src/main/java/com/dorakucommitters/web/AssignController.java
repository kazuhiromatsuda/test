package com.dorakucommitters.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("assign")
public class AssignController {

    @RequestMapping(method = RequestMethod.GET)
    String list(Model model) {
        return "assign/list";
    }


}
