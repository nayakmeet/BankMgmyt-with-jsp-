package com.cg.bean;

public class BankBean {
	
	 private int customerId;
	 private String customerName;
	 private String phoneNo;
	 private String password;
	 private String repassword;
	 
	public BankBean(String customerName, String phoneNo, String password,
			String repassword) {
		super();
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.password = password;
		this.repassword = repassword;
	}
	public BankBean()
	{
		
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	@Override
	public String toString() {
		return "BankBean [customerName=" + customerName + ", phoneNo="
				+ phoneNo + ", password=" + password + ", repassword="
				+ repassword + "]";
	}
	 
	 
	

}
