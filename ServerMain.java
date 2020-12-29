package ru.nsu.ccfit.nikolaeva.transferfile;

import java.io.IOException;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        Server server = new Server(2020);
        server.start();
    }
}
