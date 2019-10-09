package scrap.heap.refactor.model;

public class Cake {
	private Flavor frostingFlavor;
	private Flavor flavor;
	private Shape shape;
	private Size size;
	private Color cakeColor;

	public Cake() {
	}

	public Cake(Flavor frostingFlavor, Flavor flavor, Shape shape, Size size, Color cakeColor) {
		this.frostingFlavor = frostingFlavor;
		this.flavor = flavor;
		this.shape = shape;
		this.size = size;
		this.cakeColor = cakeColor;
	}

	public Flavor getFrostingFlavor() {
		return frostingFlavor;
	}

	public void setFrostingFlavor(Flavor frostingFlavor) {
		this.frostingFlavor = frostingFlavor;
	}

	public Flavor getFlavor() {
		return flavor;
	}

	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Color getCakeColor() {
		return cakeColor;
	}

	public void setCakeColor(Color cakeColor) {
		this.cakeColor = cakeColor;
	}

}
