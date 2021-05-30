package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
@Controller
@RequestMapping("/item")
public class SpringController2 {

    @GetMapping
    public ModelAndView test() {
        return new ModelAndView("/item");
    }

}
