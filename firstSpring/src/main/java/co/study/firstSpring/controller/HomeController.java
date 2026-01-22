package co.study.firstSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mainView")
public class HomeController {
	   @GetMapping("/")
	    public String home() {
	        return "index";
	    }
	   @GetMapping("/layout-static")
	   public String layoutStatic() {
	       return "mainView/layout-static";
	   }
	   
	   @GetMapping("/layout-sidenav-light")
	   public String layoutSideNav() {
	       return "mainView/layout-sidenav-light";
	   }
	   @GetMapping("/login")
	   public String login() {
	       return "mainView/login";
	   }
	   @GetMapping("/register")
	   public String register() {
	       return "mainView/register";
	   }
	   @GetMapping("/charts")
	   public String charts() {
	       return "mainView/charts";
	   }
	   
	   @GetMapping("/password")
	    public String password() {
	        return "mainView/password";
	    }
	   @GetMapping("/tables")
	    public String tables() {
	        return "mainView/tables";
	    }
}
