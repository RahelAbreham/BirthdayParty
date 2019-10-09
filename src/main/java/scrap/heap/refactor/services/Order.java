package scrap.heap.refactor.services;

import scrap.heap.refactor.model.Balloon;
import scrap.heap.refactor.model.Cake;

public interface Order {
	String orderCake(Cake cake);
	String orderBalloons(Balloon balloon);
}
