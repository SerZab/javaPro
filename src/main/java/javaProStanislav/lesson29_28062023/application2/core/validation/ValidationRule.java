package javaProStanislav.lesson29_28062023.application2.core.validation;

import javaProStanislav.lesson29_28062023.application2.dto.AddToDoRequest;

public interface ValidationRule {

    void validate(AddToDoRequest request);
}
