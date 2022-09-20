package fr.jalel.coursjava;

public class Main {
    public static void main(String[] args) {

        Apple a = new Apple();

        Kiwi k = new Kiwi();

        if(a instanceof PeelFruit){
            System.out.println("ok");
        }

        if(k instanceof PeelFruit){
            System.out.println("ok");
        }

    }
}