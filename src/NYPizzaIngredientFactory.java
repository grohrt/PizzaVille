import AbstractIngredients.*;
import Ingredients.*;
/**
 * Created by User on 6/23/2014.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
  public Dough createDough() {
    return new ThinCrustDough();
  }

  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  public Veggies[] createVeggies() {
    return new Veggies[] {new Garlic(),
                          new Onion(),
                          new Mushroom(),
                          new RedPepper() };
  }

  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  public Clams createClams() {
    return new FreshClams();
  }
}