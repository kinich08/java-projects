class vehicle{
    public void drive(){
        System.out.println("repairing car");
    }
}
class car extends vehicle{
     @Override
    public void drive(){
        System.out.println("repairing car");
    }
}

public class inheritanceP1{
    public static void main(String[] args) {
        car c1=new car();
        c1.drive();
    }
}