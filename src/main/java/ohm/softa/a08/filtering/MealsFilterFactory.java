package ohm.softa.a08.filtering;

import java.util.HashMap;

public abstract class MealsFilterFactory {

	private static final HashMap<String, MealsFilter> filters = new HashMap<>();

	static {
		filters.put("All", new NoFilter());
		filters.put("No pork", new CategoryFilter(false, "Schwein"));
		filters.put("No soy", new NotesFilter(false, "mit Soja"));
		filters.put("Vegetarian", new CategoryFilter(true, "vegetarisch", "vegan"));
	}

	private MealsFilterFactory() {
	}

	public static MealsFilter getStrategy(String key) {
		return filters.getOrDefault(key, filters.get("All"));
	}

}
