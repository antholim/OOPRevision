import factory.Pizza;
import factory.PizzaFactoryNY;
import template.DiamondMiner;
import template.Miner;


public class Main {
    public static void main(String[] args) {
        //Template pattern demo
        Miner diamondMiner = new DiamondMiner();
        //Factory pattern demo
//        String type = "CHEESE";
//        PizzaFactoryNY pizzaFactory = new PizzaFactoryNY();
//        Pizza pizza = pizzaFactory.createPizza(type);

        //Decorator pattern demo
//        Beverage beverage = new HouseBlend();
//        beverage = new Mocha(beverage);
//        beverage = new Milk(beverage);
//        beverage = new Mocha(beverage);
//        System.out.println(beverage.getDescription());


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