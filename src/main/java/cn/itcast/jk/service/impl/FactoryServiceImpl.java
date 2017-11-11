package cn.itcast.jk.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.pagination.Page;
import cn.itcast.jk.service.FactoryService;

/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月9日
 */
@Service
public class FactoryServiceImpl implements FactoryService {
	@Resource
	FactoryDao factoryDao;

	
	public List<Factory> findPage(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Factory> find(Map paraMap) {
		return factoryDao.find(paraMap);
	}

	public Factory get(Serializable id) {
		return factoryDao.get(id);
	}

	public void insert(Factory factory) {
		factory.setId(UUID.randomUUID().toString());
		factoryDao.insert(factory);
	}

	public void update(Factory factory) {
		factoryDao.update(factory);
	}

	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}

	public void start(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}

	public void stop(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}


}
