package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayUserForm() {
        return "user/add";
    }

    @GetMapping("index")
    public String displayIndex() {
        return "user/index";
    }
    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
//        model.addAttribute("username", user.getUsername());
//        model.addAttribute("email", user.getEmail());
//        model.addAttribute("password", user.getPassword());
        verify = "password";

        if (2 == 2) {
            return "user/index";
        } else {
            return "user/add";
        }
    }
}
