/**
 * Сделаем логику принятия решения на основе блок схемы.
 * Проверка в три этапа
 * 1. Закрытая или открытая текущая задолженность?
 * 2. Какой срок задолженности?
 * 3. Дополнительная проверка - в 3 случаях
 */

public class AdaptiveLogic {
    Client client;

    public CreditRate checkRate(Client client) {
        if (!client.isCurrentArrear()) {
            if (client.getDayArrear() < 6) {
                return CreditRate.Положительная;
            } else if (client.getDayArrear() <= 60) {
                return CreditRate.Сомнительная;
            } else {
                if (client.getAmtCredits() == 1 && client.getSumCredits() < 5000000) {
                    return CreditRate.Сомнительная;
                } else {
                    return CreditRate.Отрицательная;
                }
            }
        } else {
            if (client.getDayArrear() < 6) {
                if (client.getSumCredits() < 5000 && client.getAmtCredits() == 1) {
                    return CreditRate.Положительная;
                } else {
                    return CreditRate.Сомнительная;
                }
            } else if (client.getDayArrear() <= 60) {
                if (client.getAmtCredits() == 1) {
                    return CreditRate.Сомнительная;
                } else {
                    return CreditRate.Отрицательная;
                }
            }
        }
        return CreditRate.Отрицательная;
    }
}
