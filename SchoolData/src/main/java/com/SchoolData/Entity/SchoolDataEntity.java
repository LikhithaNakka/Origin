package com.SchoolData.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="schooldata")
public class SchoolDataEntity {

	
	@Id
	private String s_no;
	
	@Column(name="School_ID")
	private String School_ID;
	
	@Column(name="School_NAME")
	private String School_NAME;
	
	
	@Column(name="School_TYPE")
	private String School_TYPE;
	
	@Column(name="Payment_Integration")
	private String Payment_Integration;
	
	@Column(name="SIS_Intration_Status")
	private String SIS_Intration_Status;
	
	@Column(name="Nutrition_Analysis")
	private String Nutrition_Analysis;

	public String getS_no() {
		return s_no;
	}

	public void setS_no(String s_no) {
		this.s_no = s_no;
	}

	public String getSchool_ID() {
		return School_ID;
	}

	public void setSchool_ID(String school_ID) {
		School_ID = school_ID;
	}

	public String getSchool_NAME() {
		return School_NAME;
	}

	public void setSchool_NAME(String school_NAME) {
		School_NAME = school_NAME;
	}

	public String getSchool_TYPE() {
		return School_TYPE;
	}

	public void setSchool_TYPE(String school_TYPE) {
		School_TYPE = school_TYPE;
	}

	public String getPayment_Integration() {
		return Payment_Integration;
	}

	public void setPayment_Integration(String payment_Integration) {
		Payment_Integration = payment_Integration;
	}

	public String getSIS_Intration_Status() {
		return SIS_Intration_Status;
	}

	public void setSIS_Intration_Status(String sIS_Intration_Status) {
		SIS_Intration_Status = sIS_Intration_Status;
	}

	public String getNutrition_Analysis() {
		return Nutrition_Analysis;
	}

	public void setNutrition_Analysis(String nutrition_Analysis) {
		Nutrition_Analysis = nutrition_Analysis;
	}
	

	
	
}
