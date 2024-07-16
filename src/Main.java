public class Main {
    public static void main(String[] args) {
        Queue q1 = new Queue(5);

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

        System.out.println("empty: " + q1.isEmpty() + " full: " + q1.isFull());
    }
}
