package com.zhaiyu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   //1.�������ݿ�����
		Class.forName("org.gjt.mm.mysql.Driver");
		//2.�������ݿ�����
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","123456");
		//3�������ݿ�ִ�ж���
		Statement stmt=conn.createStatement();
		//4.ִ��SQL���
		String sql ="insert into admit(ename,p) values('zhangsan','111')";
		stmt.executeUpdate(sql);///sts��ɾ��ȫ��update
		//5.û�в�ѯ�����Թ�
		//6.�ر�����/�ͷ���Դ
		stmt.close();
		conn.close();
		
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
