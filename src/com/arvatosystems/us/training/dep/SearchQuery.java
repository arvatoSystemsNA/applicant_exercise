package com.arvatosystems.us.training.dep;

import java.util.Map;

public class SearchQuery
{
	private int count;
	private int start;
	private Map<String, Object> queryParameters;

	public SearchQuery(String q) {
		
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public Map<String, Object> getQueryParameters() {
		return queryParameters;
	}

	public void setQueryParameters(Map<String, Object> queryParameters) {
		this.queryParameters = queryParameters;
	}
	
}
