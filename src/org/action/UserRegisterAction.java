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
	//处理用户请求的 execute 方法
		public String execute() throws Exception{
			
			
			
			//该类为项目与数据的接口（DAO接口），用于处理数据与数据库表的一些操作
			ClientDao clientDao = new ClientDaoImpl();//++
			if (!(clientDao.SelectClient(client))){
				if(clientDao.Add(client)){												//如果登录成功
					this.setMessage("添加成功！");
					return SUCCESS;
				}
			} else {
				this.setMessage("用户已存在！");
				return ERROR;											//验证失败返回字符串ERROR
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
