package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Musical;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MusicalValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Musical.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors){
        Musical m = (Musical) target;
        //CHECKING ID
        for(Musical ex : Hw1Application.musicals){
            if(ex.getId() == m.getId()){
                errors.rejectValue("id", "", "ID already in use.");
            }
        }
        //CHECKING ID
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Your musical requires a name!");
        //CHECKING ID
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "composer", "", "Your musical requires a composer!");
    }
}
