package cn.itcast.jk.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.jk.dao.SysCodeDao;
import cn.itcast.jk.domain.SysCode;
import cn.itcast.jk.service.SysCodeService;

/**
 * @author liq
 *
 */

@Service
public class SysCodeServiceImpl implements SysCodeService {

	
	@Autowired
	private SysCodeDao sysCodeDao;

	public List<SysCode> find(Map paraMap) {

		List<SysCode> list = sysCodeDao.find(paraMap);
		return list;
	}

}
