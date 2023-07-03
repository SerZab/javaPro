package javaProStanislav.lesson29_28062023.application2;

import javaProStanislav.lesson29_28062023.application2.console.*;
import javaProStanislav.lesson29_28062023.application2.core.validation.ValidationRule;
import javaProStanislav.lesson29_28062023.application2.core.validation.ValidationService;
import javaProStanislav.lesson29_28062023.application2.core.validation.rules.*;
import javaProStanislav.lesson29_28062023.application2.repository.ArrayListToDoRepository;
import javaProStanislav.lesson29_28062023.application2.repository.ToDoRepository;
import javaProStanislav.lesson29_28062023.application2.core.service.AddToDoService;
import javaProStanislav.lesson29_28062023.application2.core.service.FindToDoService;
import javaProStanislav.lesson29_28062023.application2.core.service.ToDoConverters;

import java.util.ArrayList;
import java.util.List;

public class ToDoApp {
    public static void main(String[] args) {

        ToDoRepository repository = new ArrayListToDoRepository();
        ToDoConverters converters = new ToDoConverters();

        List<ValidationRule> validationRuleList = new ArrayList<>();
        validationRuleList.add(new ToDoNameMinLengthValidationRule());
        validationRuleList.add(new ToDoNameMaxLengthValidationRule());
        validationRuleList.add(new ToDoDescriptionMaxLengthValidationRule());
        validationRuleList.add(new ToDoNameNullValidationRule());
        validationRuleList.add(new ToDoDescriptionNullValidationRule());

        ValidationService validationService = new ValidationService(validationRuleList);

        AddToDoService addToDoService = new AddToDoService(repository, converters,validationService);
        FindToDoService findToDoService = new FindToDoService(repository,converters);

        AddToDoUIAction addToDoUIAction = new AddToDoUIAction(addToDoService);
        FindAllToDoUIAction findAllToDoUIAction = new FindAllToDoUIAction(findToDoService);
        FindToDoByIdUIAction findToDoByIdUIAction = new FindToDoByIdUIAction(findToDoService);
        ExitUIAction exitUIAction = new ExitUIAction();

        List<UIAction> uiActions = new ArrayList<>();
        uiActions.add(addToDoUIAction);
        uiActions.add(findAllToDoUIAction);
        uiActions.add(findToDoByIdUIAction);
        uiActions.add(exitUIAction);

        UIMenu menu = new UIMenu(uiActions);

        menu.startUI();




    }
}