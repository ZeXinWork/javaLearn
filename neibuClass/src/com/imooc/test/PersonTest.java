package com.imooc.test;

import com.imooc.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Person.Heart heart = person.getHeart();
        heart.eat();
    }
}

