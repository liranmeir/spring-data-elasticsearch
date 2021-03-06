/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.elasticsearch.core.query;

/**
 * SourceFilter implementation for providing includes and excludes.
 *
 * @Author Jon Tsiros
 */
public class FetchSourceFilter implements SourceFilter {

	private final String[] includes;
	private final String[] excludes;

	public FetchSourceFilter(final String[] includes, final String[] excludes) {
		this.includes = includes;
		this.excludes = excludes;
	}

	@Override
	public String[] getIncludes() {
		return includes;
	}

	@Override
	public String[] getExcludes() {
		return excludes;
	}
}
