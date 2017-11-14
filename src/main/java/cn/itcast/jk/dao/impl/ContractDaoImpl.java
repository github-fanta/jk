package cn.itcast.jk.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.ContractDao;
import cn.itcast.jk.domain.Contract;

/**
 * 
 * @author liq
 *
 */
@Repository
public class ContractDaoImpl extends BaseDaoImpl<Contract> implements ContractDao{
	public ContractDaoImpl() {
		//设置命名空间
		super.setNs("cn.itcast.jk.mapper.ContractMapper");
	}

	public void updateState(Map map) {
		super.getSqlSession().update(super.getNs()+".updateState", map);
	}
}
