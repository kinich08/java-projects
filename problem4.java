
abstract class Animal{
    public abstract void eat();

    public abstract void sleep();
}
class Lion extends Animal{
    @Override 
    public void eat(){
        System.out.println("\nLion eats meat.");
    }
    @Override
    public void sleep(){
        System.out.println("Lion sleeps on grassland.");
    }
}
class Tiger extends Animal{
    @Override
    public void eat(){
        System.out.println("\n\nTiger eats meat and occasionally hunts in water.");
    }

    @Override
    public void sleep(){
        System.out.println("Tiger sleeps in a hidden spot.");
    }
} 
class Deer extends Animal{
    @Override
    public void eat(){
        System.out.println("\n\nDeer grazes on grass and leaves.");
    }
    @Override
    public void sleep(){
        System.out.println("Deer sleeps in open fields.\n");
    }
}

public class problem4{
    public static void main(String[] args){
        Lion lion =new Lion();
        lion.eat();
        lion.sleep();
        Tiger tiger =new Tiger();
        tiger.eat();
        tiger.sleep();
        Deer deer =new Deer();
        deer.eat();
        deer.sleep();
    }
} 



