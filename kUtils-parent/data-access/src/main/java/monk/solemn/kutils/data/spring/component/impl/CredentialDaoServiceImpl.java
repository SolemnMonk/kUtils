package monk.solemn.kutils.data.spring.component.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import monk.solemn.kutils.data.dao.CredentialDao;
import monk.solemn.kutils.data.spring.component.CredentialDaoService;

@Component
public class CredentialDaoServiceImpl implements CredentialDaoService {
	private CredentialDao credentialDao;
	
	@Autowired
	public CredentialDaoServiceImpl(CredentialDao credentialDao) {
		this.credentialDao = credentialDao;
	}

	public CredentialDao getCredentialDao() {
		return credentialDao;
	}
}
