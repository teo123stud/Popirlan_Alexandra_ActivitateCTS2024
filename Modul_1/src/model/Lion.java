package model;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }
    public void eat(String food){
        System.out.println("The lion "+this.getName()+" eats "+food);
    }
}
