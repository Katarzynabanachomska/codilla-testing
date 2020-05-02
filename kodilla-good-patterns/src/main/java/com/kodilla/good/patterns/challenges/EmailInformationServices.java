package com.kodilla.good.patterns.challenges;

public class EmailInformationServices implements InformationServices {

    @Override
    public void sendConfirmationToUser(User user) {
        System.out.println("I sent e-mail to: " + user.getName() + "" + user.getSurname() + "order confirmation");
    }
}
