package org.everit.osgi.jpa.container;

/*
 * Copyright (c) 2011, Everit Kft.
 *
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

import org.apache.aries.util.VersionRange;

/**
 * Simple immutable pojo to hold the class name of a Persistence provider with the range of the version that is
 * accepted.
 */
public class ProviderNameWithVersionRange {

    /**
     * The class name of the persistence provider.
     */
    private String className;

    /**
     * The accepted version range.
     */
    private VersionRange versionRange;

    /**
     * Constructor of the class that sets all fields.
     * 
     * @param className
     *            The class name of hte persistence provider.
     * @param versionRange
     *            The accepted version range.
     */
    public ProviderNameWithVersionRange(final String className, final VersionRange versionRange) {
        super();
        this.className = className;
        this.versionRange = versionRange;
    }

    public String getClassName() {
        return className;
    }

    public VersionRange getVersionRange() {
        return versionRange;
    }
}
