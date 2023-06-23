package summaryJavaIlia.lesson14_23062023;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class CustomBlockingQueue <T>{
    private int size;
    private Queue<T> queue;
    ReentrantLock lock = new ReentrantLock(true);
    Condition conditionToTake = lock.newCondition();
    Condition conditionToAdd = lock.newCondition();

    public int size(){
        return queue.size();
    }

    public CustomBlockingQueue(int size) {
        this.size = size;
        queue = new ArrayDeque<>(size);
    }
    public void put(T element){
        lock.lock();
        try {
            if (queue.size() >= size){
                conditionToAdd.await();
            }
            queue.add(element);
            conditionToTake.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
    public T take(){
        lock.lock();
        try {
            if (queue.isEmpty()) {
                conditionToTake.await();
            }
            return queue.poll();
        }catch (InterruptedException e){
            e.printStackTrace();
            return null;
        } finally {
            lock.unlock();
        }
    }
}
