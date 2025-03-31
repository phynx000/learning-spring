package vn.hoidanit.laptopshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.hoidanit.laptopshop.service.UserService;

@Controller("/admin")
public class UserController{

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/user")
    public String getHomePage(Model model){
        String test = this.userService.handleHello();
        model.addAttribute("var", test);
        return "createUser";
    }
}

//@RestController
//public class UserController {
//
//
//    public String getHomePage(){
//        return "Hello";
//    }
//}

