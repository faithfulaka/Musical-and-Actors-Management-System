package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Musical;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;


@Controller
public class MusicalController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new MusicalValidator());
    }

    @GetMapping("/musicals")
    public String musicals(Model model){
        model.addAttribute("musicals", Hw1Application.musicals);
        return "musicals/list";
    }

    @RequestMapping("/newMusical")
    public String newMusical(Model model){
        model.addAttribute("musical", new Musical());
        return "musicals/form";
    }

    @PostMapping("/addMusical")
    public String addMusical(@Valid @ModelAttribute Musical musical, BindingResult results){
        if(results.hasErrors()){
            return "musicals/form";
        }
        Hw1Application.musicals.add(musical);
        return "redirect:/musicals";
    }


}
