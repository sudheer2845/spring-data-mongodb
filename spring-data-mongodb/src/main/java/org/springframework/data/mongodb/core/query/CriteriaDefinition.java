/*
 * Copyright 2010-2014 the original author or authors.
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
package org.springframework.data.mongodb.core.query;

import com.mongodb.DBObject;

/**
 * @author Oliver Gierke
 * @author Christoph Strobl
 */
public interface CriteriaDefinition {

	/**
	 * Get {@link DBObject} representation.
	 * 
	 * @return
	 */
	DBObject getCriteriaObject();

	/**
	 * Get the identifying {@literal key}.
	 * 
	 * @return
	 * @since 1.6
	 */
	String getKey();

}
