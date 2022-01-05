package com.seolo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.seolo.idao.IUpdateDAO;
import com.seolo.personal.PersonalDTO;

@Controller
public class PersonalUpdateController
{
	@Autowired
	private SqlSession sqlSession;	// mybatis 객체 의존성(자동) 주입
	
	@RequestMapping(value = "/myinfo.action", method = RequestMethod.GET)
	public String myInfoForm(Model model, HttpSession session)
	{
		IUpdateDAO dao = sqlSession.getMapper(IUpdateDAO.class);
		
		if (session.getAttribute("userLogin")==null)	// 로그인 안하면 차단
		{
			return "redirect:main.action";
		}
		else
		{
			PersonalDTO userLogin = (PersonalDTO)session.getAttribute("userLogin");
			String pe_Id = userLogin.getPe_Id();
			
			PersonalDTO user = dao.searchId(pe_Id);
			model.addAttribute("user", user);
		}
		
		return "WEB-INF/view/MyInfo.jsp";
	}
	
	// ★ 소연 수정
	@RequestMapping(value = "/infoupdateconfirmform.action", method = RequestMethod.GET)
	public String updateConfirmform(Model model, HttpSession session, HttpServletRequest request)
	{
		IUpdateDAO dao = sqlSession.getMapper(IUpdateDAO.class);
		
		if (session.getAttribute("userLogin")==null)	// 로그인 안하면 차단
		{
			return "redirect:main.action";
		}
		else
		{
			String errMsg = null;
	        errMsg = request.getParameter("errMsg");
	        if (errMsg != null)   // 기존 비밀번호 다르게 입력한 사람들에게 에러메세지
	           model.addAttribute("errMsg", errMsg);
	        
		}
		
		return "WEB-INF/view/UpdateConfirm.jsp";
	}
	
	// ★
	@RequestMapping(value = "/infoupdateconfirm.action", method = RequestMethod.POST)
	public String updateConfirm(Model model, HttpSession session, HttpServletRequest request)
	{
		IUpdateDAO dao = sqlSession.getMapper(IUpdateDAO.class);
		
		if (session.getAttribute("userLogin")==null)	// 로그인 안하면 차단
		{
			return "redirect:main.action";
		}
		else
		{
			PersonalDTO user = new PersonalDTO();
			user.setPe_Id(request.getParameter("id"));
			user.setPw(request.getParameter("pwd"));
			
			int count = dao.confirmPwd(user);
			if (count!=1)
			{
				model.addAttribute("errMsg", "err");
				return "redirect:infoupdateconfirmform.action";
			}
			else
			{
				return "redirect:myinfoupdateform.action";
			}
	        
		}
		
	}
	
	@RequestMapping(value = "/myinfoupdateform.action", method = RequestMethod.GET)
	public String updateForm(Model model, HttpSession session)
	{
		IUpdateDAO dao = sqlSession.getMapper(IUpdateDAO.class);
		
		if (session.getAttribute("userLogin")==null)	// 로그인 안하면 차단
		{
			return "redirect:main.action";
		}

			//String updateId = id;
			// PersonalDTO user = dao.searchId(id);
			//model.addAttribute("updateId", updateId);
			String id = ((PersonalDTO)session.getAttribute("userLogin")).getPe_Id();
		
			model.addAttribute("user", dao.searchId(id));
			
			return "WEB-INF/view/MyInfoUpdate.jsp"; 
	}
	
	
	@RequestMapping(value = "/myinfoupdate.action",method = RequestMethod.POST)
	public String infoUpdate(Model model, HttpSession session,PersonalDTO dto)
	{
		IUpdateDAO dao = sqlSession.getMapper(IUpdateDAO.class);
		
		if (session.getAttribute("userLogin")==null)	// 로그인 안하면 차단
		{
			return "redirect:main.action";
		}
		
		dao.update(dto);

		return "WEB-INF/view/MyInfoUpdateFn.jsp";
		                     
	}
	
   // ★ 소연 수정
   @RequestMapping(value = "/pwdchangeform.action", method = RequestMethod.GET)
   public String pwdChangeForm(Model model, HttpSession session, HttpServletRequest request)
   {
      IUpdateDAO dao = sqlSession.getMapper(IUpdateDAO.class);
      
      if (session.getAttribute("userLogin")==null)   // 로그인 안하면 차단
      {
         return "redirect:main.action";
      }
      else
      {
         String errMsg = null;
         errMsg = request.getParameter("errMsg");
         if (errMsg != null)   // 기존 비밀번호 다르게 입력한 사람들에게 에러메세지
            model.addAttribute("errMsg", errMsg);
         
      }
      
      return "WEB-INF/view/PwdChange.jsp";
   }
   
   @RequestMapping(value = "/pwdchange.action", method = RequestMethod.POST)
   public String pwdChange(Model model, HttpSession session, String nowPwd, String newPwd)
   {
      IUpdateDAO dao = sqlSession.getMapper(IUpdateDAO.class);
      
      if (session.getAttribute("userLogin")==null)   // 로그인 안하면 차단
      {
         return "redirect:main.action";
      }
      else
      {   
         String id = ((PersonalDTO)session.getAttribute("userLogin")).getPe_Id();
         PersonalDTO user = new PersonalDTO();
         user.setPe_Id(id);
         user.setPw(nowPwd);
         
         int count = dao.confirmPwd(user);   // 입력한 기존 비밀번호가 일치하는지 확인(0이면 불일치, 1이면 일치)
         if (count==0)
         {
            model.addAttribute("errMsg", "err");
            return "redirect:pwdchangeform.action";   // 다르다면 변경 불가 → 폼으로 리다이렉트
         }
         
         user.setPw(newPwd);
         dao.updatePwd(user);   // 비밀번호 업데이트
      }
      
      return "WEB-INF/view/PwdChangeFn.jsp";
   }
	
   // 다영 수정
   // <나의 신고리스트> 추가
   
   // 나의 신고리스트 상세 페이지로 바로가기
   @RequestMapping(value = "/myInfoReportList.action", method = RequestMethod.GET)
	public String myInfoReportList(Model model, HttpSession session)
	{
		IUpdateDAO dao = sqlSession.getMapper(IUpdateDAO.class);
		
		if (session.getAttribute("userLogin")==null)	// 로그인 안하면 차단
		{
			return "redirect:main.action";
		}
		else
		{
			PersonalDTO userLogin = (PersonalDTO)session.getAttribute("userLogin");
			String pe_Id = userLogin.getPe_Id();
			
			PersonalDTO user = dao.searchId(pe_Id);
			model.addAttribute("user", user);
		}
		
		return "WEB-INF/view/MyInfoReportList.jsp";
	}
	
}
