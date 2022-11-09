package zxf.springboot.thymeleaf.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/home")
    public ModelAndView home(@RequestParam String htmlP, @RequestParam String jsP) {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("htmlP", htmlP);
        modelAndView.addObject("jsP", jsP);
        return modelAndView;
    }
}
