package factory;

public class PizzaFactoryNY implements IPizzaFactory  {

    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("CHEESE")) {
            pizza = new CheesePizza();
        } else if (type.equals("PEPERRONI")) {
            pizza = new PeperroniPizza();
        }
        else {
            pizza = null;
        }
        return pizza;
    }
}
