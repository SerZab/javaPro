package javaProStanislav.lesson22_05062023.mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrentYearProviderImpl implements CurrentYearProvider{
    @Override
    public int getYear() {
        return LocalDate.now().getYear();
    }
}
