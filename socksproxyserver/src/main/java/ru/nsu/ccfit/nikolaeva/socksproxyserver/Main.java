package ru.nsu.ccfit.nikolaeva.socksproxyserver;

public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(1080);
        proxy.start();
    }
}
