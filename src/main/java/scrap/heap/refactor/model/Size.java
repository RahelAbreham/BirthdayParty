package scrap.heap.refactor.model;

import java.util.HashMap;
import java.util.Map;

public enum Size {
	LARGE("large"), MEDIUM("med"), SMALL("small");

	private String size;

	Size(String size) {
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	// Cache the value
	private static final Map<String, Size> values = new HashMap<>();
	static {
		for (Size size : Size.values()) {
			values.put(size.getSize(), size);
		}
	}

	private static Size get(String size) {
		if (!values.containsKey(size)) {
			throw new RuntimeException("Invalid Size");
		}
		return values.get(size);
	}
}
