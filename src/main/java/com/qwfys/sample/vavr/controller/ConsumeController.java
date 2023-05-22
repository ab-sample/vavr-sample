package com.qwfys.sample.vavr.controller;

import com.qwfys.sample.vavr.business.ConsumeBusiness;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liuwenke
 * @since 0.0.1
 */
@Controller
public class ConsumeController {

    @GetMapping("/consume/response/get")
    public String get(Model model) {

        // Creating object of ConsumeResponse class
        ConsumeBusiness data = new ConsumeBusiness();
        model.addAttribute("response", data.get().getBody());
        model.addAttribute("headers", data.get().getHeaders());

        return "output";
    }
}
