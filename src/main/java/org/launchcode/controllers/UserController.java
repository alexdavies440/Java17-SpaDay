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
        verify = "pie";
        String error = "Please try again";
        model.addAttribute("error", error);
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());

        if (verify.equals(user.getPassword())) {
            return "user/index";
        } else {
            return "user/add";
        }
    }

//    @PostMapping("add")
//    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
//        verify = "pie";
//
//
//        if (user.getPassword().equals(verify)) {
//            String message = "Welcome " + user.getUsername();
//            model.addAttribute("message", message);
//            return "user/index";
//        } else {
//            return "user/add";
//        }
//    }
}
