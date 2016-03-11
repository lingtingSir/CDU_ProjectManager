package org.dao.impl;

import org.dao.ClientDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.util.HibernateSessionFactory;
import org.util.MD5;
import org.vo.*;

public class ClientDaoImpl implements ClientDao{
	
	
	public boolean Add(Client en){
		Session session=null;
		Transaction tx=null;
		int flag = 0;
		try{
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			session.save(en);
		
			tx.commit();
			flag = 1;
		}catch(Exception e){
			if(tx!=null)tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return flag > 0;
	}
	
	public boolean Validate_Login(Client en){
		
		Session session=null;
		Transaction tx=null;
		int flag = 0;
//		Manager manager=null;
		try{
			
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery(" from Client  where ClientID=? and  ClientPwd=?");
			query.setParameter(0, en.getClientId());
			query.setParameter(1,MD5.getDigest(en.getClientPwd()));
//			query.setMaxResults(1);
			flag = query.list().size();
//			flag = (Integer)query.uniqueResult();
			tx.commit();
		}catch(Exception e){
			if(tx!=null)tx.rollback();
			e.printStackTrace();
		}
		return flag > 0;
	}
	
	public boolean SelectClient(Client en)
	{
		Session session=null;
		Transaction tx=null;
		int flag = 0;
//		Manager manager=null;
		try{
			
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery(" from Client  where ClientID=? ");
			query.setParameter(0, en.getClientId());
//			query.setMaxResults(1);
			flag = query.list().size();
//			flag = (Integer)query.uniqueResult();
			tx.commit();
		}catch(Exception e){
			if(tx!=null)tx.rollback();
			e.printStackTrace();
		}
		return flag > 0;
	}
	
	public boolean Update_Pwd(Client en){
		Session session=null;
		Transaction tx=null;
		int flag = 0;
		try{
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			session.update(en);
			flag = 1;
			tx.commit();
		}catch(Exception e){
			if(tx!=null)tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return flag > 0;
	}
}
