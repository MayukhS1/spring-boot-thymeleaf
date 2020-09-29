package com.example.springbootthymeleaf.controller;

import com.example.springbootthymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/demo")
    public String demo (Model model){

        model.addAttribute("welcome_message","Hello User, It's a Thymeleaf model");
        double grade = 84.6;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertGPA(grade));

        return "demo"; //returning to templates/demo.html file
    }

    private String convertGPA(double grade) {
        if(grade>=90)
            return "S";
        else if(grade>=80)
            return "A";
        else if(grade >=70)
            return "B";
        else if (grade >=60)
            return "C";
        else if(grade>=50)
            return "D";
        else
            return "F";
    }

    @RequestMapping("/demo2")
    public String demo2(Model model) {
        List<User> lst = new ArrayList<>();
        lst.add(new User(1, "Tom Clanny", 78.8));
        lst.add(new User(2, "Thomas Shelby", 75.2));
        lst.add(new User(3, "Goku", 68.9));
        model.addAttribute("list", lst);
        return "demo2";
    }

    @RequestMapping("demo3")
    public String demo3(HttpServletRequest request, Model model) {
        // Request
        request.setAttribute("request", "request data");
        // Session
        request.getSession().setAttribute("session", "session data");
        // Application
        request.getSession().getServletContext().setAttribute("application", "application data");
        return "demo2";
    }

}
