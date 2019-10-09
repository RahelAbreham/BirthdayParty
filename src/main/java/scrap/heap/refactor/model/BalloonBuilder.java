package scrap.heap.refactor.model;

import java.util.function.Consumer;

public class BalloonBuilder {
	public Color balloonColor;
	public String material;
	public int number;

	public BalloonBuilder with(Consumer<BalloonBuilder> builderFunction) {
		builderFunction.accept(this);
		return this;
	}

	public Balloon createBalloon() {
		return new Balloon(balloonColor, material, number);
	}
}
