package com.oops.inheritence;

public class Encap {

    String name = "Mahadev";
    String surName = "Kushwaha";

}


class Encapsule extends Encap {
    String name = "Kartikeya";
    int prop = 50;

}

class EncapsuleLateral {
    String name = "Janaki";
    String surName = "Devi";
    int prop = 20;

}

class EncapsuleLit extends Encapsule {
    String name = "Surya";

}

class EncapsuleLitSis extends EncapsuleLateral{
    String name = "Devika";
}

class EncapTest {
    public static void main(String[] args) {
        EncapsuleLit enc = new EncapsuleLit();

        System.out.println(enc.name + " " + enc.surName);
//        System.out.println(enc.surName);

        EncapsuleLitSis encl = new EncapsuleLitSis();

        System.out.println(encl.name + " " + encl.surName);
    }

}
/*

Encapsulation:------> One object inherit(gain) all the properties and behaviors of a base object(parent object).
                      One class which extends another class.
 */