package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Actor;
import co2103.hw1.domain.Musical;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.List;

public class ActorValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz){
        return Actor.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors){
        Actor a = (Actor) target;
        //CHECKING ID
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Your actor requires a name!");
        //CHECKING ID
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "training", "", "Your actor requires a training!");
        //CHECKING ID
        for (Actor ex : Hw1Application.actors) {
            if (a.getType() == null || a.getType().trim().isEmpty()){
                errors.rejectValue("type", "", "Your actor needs a type and must be Soprano, Mezzo soprano, or Contralto");
            }
            else if (!List.of("Soprano", "Mezzo soprano", "Contralto").contains(a.getType())){
                errors.rejectValue("type", "actor type is invalid", "Type must be Soprano, Mezzo soprano, or Contralto");
            }
        }
        if (a.getAwards() <= 0 || a.getAwards() >= 7) {
            errors.rejectValue("awards", "actor is awards is invalid", "Awards must be between 0 and 7");
        }

    }
}
