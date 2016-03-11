package org.test;

import java.util.List;
import java.util.Map;

import org.dao.ClientDao;
import org.dao.ManagerDao;
import org.dao.impl.ClientDaoImpl;
import org.dao.impl.ManagerDaoImpl;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.vo.Client;
import org.vo.Manager;
import org.vo.Powers;
import org.util.HibernateSessionFactory;
import org.util.MD5;

import com.opensymphony.xwork2.ActionContext;
public class HibernateTest {

	public Session session;
	public static void main(String[] args) {
		
//		//该类为项目与数据的接口（DAO接口），用于处理数据与数据库表的一些操作
//		ManagerDao managerDao = new ManagerDaoImpl();//++
//		Manager manager = new Manager();
//		manager.setManagerId("123");
//		manager.setManagerPwd("123");
//		MD5.getDigest("123");
//		System.out.print(managerDao.Validate_Login(manager));
		//该类为项目与数据的接口（DAO接口），用于处理数据与数据库表的一些操作
		Client client = new Client();
		client.setClientId("123456789");
		client.setClientName("zhuce");
		client.setClientImage("client");
		client.setClientDes("client");
		client.setClientPwd("123456");
		client.setX("123");
		client.setY("123");
		client.setZ("123");
		ClientDao clientDao = new ClientDaoImpl();//++
		if (!(clientDao.SelectClient(client))){
			if(clientDao.Add(client)){												//如果登录成功
				System.out.print("添加成功");
			}
		} else {
			System.out.print("添加失败");									//验证失败返回字符串ERROR
		}
		
	}
	
	
	
}
