/**
 * Реализуем логику с помощью критериев из тестового задания
 *  */

public class LogicCase {
    Client client;

    public CreditRate checkRate(Client client) {
        if (client.getDayArrear() < 6 && !client.isCurrentArrear()) {
            return CreditRate.Положительная;
        }   else if (client.isCurrentArrear() && client.getSumCredits() < 5000
                && client.getDayArrear() < 6 && client.getAmtCredits() < 2) {
            return CreditRate.Положительная;
        }   else if (client.isCurrentArrear() && client.getSumCredits() < 5000
                && client.getDayArrear() < 6 && client.getAmtCredits() >= 2) {
            return CreditRate.Сомнительная;
        }   else if (client.isCurrentArrear() && client.getSumCredits() >= 5000
                && client.getDayArrear() < 6) {
            return CreditRate.Сомнительная;
        }   else if (!client.isCurrentArrear() && client.getAmtCredits() == 1
                && client.getDayArrear() >= 6 && client.getDayArrear() <= 60) {
            return CreditRate.Сомнительная;
        }   else if (!client.isCurrentArrear() && client.getAmtCredits() >= 2
                && client.getDayArrear() >= 6 && client.getDayArrear() <= 60) {
            return CreditRate.Сомнительная;
        }    else if (client.isCurrentArrear() && client.getAmtCredits() >= 2
                && client.getDayArrear() >= 6 && client.getDayArrear() <= 60) {
            return CreditRate.Отрицательная;
        }   else if (client.isCurrentArrear() && client.getAmtCredits() == 1
                && client.getDayArrear() >= 6 && client.getDayArrear() <= 60) {
            return CreditRate.Сомнительная;
        }   else if (!client.isCurrentArrear() && client.getAmtCredits() == 1
              && client.getDayArrear() > 60 && client.getSumCredits() <= 5000000) {
            return CreditRate.Сомнительная;
        }   else if (!client.isCurrentArrear() && client.getAmtCredits() >= 2
                && client.getDayArrear() > 60 && client.getSumCredits() <= 5000000) {
            return CreditRate.Отрицательная;
        }   else if (!client.isCurrentArrear() && client.getDayArrear() > 60
                && client.getSumCredits() >= 5000000) {
            return CreditRate.Отрицательная;
        }   else if (client.isCurrentArrear() && client.getDayArrear() > 60) {
            return CreditRate.Отрицательная;
        }
        return CreditRate.Отрицательная;
    }
}
