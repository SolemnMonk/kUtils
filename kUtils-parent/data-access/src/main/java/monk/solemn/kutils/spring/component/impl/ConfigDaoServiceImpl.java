package monk.solemn.kutils.spring.component.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import monk.solemn.kutils.dao.ConfigDao;
import monk.solemn.kutils.spring.component.ConfigDaoService;

@Component
public class ConfigDaoServiceImpl implements ConfigDaoService {
	private ConfigDao configDao;
	
	@Autowired
	public ConfigDaoServiceImpl(ConfigDao configDao) {
		this.configDao = configDao;
	}

	public ConfigDao getConfigDao() {
		return configDao;
	}
}