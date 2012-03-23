package com.arvatosystems.us.training.dep;

public interface SearchService {

	public <E extends Entity> SearchResult<E> search(SearchQuery q);
}
