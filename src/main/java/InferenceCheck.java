import java.util.List;
import java.util.stream.Collectors;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;

public class InferenceCheck {

	public List<String> check(List<String> values) {
		List<String> safeValues = MoreObjects.firstNonNull(values, ImmutableList.of());
		return safeValues.stream().distinct().sorted().collect(Collectors.toList());
	}

}
