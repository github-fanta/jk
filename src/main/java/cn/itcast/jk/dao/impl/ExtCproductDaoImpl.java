package cn.itcast.jk.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.ExtCproductDao;
import cn.itcast.jk.domain.ExtCproduct;

/**
 * 
 * @author liq
 *
 */
@Repository
public class ExtCproductDaoImpl extends BaseDaoImpl<ExtCproduct> implements ExtCproductDao{
	public ExtCproductDaoImpl() {
		//设置命名空间
		super.setNs("cn.itcast.jk.mapper.ExtCproductMapper");
	}

}
