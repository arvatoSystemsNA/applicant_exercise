package com.arvatosystems.us.training.dep;

import java.util.List;

public interface SearchResult<E extends Entity> {

	public List<E> getResult();
}
