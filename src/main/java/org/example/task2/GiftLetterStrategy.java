package org.example.task2;

class GiftLetterStrategy implements MailContentStrategy {
    @Override
    public String generateContent(Client client) {
        return client.getName()
                + " u've got gift";
    }
}
