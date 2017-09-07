package com.theironyard.tiyspringbootdemo2;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String helloWorld(String name, Model model){
        
        model.addAttribute("userName", name);

        return "hello";
    }

}
