package vn.hoidanit.laptopshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController{
    public String getHomePage(){
        return "Hi chao ban ";
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

