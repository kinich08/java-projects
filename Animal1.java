class prani{
    String name;
    public void eat(){
        System.out.println("i eat grapss");
      }  
    }

    class dog extends prani{
        
        public void display(){
        System.out.println("My name is :"+name);
        }
        public void bark(){
          System.out.println("dog can bark");
        }
        @Override
        public void eat(){
          super.eat();
        System.out.println("i eat apple");
        }  
    }
class Animal1{
    public static void main(String[] args) {
        dog kutta =new dog();
        kutta.name="pussy";
        kutta.display();

        kutta.eat();
        kutta.bark();
    }
}