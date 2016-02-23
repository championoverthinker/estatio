/*
 *
 *  Copyright 2012-2014 Eurocommercial Properties NV
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.estatio.dom.lease;

import org.estatio.dom.utils.StringUtils;

public enum LeaseTermStatus {

    APPROVED(false),
    NEW(true);

    private boolean updatable;

    LeaseTermStatus(final boolean updatable) {
        this.updatable = updatable;
    }

    public String title() {
        return StringUtils.enumTitle(this.name());
    }

    public static LeaseTermStatus valueOfElse(final String status, final LeaseTermStatus statusElse) {
        return status != null ? valueOf(status) : statusElse;
    }

    public boolean isApproved() {
        return this == LeaseTermStatus.APPROVED;
    }

    public boolean isNew() {
        return this == LeaseTermStatus.NEW;
    }

    public boolean isUpdatable() {
        return updatable;
    }

}
