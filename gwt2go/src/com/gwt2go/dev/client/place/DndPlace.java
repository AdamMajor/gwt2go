/*
 * Copyright 2012
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.gwt2go.dev.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class DndPlace extends Place {

	private String dndName;

	public DndPlace(String token) {
		this.dndName = token;
	}

	public String getDndName() {
		return dndName;
	}

	public static class Tokenizer implements PlaceTokenizer<DndPlace> {
		@Override
		public String getToken(DndPlace place) {
			return place.getDndName();
		}

		@Override
		public DndPlace getPlace(String token) {
			return new DndPlace(token);
		}
	}

}