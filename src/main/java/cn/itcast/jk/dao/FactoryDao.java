package cn.itcast.jk.dao;

import java.util.Map;

import cn.itcast.jk.domain.Factory;

/**
 * 
 * @author liq
 *
 */
public interface FactoryDao extends BaseDao<Factory> {
	public void updateState(Map map);			//修改状态
}
