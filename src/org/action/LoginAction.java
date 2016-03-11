package org.action;
import java.util.*;
import javax.persistence.Entity;
import org.vo.*;//++
import org.dao.*;
import org.dao.impl.*;//++
import com.opensymphony.xwork2.*;
@Entity
public class LoginAction extends ActionSupport{
	private Manager manager;
	private Client client;
	private String message;//?
	private String type;
	//�����û������ execute ����
	public String execute() throws Exception{
		//����Ϊ��Ŀ�����ݵĽӿڣ�DAO�ӿڣ������ڴ������������ݿ���һЩ����
		ManagerDao managerDao = new ManagerDaoImpl();//++
		ClientDao clientDao = new ClientDaoImpl();
		if(type.equals("manager")){ 
			if(managerDao.Validate_Login(manager)){												//�����¼�ɹ�
				Map session = ActionContext.getContext().getSession();	//��ûỰ���������浱ǰ��¼�û�����Ϣ
				session.put("ManagerID", manager.getManagerId());								//�ѻ�ȡ�Ķ��󱣴��� Session ��
				System.out.print("admin---");
				return "admin";
			}
		} else if (type.equals("student")) {
			if(clientDao.Validate_Login(client)){												//�����¼�ɹ�
				Map session = ActionContext.getContext().getSession();	//��ûỰ���������浱ǰ��¼�û�����Ϣ
				session.put("ClientID", client.getClientId());								//�ѻ�ȡ�Ķ��󱣴��� Session ��
				System.out.print("client---");
				return "client";
			}
			
		}
		return ERROR;
	}
	
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//���� message �� get/set ����
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
