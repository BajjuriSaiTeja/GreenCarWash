package com.it.greenCarWash.UserService.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class orderController {

    public orderController() {
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String firstPage() {
        return "Hello World";
    }
}
