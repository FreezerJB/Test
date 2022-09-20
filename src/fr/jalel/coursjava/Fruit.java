package fr.jalel.coursjava;

public abstract class Fruit {

    private String name;

    public Fruit(String name){
        this.name = name;

    }


    public abstract void taste();

    public abstract int getSize();

    public abstract boolean hasSeed();

    public void miam(){
        System.out.println("Il faut manger 5 fruits et légumes par jour");
    }
}
