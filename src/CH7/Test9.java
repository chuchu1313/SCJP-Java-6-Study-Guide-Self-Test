package CH7;

import java.util.PriorityQueue;

public class Test9 {
    public static void main(String[] args){
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("2");
        pq.add("4");
        System.out.print(pq.peek() + " "); //peek()== "2", pq = {"2", "4"}
        pq.offer("1");
        pq.offer("3"); //pq = {"1", "2", "3", "4"}
        pq.remove("1"); //pq = {"2", "3", "4"}
        System.out.print(pq.poll());//pool == "2" pq = {"3", "4"}
        if(pq.remove("2")){
            System.out.print(pq.poll() + " ");
        }
        System.out.println(pq.poll() + " " + pq.peek());// pool()== "3" peek()== "4"

    }
}
