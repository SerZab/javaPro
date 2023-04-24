package javaProStanislav.lesson12_24042023.tourBooking;

import java.util.LinkedList;
import java.util.Queue;

public class TourBooking {
    private Queue<String> queue;
    private int maxSize;

    public TourBooking(int maxSize) {
        this.queue = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public Queue<String> getQueue() {
        return queue;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void addRequest(String request){
        if (queue.size() < maxSize){
            queue.add(request);
            System.out.println("Request " + request + "  added");
        } else {
            System.out.println("Queue is full. Please wait and repeat your request later.");
        }
    }

    public void processRequest(){
        if (!queue.isEmpty()) {
            String requestDone = queue.poll();
            System.out.println("request " + requestDone + " is done");
        } else {
            System.out.println("List of request is empty");
        }
    }

    public int getQueueSize(){
        return queue.size();
    }
}