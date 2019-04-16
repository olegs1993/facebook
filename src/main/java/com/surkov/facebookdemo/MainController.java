package com.surkov.facebookdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/home")
public class MainController {

    private final Facebook facebook;

    @Autowired
    public MainController(Facebook facebook) {
        this.facebook = facebook;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "HELLO";
    }
}
