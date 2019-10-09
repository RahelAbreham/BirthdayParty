package scrap.heap.refactor;

import scrap.heap.refactor.model.Balloon;
import scrap.heap.refactor.model.BalloonBuilder;
import scrap.heap.refactor.model.Cake;
import scrap.heap.refactor.model.CakeBuilder;
import scrap.heap.refactor.model.Color;
import scrap.heap.refactor.model.Flavor;
import scrap.heap.refactor.model.Shape;
import scrap.heap.refactor.model.Size;
import scrap.heap.refactor.services.Order;
import scrap.heap.refactor.services.OrderImpl;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

    	System.out.println("*****Updated My project*****");
		Order order = new OrderImpl();

		// Place birthday party orders
		Balloon balloon = new BalloonBuilder().with(balloonBuilder -> {
			balloonBuilder.balloonColor = Color.RED;
			balloonBuilder.number = 4;
			balloonBuilder.material = "mylar";

		}).createBalloon();

		Cake cake = new CakeBuilder().with(cakeBuilder -> {
			cakeBuilder.cakeColor = Color.BROWN;
			cakeBuilder.size = Size.LARGE;
			cakeBuilder.shape = Shape.CIRCLE;
			cakeBuilder.flavor = Flavor.CHOCOLATE;
			cakeBuilder.frostingFlavor = Flavor.CHOCOLATE;
		}).createCake();
		
		System.out.println("---------- My Project Order Ballon Here ---------- " );
		order.orderBalloons(balloon);
		System.out.println("---------- Order Cake Here ---------- " );
		order.orderCake(cake);
		

		// Without Builders
		System.out.println("---------- My Project Order Without Builders -----------");
		order.orderBalloons(new Balloon(Color.BLUE, "latex", 7));
		order.orderCake(new Cake(Flavor.VANILLA, Flavor.CHOCOLATE, Shape.SQUARE, Size.MEDIUM, Color.BROWN));
		
		order.orderBalloons(new Balloon(Color.YELLOW, "mylar", 4));
		order.orderCake(new Cake(Flavor.VANILLA, Flavor.VANILLA, Shape.SQUARE, Size.SMALL, Color.YELLOW));

    }
 

}
