import model.Duck;
import model.FlyWithRocket;
import model.FlyWithWings;
import model.MallardDuck;
import model.Squeak;

public class DuckSimulator {
   public static void main(String[] args) {
      Duck mallard = new MallardDuck();
      mallard.performQuack();
      mallard.performFly();
      System.out.println("-----------give duck new behavior----------");
      
      mallard.setFlyBehavior(new FlyWithWings()  );
      mallard.performFly();
      mallard.setQuackBehavior(new Squeak());
      mallard.performQuack();
   }
}
