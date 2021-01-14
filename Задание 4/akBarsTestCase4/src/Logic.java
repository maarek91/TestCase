/**
 * Реализация логики программы
 */

import java.util.ArrayList;
import java.util.List;

public class Logic {
    Client client;
    List<Character> clientHistoryList = new ArrayList<>();

    public CreditRate calculateCreditRate(Client client) {
        char [] clientHistoryList = client.getClientHistory().toCharArray();
//       Счетчик просрочки 1-29 дней
        int count1 = 0;
//       Счетчик просрочки 30-50 дней
        int count2 = 0;

//        Заполняем счётчики по просрочкам
        for(Character ch: clientHistoryList) {
            if (ch == '3') {
//               если есть просрочка более 50 дней, то кредитная история сразу Отрицательная
                return CreditRate.Отрицательная;
            }   else if (ch == '2') {
                count2++;
            }   else if (ch == '1') {
                count1++;
            }
        }

//        если Счетчик просрочки 30-50 дней больше 3, кредитная история отрицательная
//        если Счетчик просрочки 30-50 дней больше 1, или Счетчик просрочки 1-29 дней больше 3 кредитная история сомнительная
//        в остальных случаях положительная
        if (count2 > 3) {
            return CreditRate.Отрицательная;
        }   else if (count2>1 || count1>3) {
            return CreditRate.Сомнительная;
        }   else {
            return CreditRate.Положительная;
        }
    }
}
