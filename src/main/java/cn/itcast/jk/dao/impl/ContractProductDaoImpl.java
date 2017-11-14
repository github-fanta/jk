package cn.itcast.jk.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.ContractProductDao;
import cn.itcast.jk.domain.ContractProduct;

/**
 * 
 * @author liq
 *
 */
@Repository
public class ContractProductDaoImpl extends BaseDaoImpl<ContractProduct> implements ContractProductDao{
	public ContractProductDaoImpl() {
		//设置命名空间
		super.setNs("cn.itcast.jk.mapper.ContractProductMapper");
	}

}
