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
		
//		//����Ϊ��Ŀ�����ݵĽӿڣ�DAO�ӿڣ������ڴ������������ݿ���һЩ����
//		ManagerDao managerDao = new ManagerDaoImpl();//++
//		Manager manager = new Manager();
//		manager.setManagerId("123");
//		manager.setManagerPwd("123");
//		MD5.getDigest("123");
//		System.out.print(managerDao.Validate_Login(manager));
		//����Ϊ��Ŀ�����ݵĽӿڣ�DAO�ӿڣ������ڴ������������ݿ���һЩ����
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
			if(clientDao.Add(client)){												//�����¼�ɹ�
				System.out.print("��ӳɹ�");
			}
		} else {
			System.out.print("���ʧ��");									//��֤ʧ�ܷ����ַ���ERROR
		}
		
	}
	
	
	
}
