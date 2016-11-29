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
package org.estatio.numerator.fixture;

import org.incode.module.integtestsupport.dom.TeardownFixtureAbstract;

import org.estatio.dom.security.SecurityModuleWithinEstatioTearDown;
import org.estatio.numerator.dom.impl.Numerator;
import org.estatio.numerator.fixture.dom.NumeratorExampleObject;

public class NumeratorModuleTeardownFixture extends TeardownFixtureAbstract {

    @Override
    protected void execute(final ExecutionContext executionContext) {
        deleteAllDirect();
    }

    protected void deleteAllDirect() {

        deleteFrom(Numerator.class);

        runFixtureScript(new SecurityModuleWithinEstatioTearDown());

        deleteFrom(NumeratorExampleObject.class);
    }


}
