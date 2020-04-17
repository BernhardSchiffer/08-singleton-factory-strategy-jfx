package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.Arrays;
import java.util.List;

public class CategoryFilter extends FilterBase {

	private boolean include;
	private List<String> categories;

	CategoryFilter(boolean include, String... categories) {
		this.include = include;
		this.categories = Arrays.asList(categories);
	}

	@Override
	protected boolean include(Meal m) {
		boolean result = categories.contains(m.getCategory().toLowerCase());
		if(include)
			return result;
		else
			return !result;
	}
}
