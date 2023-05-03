package javaProStanislav.lesson14_03052023;

public class Request {

    private String message;

    private int number;

    public Request(String message, int number) {
        this.message = message;
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Request{" +
                "message='" + message + '\'' +
                ", number=" + number +
                '}';
    }
}
