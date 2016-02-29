import java.util.ArrayList;
import java.util.List;

public class InferenceCheck {

	public List<String> check(List<String> values) {
		return notNullOrElse(values, createEmptyList());
	}

	private static <T> List<T> createEmptyList() {
		return new ArrayList<T>();
	}

	private static <T> T notNullOrElse(T object, T defaultValue) {
		return object != null ? object : defaultValue;
	}

}
