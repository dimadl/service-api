/*
 * Copyright 2017 EPAM Systems
 *
 *
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/service-api
 *
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.epam.ta.reportportal.core.widget.content;

import com.epam.ta.reportportal.commons.querygen.Filter;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Map;

/**
 * Strategy definition interface for loading widget content.
 *
 * @author Pavel Bortnik
 */
public interface LoadContentStrategy {

	String RESULT = "result";
	String LATEST_OPTION = "latest";
	String LATEST_LAUNCH = "latest_launch";
	String LAUNCH_NAME_FIELD = "launch_name_filter";
	String LOGIN = "login";

	Map<String, ?> loadContent(List<String> contentFields, Filter filter, Sort sort, Map<String, String> widgetOptions, int limit);

}
