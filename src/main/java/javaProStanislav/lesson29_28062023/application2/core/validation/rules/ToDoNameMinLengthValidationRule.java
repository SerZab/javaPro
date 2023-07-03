package javaProStanislav.lesson29_28062023.application2.core.validation.rules;

import javaProStanislav.lesson29_28062023.application2.core.validation.ValidationException;
import javaProStanislav.lesson29_28062023.application2.core.validation.ValidationRule;
import javaProStanislav.lesson29_28062023.application2.dto.AddToDoRequest;

public class ToDoNameMinLengthValidationRule implements ValidationRule {
    @Override
    public void validate(AddToDoRequest request) {
        if (request.getName().length() < 3) {
            throw new ValidationException("ToDo name length must be " +
                    "greater than 3, but actual name length is " +
                    request.getName().length());
        }
    }
}
