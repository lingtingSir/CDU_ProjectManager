package org.action;
import java.util.*;

import javax.persistence.Entity;
import org.vo.*;//++
import org.dao.*;
import org.dao.impl.*;//++

import com.opensymphony.xwork2.*;
public class UserRegisterAction extends ActionSupport{
	private Client client;
	private String message;//?
	private String type;
	//�����û������ execute ����
		public String execute() throws Exception{
			
			
			
			//����Ϊ��Ŀ�����ݵĽӿڣ�DAO�ӿڣ������ڴ������������ݿ���һЩ����
			ClientDao clientDao = new ClientDaoImpl();//++
			if (!(clientDao.SelectClient(client))){
				if(clientDao.Add(client)){												//�����¼�ɹ�
					this.setMessage("��ӳɹ���");
					return SUCCESS;
				}
			} else {
				this.setMessage("�û��Ѵ��ڣ�");
				return ERROR;											//��֤ʧ�ܷ����ַ���ERROR
			}
			
			
			return ERROR;
		}
		public Client getClient() {
			return client;
		}
		public void setClient(Client client) {
			this.client = client;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
}
