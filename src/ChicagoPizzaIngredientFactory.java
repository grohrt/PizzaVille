import AbstractIngredients.*;
import Ingredients.*;

/**
 * Created by User on 6/23/2014.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
  public Dough createDough() {
    return new ThickCrustDough();
  }

  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  public Cheese createCheese() { return new Mozzarella(); }

  public Veggies[] createVeggies() {
    return new Veggies[] {new BlackOlives(),
                          new EggPlant(),
                          new Spinach() };
  }

  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  public Clams createClams() { return new FrozenClams(); }

}