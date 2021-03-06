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
package org.apache.openmeetings.web.common.menu;

import java.util.List;

import com.googlecode.wicket.jquery.ui.widget.menu.IMenuItem;

public class OmMenuItem extends com.googlecode.wicket.jquery.ui.widget.menu.MenuItem {
	private static final long serialVersionUID = 1L;
	private String desc;
	private boolean top;

	public OmMenuItem(String title, List<IMenuItem> items) {
		super(title, items);
		setTop(true);
	}

	public OmMenuItem(String title, String desc) {
		super(title);
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isTop() {
		return top;
	}

	public OmMenuItem setTop(boolean top) {
		this.top = top;
		return this;
	}
}
