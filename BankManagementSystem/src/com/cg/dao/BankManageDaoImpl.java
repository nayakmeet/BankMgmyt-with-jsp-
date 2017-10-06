package com.cg.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.cg.bean.BankBean;
import com.cg.dbutil.DbUtil;

public class BankManageDaoImpl implements IBankManage {
	int value = 0;
	@Override
	public int addDetails(BankBean bean) {
		
		Connection conn=null;
		int rows=0;
		try{
			conn=DbUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into bankdetails values(custid_SEQ.nextval,?,?,?,?)");
			ps.setString(1,bean.getCustomerName());
			ps.setString(2,bean.getPhoneNo());
			ps.setString(3,bean.getPassword());
			ps.setString(4, bean.getRepassword());
			
			rows=ps.executeUpdate();
		
			
			PreparedStatement ps1 =conn.prepareStatement("Select custid_SEQ.currval from dual");
			ResultSet rs=ps1.executeQuery();
		
			while(rs.next())
				{
					value=rs.getInt(1);
					
				}
		
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(NamingException e)
		{
			e.printStackTrace();
		}
		return value;
		
	}

}
