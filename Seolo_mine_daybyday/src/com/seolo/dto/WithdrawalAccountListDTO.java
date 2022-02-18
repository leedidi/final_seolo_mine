/*=========================
 	AccountListDTO.java
 	- 탈퇴회원 출력 DTO
==========================*/

// WITHDRAWAL_ID, WITHDRAWAL_NAME, WITHDRAWAL_DATE, REASON, WITHDRAWAL_NO

package com.seolo.dto;

import java.sql.Date;

public class WithdrawalAccountListDTO
{
	String withdrawal_id, withdrawal_name, withdrawal_no, reason;
	Date withdrawal_date;
	
	// getter / setter 구성
	public String getWithdrawal_id()
	{
		return withdrawal_id;
	}
	public void setWithdrawal_id(String withdrawal_id)
	{
		this.withdrawal_id = withdrawal_id;
	}
	public String getWithdrawal_name()
	{
		return withdrawal_name;
	}
	public void setWithdrawal_name(String withdrawal_name)
	{
		this.withdrawal_name = withdrawal_name;
	}
	public String getWithdrawal_no()
	{
		return withdrawal_no;
	}
	public void setWithdrawal_no(String withdrawal_no)
	{
		this.withdrawal_no = withdrawal_no;
	}
	public String getReason()
	{
		return reason;
	}
	public void setReason(String reason)
	{
		this.reason = reason;
	}
	public Date getWithdrawal_date()
	{
		return withdrawal_date;
	}
	public void setWithdrawal_date(Date withdrawal_date)
	{
		this.withdrawal_date = withdrawal_date;
	}
	
	

}
