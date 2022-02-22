/*=========================
 	AccountListDTO.java
 	- 회원 출력 DTO
==========================*/

package com.seolo.dto;
import java.sql.Date;

public class AccountListDTO
{
	String pe_id, nickname, name, email, ac_no;
	Date pedate;
	
	// getter / setter
	public String getPe_id()
	{
		return pe_id;
	}
	public void setPe_id(String pe_id)
	{
		this.pe_id = pe_id;
	}
	public String getNickname()
	{
		return nickname;
	}
	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getAc_no()
	{
		return ac_no;
	}
	public void setAc_no(String ac_no)
	{
		this.ac_no = ac_no;
	}
	public Date getPedate()
	{
		return pedate;
	}
	public void setPedate(Date pedate)
	{
		this.pedate = pedate;
	}
	
	
}
