/*
 *   Morphy Open Source Chess Server
 *   Copyright (C) 2008-2010  http://code.google.com/p/morphy-chess-server/
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package morphy.utils.john;

import morphy.user.UserLevel;

public class ServerList {
	private String name;
	private UserLevel permissions;
	private String tag;

	/**
	 * Creates a new ServerList object.
	 * @param name Name of the list
	 * @param permissions Permissions required to modify the list
	 * @param tag Tag to be given to the player to show list status.
	 */
	public ServerList(String name,UserLevel permissions,String tag) {
		setName(name);
		setPermissions(permissions);
		setTag(tag);
	}

	protected void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	protected void setPermissions(UserLevel permissions) {
		this.permissions = permissions;
	}

	public UserLevel getPermissions() {
		return permissions;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return tag;
	}
}