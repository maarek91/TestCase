package ru.markelov.soap.aBBspringbootSOAP.producingwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.ClientRequest;
import io.spring.guides.gs_producing_web_service.ClientResponse;

@Endpoint
public class ClientEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    @Autowired
    private ClientService clientService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ClientRequest")
    @ResponsePayload
    public ClientResponse getClient(@RequestPayload ClientRequest request) {
        ClientResponse response = new ClientResponse();
        return clientService.checkResponseStatus(request);
    }
}
