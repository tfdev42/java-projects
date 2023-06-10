package inheritance.covariantReturnType;

public class Main {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();
        burgerFactory.createBurger();
        System.out.println();
        HealthyBurgerFactory healthyBurgerFactory = new HealthyBurgerFactory();
        healthyBurgerFactory.createBurger();
    }
    
}

class Burger {
    // fields + methods
}

class HealthyBurger extends Burger {
    // fields + methods
}

class BurgerFactory{

    public Burger createBurger() {
        System.out.println("Burger.createBurger() called");
        return new Burger();
    }
}

class HealthyBurgerFactory extends BurgerFactory {

    @Override
    public HealthyBurger createBurger() {
        System.out.println("HealthyBurger.createBurger() called");
        return new HealthyBurger();
    }
}
