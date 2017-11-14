package cn.itcast.jk.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.SysCodeDao;
import cn.itcast.jk.domain.SysCode;

/**
 * 
 * @author liq
 *
 */
@Repository
public class SysCodeDaoImpl extends BaseDaoImpl<SysCode> implements SysCodeDao{
	public SysCodeDaoImpl() {
		//设置命名空间
		super.setNs("cn.itcast.jk.mapper.SysCodeMapper");
	}

}
