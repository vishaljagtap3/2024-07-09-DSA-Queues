public class Main {
    public static void main(String[] args) {

        CircularQueue1 cq = new CircularQueue1(5);

        System.out.println("Ins: " + cq.insert(10));
        System.out.println("Ins: " + cq.insert(20));
        System.out.println("Ins: " + cq.insert(30));
        System.out.println("Ins: " + cq.insert(40));
        System.out.println("Ins: " + cq.insert(50));
        System.out.println("Ins: " + cq.insert(60));

        System.out.println("Del: " + cq.delete());
        System.out.println("Ins: " + cq.insert(60));


        /*Queue q1 = new Queue(5);

        System.out.println("ins: " + q1.insert(10));
        System.out.println("ins: " + q1.insert(20));
        System.out.println("ins: " + q1.insert(30));
        System.out.println("del: " + q1.delete());
        System.out.println("del: " + q1.delete());
        System.out.println("ins: " + q1.insert(40));
        System.out.println("ins: " + q1.insert(50));
        System.out.println("ins: " + q1.insert(60));
        System.out.println("del: " + q1.delete());
        System.out.println("del: " + q1.delete());
        System.out.println("del: " + q1.delete());
        System.out.println("del: " + q1.delete());

        System.out.println("empty: " + q1.isEmpty() + " full: " + q1.isFull());*/
    }
}
