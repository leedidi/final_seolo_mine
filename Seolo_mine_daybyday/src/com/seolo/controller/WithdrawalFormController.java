/*==========================
   WithdrawalFormController.java
   - 사용자 정의 컨트롤러
==========================*/

package com.seolo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WithdrawalFormController implements Controller
{
    private IPersonalDAO dao;
    
    public void setDao(IPersonalDAO dao)
    {
        this.dao = dao;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        ModelAndView mav = new ModelAndView();
        
        // 세션 처리-------------------------------------------------------------------------------
        HttpSession session = request.getSession();
          
        if (session.getAttribute("userLogin")==null)   // 탈퇴 폼은 로그인 안한사람이 접근할 수 없음
        {
           mav.setViewName("redirect:main.action");
           return mav;
        }
        // 세션 처리-------------------------------------------------------------------------------
        
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        
        // dao로부터 받아올 데이터
        PersonalDTO confirm = null;
        
        try
        {
            confirm = dao.login(id, pwd);
            
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
        
        if (confirm.getAc_No()==null)    // 입력한 비밀번호가 일치하지 않음
        {
            mav.setViewName("redirect:withdrawalconfirm.action?errMsg=1");
        }
        else
        {
            session.setAttribute("confirm", confirm);
            // 탈퇴 폼에 접근 가능한지 확인용 attribute
            
            mav.setViewName("withdrawalformtwo.action");
        }
        
        
        return mav;

    }
}