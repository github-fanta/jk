package cn.itcast.jk.dao;

import java.util.Map;

import cn.itcast.jk.domain.Contract;

/**
 * 
 * @author liq
 *
 */
public interface ContractDao extends BaseDao<Contract> {
	public void updateState(Map map);			//修改状态
}
