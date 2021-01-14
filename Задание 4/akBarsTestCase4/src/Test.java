public class Test {
    public static void main(String[] args) {
        Client client1 = new Client("Sergey", "Ivanov", "00010100000000101");
        Client client2 = new Client("Azat", "Timergaleev", "0010000123000100C");
        Client client3 = new Client("Safina", "Roza", "00001000000000000");

        Logic logic = new Logic();
        System.out.println("Кредитная история по клиенту " + client1 + " " +
                logic.calculateCreditRate(client1));
        System.out.println("Кредитная история по клиенту " + client2 + " " +
                logic.calculateCreditRate(client2));
        System.out.println("Кредитная история по клиенту " + client3 + " " +
                logic.calculateCreditRate(client3));
    }
}
