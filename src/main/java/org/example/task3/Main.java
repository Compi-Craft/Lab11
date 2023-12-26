package org.example.task3;

public class Main {
    public static void main(String[] args) {
        MyImage image = new ProxyImage("/test.jpeg");
        image.display();
    }
}