/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openmeetings.web.user.dashboard.admin;

import org.apache.openmeetings.cli.CleanupEntityUnit;
import org.apache.wicket.markup.html.basic.Label;

public class CleanupEntityUnitPanel extends CleanupUnitPanel {
	private static final long serialVersionUID = 1L;

	public CleanupEntityUnitPanel(String id, String lbl, CleanupEntityUnit u) {
		super(id, lbl, u);
		add(new Label("humanInvalid"));
		add(new Label("humanDeleted"));
		add(new Label("missing"));
	}
}
