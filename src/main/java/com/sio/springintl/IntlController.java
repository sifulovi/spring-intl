package com.sio.springintl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntlController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/way2")
    public String index2() {
        return "index2";
    }
}
