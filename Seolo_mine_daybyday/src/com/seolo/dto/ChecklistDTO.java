package com.seolo.dto;

import java.util.ArrayList;

public class ChecklistDTO
{
	//○ CheckListDTO 자료형 클래스
	// '나의 체크리스트' 게시글에 관한 작업(등록, 수정, 삭제...) 시 사용 
	
	// 주요 속성 구성
	// 고유번호, 이름
	private int checkNo, acNo, resNo, guNo;
	private String residenceName, dongName, guName, dongNo;
	
	// 주요 속성
	private String checkDate, title, roadAddr, good, bad, etc;
	private String mart, laundry, hospital, food, culture, park, mWolse, deposit, mJeonse, mMaemae;
	private ArrayList<String> stickerList;

	// 점수: 반려동물, 치안, 대중교통, 교통혼잡도
	private int pet_scoreNo, security_scoreNo, transport_scoreNo, honjap_scoreNo;
	// 코멘트: 비밀, 생활편의시설, 반려동물, 치안, 대중교통, 교통혼잡도
	private String secret_co, conv_co, pet_co, security_co, transport_co, honjap_co;
	public int getCheckNo()
	{
		return checkNo;
	}
	public void setCheckNo(int checkNo)
	{
		this.checkNo = checkNo;
	}
	public int getAcNo()
	{
		return acNo;
	}
	public void setAcNo(int acNo)
	{
		this.acNo = acNo;
	}
	public int getResNo()
	{
		return resNo;
	}
	public void setResNo(int resNo)
	{
		this.resNo = resNo;
	}
	public int getGuNo()
	{
		return guNo;
	}
	public void setGuNo(int guNo)
	{
		this.guNo = guNo;
	}
	public String getResidenceName()
	{
		return residenceName;
	}
	public void setResidenceName(String residenceName)
	{
		this.residenceName = residenceName;
	}
	public String getDongName()
	{
		return dongName;
	}
	public void setDongName(String dongName)
	{
		this.dongName = dongName;
	}
	public String getGuName()
	{
		return guName;
	}
	public void setGuName(String guName)
	{
		this.guName = guName;
	}
	public String getDongNo()
	{
		return dongNo;
	}
	public void setDongNo(String dongNo)
	{
		this.dongNo = dongNo;
	}
	public String getCheckDate()
	{
		return checkDate;
	}
	public void setCheckDate(String checkDate)
	{
		this.checkDate = checkDate;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getRoadAddr()
	{
		return roadAddr;
	}
	public void setRoadAddr(String roadAddr)
	{
		this.roadAddr = roadAddr;
	}
	public String getGood()
	{
		return good;
	}
	public void setGood(String good)
	{
		this.good = good;
	}
	public String getBad()
	{
		return bad;
	}
	public void setBad(String bad)
	{
		this.bad = bad;
	}
	public String getEtc()
	{
		return etc;
	}
	public void setEtc(String etc)
	{
		this.etc = etc;
	}
	public String getMart()
	{
		return mart;
	}
	public void setMart(String mart)
	{
		this.mart = mart;
	}
	public String getLaundry()
	{
		return laundry;
	}
	public void setLaundry(String laundry)
	{
		this.laundry = laundry;
	}
	public String getHospital()
	{
		return hospital;
	}
	public void setHospital(String hospital)
	{
		this.hospital = hospital;
	}
	public String getFood()
	{
		return food;
	}
	public void setFood(String food)
	{
		this.food = food;
	}
	public String getCulture()
	{
		return culture;
	}
	public void setCulture(String culture)
	{
		this.culture = culture;
	}
	public String getPark()
	{
		return park;
	}
	public void setPark(String park)
	{
		this.park = park;
	}
	public String getmWolse()
	{
		return mWolse;
	}
	public void setmWolse(String mWolse)
	{
		this.mWolse = mWolse;
	}
	public String getDeposit()
	{
		return deposit;
	}
	public void setDeposit(String deposit)
	{
		this.deposit = deposit;
	}
	public String getmJeonse()
	{
		return mJeonse;
	}
	public void setmJeonse(String mJeonse)
	{
		this.mJeonse = mJeonse;
	}
	public String getmMaemae()
	{
		return mMaemae;
	}
	public void setmMaemae(String mMaemae)
	{
		this.mMaemae = mMaemae;
	}
	public ArrayList<String> getStickerList()
	{
		return stickerList;
	}
	public void setStickerList(ArrayList<String> stickerList)
	{
		this.stickerList = stickerList;
	}
	public int getPet_scoreNo()
	{
		return pet_scoreNo;
	}
	public void setPet_scoreNo(int pet_scoreNo)
	{
		this.pet_scoreNo = pet_scoreNo;
	}
	public int getSecurity_scoreNo()
	{
		return security_scoreNo;
	}
	public void setSecurity_scoreNo(int security_scoreNo)
	{
		this.security_scoreNo = security_scoreNo;
	}
	public int getTransport_scoreNo()
	{
		return transport_scoreNo;
	}
	public void setTransport_scoreNo(int transport_scoreNo)
	{
		this.transport_scoreNo = transport_scoreNo;
	}
	public int getHonjap_scoreNo()
	{
		return honjap_scoreNo;
	}
	public void setHonjap_scoreNo(int honjap_scoreNo)
	{
		this.honjap_scoreNo = honjap_scoreNo;
	}
	public String getSecret_co()
	{
		return secret_co;
	}
	public void setSecret_co(String secret_co)
	{
		this.secret_co = secret_co;
	}
	public String getConv_co()
	{
		return conv_co;
	}
	public void setConv_co(String conv_co)
	{
		this.conv_co = conv_co;
	}
	public String getPet_co()
	{
		return pet_co;
	}
	public void setPet_co(String pet_co)
	{
		this.pet_co = pet_co;
	}
	public String getSecurity_co()
	{
		return security_co;
	}
	public void setSecurity_co(String security_co)
	{
		this.security_co = security_co;
	}
	public String getTransport_co()
	{
		return transport_co;
	}
	public void setTransport_co(String transport_co)
	{
		this.transport_co = transport_co;
	}
	public String getHonjap_co()
	{
		return honjap_co;
	}
	public void setHonjap_co(String honjap_co)
	{
		this.honjap_co = honjap_co;
	}
	
	// 위도, 경도, 시간, 장소(나의 출근지까지의 시간) 빼버렸음.
	// checkDate도 지워도 되는건가..? sysdate하면 될 거 같긴 한데 일단 냅둬보자..
	
	
	// setter, getter 구성
	
	

}
