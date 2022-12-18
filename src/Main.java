public class Main {
    public static void main(String[] args) {
        Block b1 = new Block(6);
        System.out.println(b1);
        //System.out.println(b1.getNumbers().toString());
        System.out.println();
        System.out.println();
        System.out.println();

        Ticket t1 = new Ticket(5);
        System.out.println(t1);

        System.out.println(t1.printUsedNumbers());
    }
}