package cn.itcast.jk.dao;

import java.io.Serializable;
import java.util.Map;

import cn.itcast.jk.domain.ContractProduct;

/**
 * 
 * @author liq
 *
 */
public interface ContractProductDao extends BaseDao<ContractProduct> {
	void deleteByContractId(Serializable[] ids);
}
