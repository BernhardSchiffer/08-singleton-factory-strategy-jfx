package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.Arrays;
import java.util.List;

public class NotesFilter extends FilterBase {

	private boolean keep;
	private List<String> notes;

	NotesFilter(boolean keep, String... notes) {
		this.keep = keep;
		this.notes = Arrays.asList(notes);
	}

	@Override
	protected boolean include(Meal m) {

		for (String mealNote : m.getNotes()) {
			for (String note : this.notes) {
				boolean contains = mealNote.toLowerCase().contains(note.toLowerCase());
				if(!keep && contains)
					return false;
			}
		}
		return true;
	}
}
