package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.ArrayList;
import java.util.List;

public abstract class FilterBase implements MealsFilter {
	protected abstract boolean include(Meal m);

	@Override
	public List<Meal> filter(List<Meal> meals) {
		List<Meal> result = new ArrayList<>();
		for (Meal m : meals) {
			if(this.include(m))
				result.add(m);
		}
		return result;
	}
}
