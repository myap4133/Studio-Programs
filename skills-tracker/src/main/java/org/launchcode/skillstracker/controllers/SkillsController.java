package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("")
    public String homePage(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<p>Click this <a href='/form'>form</a> to fill out your preferences.</p>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String skillForm(){
        return "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>" +
                "<input type='text' name='name'>" +
                "<select name='first'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<input type='submit' value='Submit Information'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    public String processForm(@RequestParam String name, @RequestParam String first,
                              @RequestParam String second, @RequestParam String third){
        return "<html>" +
                "<body>" +
                "<h1></h1>" +
                "</body>" +
                "</html>";
    }
}
