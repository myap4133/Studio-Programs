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
                "<h2>We have a few skills we would like to learn. Here is a list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>C++</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<p>Click this <a href='/form'>form</a> to fill out your preferences.</p>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String skillForm(){
        return "<html>" +
                "<body>" +
                "<form action='/completed'>" + //"<form action='/form' method='POST'>" for first two original POST
                "<b>Name:</b>" + "<br/>" +
                "<input type='text' name='name'>" + "<br/>" +
                "<b>My favorite language: </b>" + "<br/>" +
                "<select name='first'>" +
                "<option value='Java'>Java</option>" +
                "<option value='C++'>C++</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<br/>" +
                "<b>My second favorite language: </b>" + "<br/>" +
                "<select name='second'>" +
                "<option value='Java'>Java</option>" +
                "<option value='C++'>C++</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<br/>" +
                "<b>My third favorite language: </b>" + "<br/>" +
                "<select name='third'>" +
                "<option value='Java'>Java</option>" +
                "<option value='C++'>C++</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<br/>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    /*@PostMapping("/form")
    public String processForm(@RequestParam String name, @RequestParam String first,
                              @RequestParam String second, @RequestParam String third){
        return "<html>" +
                "<body>" +
                "<h1>"+ name + "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>" +
                "<p>Click this <a href='/form'>form</a> to redo.</p>" +
                "<p>Click <a href='/'>here</a> to return to the home page.</p>" +
                "</body>" +
                "</html>";
    }*/

    /*@PostMapping("/form")
    public String processForm(@RequestParam String name, @RequestParam String first,
                              @RequestParam String second, @RequestParam String third){
        return "<html>" +
                "<body>" +
                "<h1>"+ name + "</h1>" +
                "<table>" +
                "<tr>" +
                "<th>Preference</th>" +
                "<th>Language</th>" +
                "</tr>" +
                "<tr>" +
                "<td>1</td>" +
                "<td>" + first + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>2</td>" +
                "<td>" + second + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>3</td>" +
                "<td>" + third + "</td>" +
                "</tr>" +
                "</table>" +
                "<p>Click this <a href='/form'>form</a> to redo.</p>" +
                "<p>Click <a href='/'>here</a> to return to the home page.</p>" +
                "</body>" +
                "</html>";
    }*/

    @GetMapping("completed")
    public String processForm(@RequestParam String name, @RequestParam String first,
                              @RequestParam String second, @RequestParam String third){
        return "<html>" +
                "<body>" +
                "<h1>"+ name + "</h1>" +
                "<table>" +
                "<tr>" +
                "<th>Preference</th>" +
                "<th>Language</th>" +
                "</tr>" +
                "<tr>" +
                "<td>1</td>" +
                "<td>" + first + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>2</td>" +
                "<td>" + second + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>3</td>" +
                "<td>" + third + "</td>" +
                "</tr>" +
                "</table>" +
                "<p>Click <a href='/form'>here</a> to fill out form again.</p>" +
                "<p>Click <a href='/'>here</a> to return to the home page.</p>" +
                "</body>" +
                "</html>";
    }
}
