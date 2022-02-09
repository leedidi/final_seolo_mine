package com.seolo.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.seolo.idao.IRegionDAO;

@Controller
public class RegionController
{
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/region.action", method = RequestMethod.GET)
	public String regionView(Model model, HttpServletRequest request)
	{
		IRegionDAO dao = sqlSession.getMapper(IRegionDAO.class);
		
		String guNo = request.getParameter("guNo");
		String dongNo = request.getParameter("dongNo");
		
		if (guNo==null)
		{
			return "redirect:region.action?guNo=&dongNo=";
		}
		
		// select박스 구, 동 리스트
		model.addAttribute("guList", dao.guList());
		model.addAttribute("dongList", dao.dongList(guNo));
		
		// 지역정보 리스트
		model.addAttribute("localList", dao.localList(guNo));
		model.addAttribute("checkList", dao.checkList(dongNo));
		
		return "WEB-INF/view/SearchRegion.jsp";
	}
}
