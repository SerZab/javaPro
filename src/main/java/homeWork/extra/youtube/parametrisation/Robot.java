package homeWork.extra.youtube.parametrisation;

public class Robot <T1 extends Head> {
    private Body body;
    private T1 head;

    public Robot(Body body, T1 head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T1 getHead() {
        return head;
    }

    public void setHead(T1 head) {
        this.head = head;
    }
}
