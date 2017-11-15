package cn.itcast.jk.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.aspectj.weaver.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.jk.dao.ContractProductDao;
import cn.itcast.jk.dao.ExtCproductDao;
import cn.itcast.jk.domain.ContractProduct;
import cn.itcast.jk.pagination.Page;
import cn.itcast.jk.service.ContractProductService;
import cn.itcast.util.UtilFuns;

/**
 * 
 * @author liq
 *
 */
@Service
public class ContractProductServiceImpl implements ContractProductService {
	
	@Resource
	ContractProductDao contractProductDao;

	@Autowired
	ExtCproductDao extCproductDao;

	public List<ContractProduct> findPage(Page page) {
		return contractProductDao.findPage(page);
	}

	public List<ContractProduct> find(Map paraMap) {
		return contractProductDao.find(paraMap);
	}

	public ContractProduct get(Serializable id) {
		return contractProductDao.get(id);
	}

	public void insert(ContractProduct contractProduct) {
		contractProduct.setId(UUID.randomUUID().toString());
		//自动计算总金额=数量*单价		...修改，删除；同步合同总金额
		if (UtilFuns.isNotEmpty(contractProduct.getCnumber()) && UtilFuns.isNotEmpty(contractProduct.getPrice())) {
			contractProduct.setAmount(contractProduct.getCnumber()*contractProduct.getPrice());
		}
		
		contractProductDao.insert(contractProduct);
	}

	public void update(ContractProduct contractProduct) {
		contractProductDao.update(contractProduct);
	}

	public void deleteById(Serializable id) {
		Serializable[] ids = {id};
		extCproductDao.deleteByContractProductById(ids);  //先删除与之级联的下级表
		contractProductDao.deleteById(id);
	}

	public void delete(Serializable[] ids) {
		extCproductDao.deleteByContractProductById(ids);  //先删除与之级联的下级表
		contractProductDao.delete(ids);
	}

}
