package scrap.heap.refactor.services;

import scrap.heap.refactor.model.Balloon;
import scrap.heap.refactor.model.Cake;

public class OrderImpl implements Order{

	
	@Override
	public String orderBalloons(Balloon balloon) {
		if(balloon == null) {
			throw new RuntimeException("Balloon can't be null.");
		}

		// for the purposes of this exercise, pretend this method works and adds
		// balloons to the order
		System.out.println("Balloons ordered; " + balloon.getBalloonColor().getColor() + ", " + balloon.getMaterial() + ", "
				+ balloon.getNumber());
		String yourOrder = "Balloons ordered; " + balloon.getBalloonColor().getColor() + ", " + balloon.getMaterial() + ", "
				+ balloon.getNumber();
		return yourOrder;
	}
	@Override
	public String orderCake(Cake cake) {
		if(cake == null) {
			throw new RuntimeException("Cake can't be null.");
		}

		// for the purposes of this exercise, pretend that this method adds a cake to
		// the order
		System.out.println(
				"Cake ordered; " + cake.getFlavor().getFlavor() + ", " + cake.getFrostingFlavor().getFlavor() + ", " + cake.getShape().getShape() + ", " + cake.getSize().getSize() + ", " + cake.getCakeColor().getColor());
		
		String yourOrder = "Cake ordered; " + cake.getFlavor().getFlavor() + ", " + cake.getFrostingFlavor().getFlavor() + ", " + cake.getShape().getShape() + ", " + cake.getSize().getSize() + ", " + cake.getCakeColor().getColor();
		return yourOrder;
	}

}
