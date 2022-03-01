package com.seolo.dto;

public class PersonalDTO
{
	
	// 아이디			PE_ID 
	// 계정 고유번호 	AC_NO
	// 이름 			NAME
	// 전화번호			TEL
	// 닉네임			NICKNAME
	// 비밀번호			PW
	// 이메일			EMAIL
	// 도로명주소		ROADADDR
	// 상세주소			DETAILADDR
	// 프로필 사진		PROFILE
	// 가입일시			PEDATE
	
	private String pe_Id;							// 아이디
	private String ac_No;							// 계정 교유번호
	private String name, tel, nickName, pw, email; 	// 이름, 전화번호, 닉네임, 비밀번호, 이메일
	private String roadAddr, detailAddr;			// 도로명주소, 상세주소
	private String profile;							// 프로필 사진
	private String peDate;			
	private int warningCount;                  // 누적 경고횟수(함수로 조회)
	
	// 가입일시
	public String getPe_Id()
	{
		return pe_Id;
	}
	public void setPe_Id(String re_Id)
	{
		this.pe_Id = re_Id;
	}
	public String getAc_No()
	{
		return ac_No;
	}
	public void setAc_No(String ac_No)
	{
		this.ac_No = ac_No;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getTel()
	{
		return tel;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	public String getNickName()
	{
		return nickName;
	}
	public void setNickName(String nickName)
	{
		this.nickName = nickName;
	}
	public String getPw()
	{
		return pw;
	}
	public void setPw(String pw)
	{
		this.pw = pw;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getRoadAddr()
	{
		return roadAddr;
	}
	public void setRoadAddr(String roadAddr)
	{
		this.roadAddr = roadAddr;
	}
	public String getDetailAddr()
	{
		return detailAddr;
	}
	public void setDetailAddr(String detailAddr)
	{
		this.detailAddr = detailAddr;
	}
	public String getProfile()
	{
		return profile;
	}
	public void setProfile(String profile)
	{
		this.profile = profile;
	}
	public String getPeDate()
	{
		return peDate;
	}
	public void setPeDate(String peDate)
	{
		this.peDate = peDate;
	}
	
   public int getWarningCount()
   {
      return warningCount;
   }
   public void setWarningCount(int warningCount)
   {
      this.warningCount = warningCount;
   }
	
	
	
	
	
	
}
