package scrap.heap.refactor.model;

import java.util.HashMap;
import java.util.Map;

public enum Shape {
	CIRCLE("circle"), SQUARE("square");

	private String shape;

	Shape(String shape) {
		this.shape = shape;
	}

	public String getShape() {
		return shape;
	}

	// Cache the value
	private static final Map<String, Shape> values = new HashMap<>();
	static {
		for (Shape shape : Shape.values()) {
			values.put(shape.getShape(), shape);
		}
	}

	private static Shape get(String shape) {
		if (!values.containsKey(shape)) {
			throw new RuntimeException("Invalid Shape");
		}
		return values.get(shape);
	}
}
