
abstract class Person {
  public abstract void eat();
  public abstract void exercise();
} 
class Athlete extends Person{
  @Override
  public void eat() {
    System.out.println("\nAthlete: Eats healthy foods");
  }
  @Override
  public void exercise(){
    System.out.println("Athlete: Training allows the body to gradually build up strength .");
  }
} 
class LazyPerson extends Person{
  @Override
  public void eat(){
    System.out.println("\nLazy person: Eating while watching TV.");
  }
  @Override
  public void exercise(){
    System.out.println("lazy person: Rarely exercising or being physically active.\n");
  }
} 

public class problem8{

  public static void main(String[] args){
    Person athlete = new Athlete();
    Person lazyPerson = new LazyPerson();

    athlete.eat();
    athlete.exercise();
    lazyPerson.eat();
    lazyPerson.exercise();
  }
}

