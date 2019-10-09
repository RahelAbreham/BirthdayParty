package scrap.heap.refactor.model;

import java.util.HashMap;
import java.util.Map;

public enum Color {
	RED("red"), BROWN("brown"), BLUE("blue"), YELLOW("yellow"),;

	private String color;

	Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	// Cache the value
	private static final Map<String, Color> values = new HashMap<>();
	static {
		for (Color color : Color.values()) {
			values.put(color.getColor(), color);
		}
	}

	private static Color get(String color) {
		if (!values.containsKey(color)) {
			throw new RuntimeException("Invalid Color");
		}
		return values.get(color);
	}
}
