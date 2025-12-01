import command.Light;
import command.LightOffCommand;
import command.LightOnCommand;
import command.RemoteControl;
import decorator.Beverage;
import decorator.HouseBlend;
import decorator.condiments.Milk;
import decorator.condiments.Mocha;
import iterator.Iterator;
import iterator.NameCollection;
import iterator.Tree;

import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        //Decorator pattern demo
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());


        //Command pattern demo
//        RemoteControl remote = new RemoteControl();
//        Light light = new Light();
//        remote.setCommand(new LightOffCommand(light));
//        remote.pressButton();
//        remote.setCommand(new LightOnCommand(light));
//        remote.pressButton();

        //Iterator pattern demo
//        String[] names = {"Anthony", "Noah", "Emma", "Liam"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//
//        Tree tree = new Tree();
//        Iterator itr = tree.createIterator();
//        Iterator itr1 = tree.createIterator();
//        while (itr.hasNext()) {
//            System.out.println("Name: " + itr.next());
//        }
    }
}