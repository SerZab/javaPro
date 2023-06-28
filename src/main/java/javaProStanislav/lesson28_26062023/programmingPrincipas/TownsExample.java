package javaProStanislav.lesson28_26062023.programmingPrincipas;

public class TownsExample {

    public void nonOpenClose(){
        String[] knownCities = new String[5];
        knownCities[0] = "Madrid";
        knownCities[1] = "Berlin";
        knownCities[2] = "Paris";
        knownCities[3] = "Prague";
        knownCities[4] = "London";

        // searchCity(knownCities)

    }

    public boolean nonOpenClose2(int a, int b) {
        boolean result = true;

        if ((a + b) < 1000 ) {result = false;}
        return result;
    }

    // надо 1000 - не использовать в коде, а передавать в качестве аргумента

}