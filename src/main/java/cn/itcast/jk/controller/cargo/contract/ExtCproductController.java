package cn.itcast.jk.controller.cargo.contract;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.jk.controller.BaseController;
import cn.itcast.jk.domain.ExtCproduct;
import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.domain.SysCode;
import cn.itcast.jk.service.ExtCproductService;
import cn.itcast.jk.service.FactoryService;

/**
 * 
 * @author liq
 *
 */
@Controller
public class ExtCproductController extends BaseController {

	@Autowired
	private ExtCproductService extCproductService;
	@Autowired
	private FactoryService factoryService;
	
	
	@RequestMapping("/cargo/extcproduct/tocreate.action")
	public String tocreate(String contractProductId, Model model) {
		
		model.addAttribute("contractProductId", contractProductId);
		
		//某个货物下的附件信息
		Map paraMap = new HashMap();
		paraMap.put("contractProductId", contractProductId);
		List<ExtCproduct> dataList = extCproductService.find(paraMap);
		model.addAttribute("dataList", dataList);
		
		//准备生产厂家的下拉列表
		List<Factory> factoryList = factoryService.getFactoryList();
		model.addAttribute("factoryList", factoryList);
		
		//准备分类下拉列表
		List<SysCode> ctypeList = extCproductService.getCtypeList();
		model.addAttribute("ctypeList", ctypeList);
		return "/cargo/contract/jExtCproductCreate.jsp";
	}
	
	@RequestMapping("/cargo/extcproduct/insert.action")
	public String insert(ExtCproduct extCproduct, Model model) {
		extCproductService.insert(extCproduct);
		model.addAttribute("extCproductId", extCproduct.getContractProductId());  //传递主表ID
		return "redirect:/cargo/extcproduct/tocreate.action";
	}
}
