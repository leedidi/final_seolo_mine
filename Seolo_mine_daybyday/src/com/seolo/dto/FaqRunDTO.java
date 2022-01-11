package com.seolo.dto;

public class FaqRunDTO
{
	/*
	 FAQ_NO		자주 묻는 질문 순번
	 AD_ID	 	관리자 아이디
	 QS_NO		카테고리 번호
	 TITLE		제목
	 CONTENT	내용
	*/
	
	int faq_no, qs_no;
	String ad_id, title, content;
	
	// getter / setter
	public int getFaq_no()
	{
		return faq_no;
	}
	public void setFaq_no(int faq_no)
	{
		this.faq_no = faq_no;
	}
	public int getQs_no()
	{
		return qs_no;
	}
	public void setQs_no(int qs_no)
	{
		this.qs_no = qs_no;
	}
	public String getAd_id()
	{
		return ad_id;
	}
	public void setAd_id(String ad_id)
	{
		this.ad_id = ad_id;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}

}
