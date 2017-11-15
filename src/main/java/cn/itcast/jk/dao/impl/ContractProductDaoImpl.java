package cn.itcast.jk.dao.impl;

import java.io.Serializable;

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

	//级联删除所有合同下面的商品
	public void deleteByContractId(Serializable[] ids) {
		super.getSqlSession().delete(super.getNs()+".deleteByContractId", ids);
	}


}
