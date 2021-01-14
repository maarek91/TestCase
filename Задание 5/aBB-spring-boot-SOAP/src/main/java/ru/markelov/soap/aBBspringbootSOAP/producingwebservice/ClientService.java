package ru.markelov.soap.aBBspringbootSOAP.producingwebservice;

import io.spring.guides.gs_producing_web_service.ClientRequest;
import io.spring.guides.gs_producing_web_service.ClientResponse;
import org.springframework.stereotype.Service;

/**
 * Описываем логику. Ответ сервиса возвращает две строки.
 *  Первая возвращает ФИО клиента и чистый доход
 *  Вторая возвращает статус ОК и NOT OK при превышении расходов над доходами
 */

@Service
public class ClientService {
    public ClientResponse checkResponseStatus(ClientRequest request) {
        ClientResponse response = new ClientResponse();
        int whiteIncome = request.getIncome() - request.getExpense();
        StringBuilder sb = new StringBuilder();
        if (whiteIncome > 0) {
            response.setRESPONSESTATUS("ОК");
        }   else {
            response.setRESPONSESTATUS("NOT ОК");
        }
        sb.append("Чистый доход по клиенту ");
        sb.append(" ");
        sb.append(request.getLastName());
        sb.append(" ");
        sb.append(request.getFirstName());
        sb.append(" ");
        sb.append(request.getSecondName());
        sb.append(" составляет ");
        sb.append(whiteIncome);
        sb.append(" рублей");
        response.setRESPONSE(sb.toString());
        return response;
        }
}
