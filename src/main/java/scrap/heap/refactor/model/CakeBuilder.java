package scrap.heap.refactor.model;

import java.util.function.Consumer;

public class CakeBuilder {
	public Flavor frostingFlavor;
	public Flavor flavor;
	public Shape shape;
	public Size size;
	public Color cakeColor;

	public CakeBuilder with(Consumer<CakeBuilder> builderFunction) {
		builderFunction.accept(this);
		return this;
	}

	public Cake createCake() {
		return new Cake(frostingFlavor, flavor, shape, size, cakeColor);
	}
}
