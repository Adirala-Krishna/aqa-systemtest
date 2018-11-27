/*******************************************************************************
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      https://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/
package net.adoptopenjdk.test.modularity.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import javax.xml.namespace.QName;
import org.junit.Test;

public class TestOverrideUsingPlatformModuleInRegularJar {
	
	@Test
	public void testOverrideUsingPlatformModuleInRegularJar () {
		QName ite = new QName("1234");
		String name = ite.getLocalPart​();
		assertEquals("Overridden", name);
	}	
}
