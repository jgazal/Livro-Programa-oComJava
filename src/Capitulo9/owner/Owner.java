package Capitulo9.owner;

public class Owner {
    String name;
    Dog dog;

    public Owner(String n, Dog d){
        name = n;
        dog = d;
    }
    public String toString(){
        return name + " owns " + dog;
    }
}
