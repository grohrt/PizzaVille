import AbstractIngredients.*;

/**
 * Created by User on 6/23/2014.
 */
public interface PizzaIngredientFactory {
  public Dough createDough();
  public Sauce createSauce();
  public Cheese createCheese();
  public Veggies[] createVeggies();
  public Pepperoni createPepperoni();
  public Clams createClams();
}
