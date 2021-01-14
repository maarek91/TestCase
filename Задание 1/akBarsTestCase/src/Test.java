import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <Client> clientList = new ArrayList<>();
//        Инициализируем 12 клиентов, по 1 на каждый критерий
        Client client1 = new Client("Dmitriy", "Petrov", 3, 3000, 3, false);
        Client client2 = new Client("Andrey", "Klementiev", 1, 3000, 5, true);
        Client client3 = new Client("Rinat", "Gaynutdinov", 3, 4000, 4, true);
        Client client4 = new Client("ELena", "Marks", 3, 10000, 5, true);
        Client client5 = new Client("Alexey", "Dementiev", 1, 20000, 30, false);
        Client client6 = new Client("Ruzel", "Zaripov", 4, 10000, 25, false);
        Client client7 = new Client("Vyacheslav", "Maksimov", 3, 10000, 47, true);
        Client client8 = new Client("Anna", "Moshko", 1, 10000, 51, true);
        Client client9 = new Client("Azat", "Tuhvatullin", 1, 1000000, 63, false);
        Client client10 = new Client("Roza", "Abdullova", 3, 1010000, 75, false);
        Client client11 = new Client("Alexandr", "Lomachenko", 3, 10000000, 61, false);
        Client client12 = new Client("Semen", "Kolyada", 3, 10000, 80, true);
        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);
        clientList.add(client4);
        clientList.add(client5);
        clientList.add(client6);
        clientList.add(client7);
        clientList.add(client8);
        clientList.add(client9);
        clientList.add(client10);
        clientList.add(client11);
        clientList.add(client12);

        LogicCase lg = new LogicCase();
        AdaptiveLogic al = new AdaptiveLogic();

//  Проверим соответствие кредитных историй через сравнение объектов полученное разными способами
        for (Client client : clientList) {
            System.out.println(al.checkRate(client)==lg.checkRate(client));
        }

//  Резульат одинаков, но при этом альтернативный способ, описанный в классе AdaptiveLogic эффективнее,
//  так как он делает максимум 3 проверки, тогда как если проверяя каждый критерий - мы делаем 12 проверок

        System.out.println("======================================================");

//  Выведем список клиентов, вместе с кредитной историей, полученной через более быстрый способ

        for (Client client : clientList) {
            System.out.println(client + "\nЗона кредитной истории по клиенту " + al.checkRate(client));
        }
    }
}
