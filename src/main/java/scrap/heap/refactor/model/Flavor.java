package scrap.heap.refactor.model;

import java.util.HashMap;
import java.util.Map;

public enum Flavor {
	VANILLA("vanilla"), CHOCOLATE("chocolate");

	private String flavor;

	Flavor(String flavor) {
		this.flavor = flavor;
	}

	public String getFlavor() {
		return flavor;
	}

	// Cache the value
	private static final Map<String, Flavor> values = new HashMap<>();
	static {
		for (Flavor flavor : Flavor.values()) {
			values.put(flavor.getFlavor(), flavor);
		}
	}

	private static Flavor get(String flavor) {
		if (!values.containsKey(flavor)) {
			throw new RuntimeException("Invalid Color");
		}
		return values.get(flavor);
	}
}
