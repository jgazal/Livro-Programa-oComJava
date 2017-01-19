package Capitulo9.dogownerdemo;

import Capitulo9.owner.*;

class DogOwnerDemo {
    public static void main(String[] args) {
        Owner owner = new Owner("Fred", new Dog("Sam"));
        System.out.println(owner);
    }
}
