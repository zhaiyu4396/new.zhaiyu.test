package com.zhaiyu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   //1.加载数据库驱动
		Class.forName("org.gjt.mm.mysql.Driver");
		//2.创建数据库链接
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","123456");
		//3创建数据库执行对象
		Statement stmt=conn.createStatement();
		//4.执行SQL语句
		String sql ="insert into admit(ename,p) values('zhangsan','111')";
		stmt.executeUpdate(sql);///sts增删改全用update
		//5.没有查询所以略过
		//6.关闭连接/释放资源
		stmt.close();
		conn.close();
		
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
