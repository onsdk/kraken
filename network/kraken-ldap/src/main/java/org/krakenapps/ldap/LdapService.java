/*
 * Copyright 2011 Future Systems
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.krakenapps.ldap;

import java.util.Collection;

public interface LdapService {
	Collection<LdapProfile> getProfiles();

	LdapProfile getProfile(String name);

	void createProfile(LdapProfile profile);

	void updateProfile(LdapProfile profile);

	void removeProfile(String name);

	Collection<DomainUserAccount> getDomainUserAccounts(LdapProfile profile);

	DomainUserAccount findDomainUserAccount(LdapProfile profile, String account);

	Collection<DomainOrganizationalUnit> getOrganizationUnits(LdapProfile profile);

	boolean verifyPassword(LdapProfile profile, String account, String password);

	boolean verifyPassword(LdapProfile profile, String account, String password, int timeout);
}
