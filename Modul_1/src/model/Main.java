package model;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ZOOKeeper zooKeeper=new ZOOKeeper("Ion");

       ZOO zoo=new ZOO("Zoo",zooKeeper,new HashMap<>());

       Animal anotherAnimal= new Zebra("Zebruta",21);
        zoo.addAnimal(anotherAnimal,"grass");
        zoo.addAnimal(new Lion("Simba",22),"zebra");
        zoo.addAnimal(new Pisica("Tom",2),"milk");
       zoo.feedAnimals();

        Pisica.FeedType feedType= Pisica.FeedType.CARNIVORE;
    }
}