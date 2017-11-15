package cn.itcast.jk.dao;

import java.io.Serializable;
import java.util.Map;

import cn.itcast.jk.domain.ContractProduct;
import cn.itcast.jk.domain.ExtCproduct;

/**
 * 
 * @author liq
 *
 */
public interface ExtCproductDao extends BaseDao<ExtCproduct> {
	public void deleteByContractProductById(Serializable[] ids);
	void deleteByContractId(Serializable[] ids);
}
