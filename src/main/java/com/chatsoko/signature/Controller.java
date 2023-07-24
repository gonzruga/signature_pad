package com.chatsoko.signature;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    // Create a mapping for "/sign"
    @GetMapping("/sign")
    public String sayHello(Model theModel) {

//        theModel.addAttribute("", new __());


        return "customersignature";
    }


}
