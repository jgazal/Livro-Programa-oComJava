package Capitulo16;

import java.util.ArrayDeque;
class PureQueue<E> {
    private ArrayDeque<E> data;
    PureQueue() {
        data = new ArrayDeque<E>();
    }
    void enqueue(E o) { data.offer(o); }
    E dequeue() { return data.poll(); }
    E peek() { return data.peek(); }
    int size() { return data.size(); }
    public String toString() {
        return data.toString();
    }
}
class PureQueueDemo {
    public static void main(String[] args) {
        PureQueue<String> q = new PureQueue<String>();
        System.out.println(q);
        q.enqueue("3");
        q.enqueue("abc");
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
    }
}
