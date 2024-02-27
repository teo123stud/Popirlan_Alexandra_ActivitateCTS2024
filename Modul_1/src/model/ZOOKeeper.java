package model;

public class ZOOKeeper {
    private String name;

    public void feedAnimal(Animal animal, String food){
        animal.eat(food);
    }

    public ZOOKeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
