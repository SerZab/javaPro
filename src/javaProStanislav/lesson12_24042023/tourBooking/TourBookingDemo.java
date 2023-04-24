package javaProStanislav.lesson12_24042023.tourBooking;

public class TourBookingDemo {
    public static void main(String[] args) {
        TourBooking tc = new TourBooking(5);

        tc.addRequest("Request 1");
        tc.addRequest("Request 2");
        tc.addRequest("Request 3");

        tc.processRequest();
        tc.processRequest();
        tc.processRequest();
        tc.processRequest();

        tc.addRequest("Request 4");
        tc.addRequest("Request 5");
        tc.addRequest("Request 6");
        tc.addRequest("Request 7");
        tc.addRequest("Request 8");
        tc.addRequest("Request 9");
    }
}
