package javaProStanislav.lesson29_28062023.application2.core.validation.rules;

import javaProStanislav.lesson29_28062023.application2.core.validation.ValidationException;
import javaProStanislav.lesson29_28062023.application2.core.validation.ValidationRule;
import javaProStanislav.lesson29_28062023.application2.dto.AddToDoRequest;

public class ToDoDescriptionMaxLengthValidationRule implements ValidationRule {
    @Override
    public void validate(AddToDoRequest request) {
        if (request.getDescription().length() > 25) {
            throw new ValidationException("ToDo description length must be " +
                    "less than 25, but actual name length is " +
                    request.getDescription().length());
        }
    }
}
