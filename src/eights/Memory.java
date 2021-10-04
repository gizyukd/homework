package eights;

import javax.management.Query;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Memory {
    //List<String> list = new ArrayList<>();
    private Queue<String> queue = new ArrayDeque<>();

    public Queue<String> getQueue() {
        return queue;
    }

    public void setQueue(Queue<String> queue) {
        this.queue = queue;
    }
}
