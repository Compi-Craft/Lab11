package org.example.task2;

class BirthdayGreetingStrategy implements MailContentStrategy {
    @Override
    public String generateContent(Client client) {
        return "Happy Birthday " + client.getName() +"!";
    }
}
