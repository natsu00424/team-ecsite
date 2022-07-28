package jp.co.internous.sunny.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.sunny.model.domain.dto.PurchaseHistoryDto;
import jp.co.internous.sunny.model.mapper.TblPurchaseHistoryMapper;
import jp.co.internous.sunny.model.session.LoginSession;

@Controller
public class PurchaseHistoryController {
	
	@Autowired
	LoginSession loginSession;
	
	@Autowired
	TblPurchaseHistoryMapper tblPurchaseHistoryMapper;
	
	@RequestMapping("/sunny/history")
	public String index(Model model) {
		int userId = loginSession.getUserId();
		List<PurchaseHistoryDto> list = tblPurchaseHistoryMapper.findByUserId(userId);
		model.addAttribute("history", list);
		model.addAttribute("loginSession",loginSession);
		
		return "purchase_history";
	}
	
	@RequestMapping("/sunny/history/delete")
	@ResponseBody
	public boolean delete() {
		int userId = loginSession.getUserId();
		int result = tblPurchaseHistoryMapper.logicalDeleteByUserId(userId);
		
		return result > 0;
	}
}