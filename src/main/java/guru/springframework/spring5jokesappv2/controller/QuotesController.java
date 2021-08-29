package guru.springframework.spring5jokesappv2.controller;

import guru.springframework.spring5jokesappv2.service.QuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuotesController {

    final private QuotesService service;

    public QuotesController(QuotesService service){
        this.service = service;
    }

    @RequestMapping({"/", ""})
    public String getQuote(Model model){
        model.addAttribute("quote", this.service.getQuote());
        return "index";
    }
}
