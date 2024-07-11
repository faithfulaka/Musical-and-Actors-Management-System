package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Actor;
import co2103.hw1.domain.Musical;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ActorController {

   @InitBinder
    protected void initBinder(WebDataBinder binder){
        binder.addValidators(new ActorValidator());
    }

    @GetMapping("/actors")
    public String actors(Model model) {
        model.addAttribute("actors", Hw1Application.actors);
        return "actors/list";
    }

    @RequestMapping( "/newActor" )
    public String  newActor(Model model){
        model.addAttribute("actor", new Actor());
        return "actors/form";
    }

    @PostMapping("/addActor")
    public String addAgent(@Valid @ModelAttribute Actor actor, BindingResult results){
        if(results.hasErrors()){
            return "actors/form";
        }
        Hw1Application.actors.add(actor);
        return "redirect:/actors";
    }

    @GetMapping("/actor")
    public String actor(@RequestParam("musical") int musicalId, Model model) {
        Musical selectedMusical  = null;

        for (Musical m : Hw1Application.musicals) {
            if (m.getId() == musicalId) {
                selectedMusical = m;
                break;
            }
        }
        if (selectedMusical != null) {
            model.addAttribute("selectedMusical", selectedMusical);
            model.addAttribute("musicalId", musicalId);
        }
        return "redirect:/musicals";
    }
}