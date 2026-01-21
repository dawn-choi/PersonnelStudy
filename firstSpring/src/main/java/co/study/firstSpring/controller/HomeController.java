package co.study.firstSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	   @GetMapping("/")
	    public String home() {
	        return "index";
	    }
	   @GetMapping("/mainView/layout-static")
	   public String layoutStatic() {
	       return "mainView/layout-static";
	   }
	   
	   @GetMapping("/mainView/layout-sidenav-light")
	   public String layoutSideNav() {
	       return "mainView/layout-sidenav-light";
	   }
	   @GetMapping("/mainView/login")
	   public String login() {
	       return "mainView/login";
	   }
	   @GetMapping("/mainView/register")
	   public String register() {
	       return "mainView/register";
	   }
	   @GetMapping("/mainView/charts")
	   public String charts() {
	       return "mainView/charts";
	   }
	  
}
