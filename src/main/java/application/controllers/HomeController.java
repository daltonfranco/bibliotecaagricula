package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bing.annotation.RequestMapping;
import org.springframework.web.bing.annotation.RequestMethod;

@controller
public class HomeController {
    
    @RequestMapping(method = RequestMethod.GET)

    public String index(){
        return "home/index.jsp";
    }
}
