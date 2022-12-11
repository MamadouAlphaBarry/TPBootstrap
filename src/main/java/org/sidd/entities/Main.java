package org.sidd.entities;

import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8000/",new BanqueWs());
        System.out.print("Server Listen on http://localhost:8000");
    }
}