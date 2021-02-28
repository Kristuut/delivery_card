package ru.netology;

import com.github.javafaker.CreditCardType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

class Faker {
    @BeforeEach
    void setUpAll(){
        Faker ru = new Faker(new Locale("rus"));
    }

    @Test
    void shouldPreventSendRequestMultipleTimes() {
        String name = Faker.class.getName();
        String phone = Faker.class.phoneNumber();
        String cardNumber = Faker.finance().creditCard(CreditCardType.MASTERCARD);
        System.out.println(name);
        System.out.println(phone);
        System.out.println(cardNumber);}}