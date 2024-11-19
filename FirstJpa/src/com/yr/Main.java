//package com.yr;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.persistence.Embeddable;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.FlushModeType;
//import javax.persistence.Persistence;
//
//import com.yr.aa.User;
//
//public class Main {
//	public static void main(String[] args) {
//		//
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-1");
//		//
//		
//		
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		
//		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
//		
//		
//		
//		//新建，瞬间，临时
////		User user = new User();
////		user.setName("唐");
////		user.setAddr("湘");
////		user.setAge(20);
////		user.setBirth(new Date());
////		
////		
////		//游离，脱管
//////		
////		entityManager.persist(user);//保存
////		
////		//持久化状态，托管
////		System.out.println(user);
//		
//		//User user = entityManager.find(User.class, 2);
//		
//		//entityManager.remove(user);
//		
//		
//		//auto  查询，提交，flush
//		User user = entityManager.find(User.class, 5);
//		System.out.println(user.toString());
//		
//		entityManager.refresh(user);
//		System.out.println(user.toString());
//		
////		User user = new User();
////		user.setName("唐6");
////		user.setAddr("湘6");
////		user.setAge(26);
////		user.setBirth(new Date());
////		user.setId(6);
//		 
//		
//		//entityManager.persist(user);
//		
//		//user -  user1(保存是USER1)
//		//User user1 = entityManager.merge(user);
//		//System.out.println(user);
//		//System.out.println(user1);
//		
//		
//		
//		//
//		
//		//get不支持延迟加载，如果没查询数据返回NULL
//		//User user = entityManager.find(User.class, 2);
//		
//		
//		//支持延迟加载,   如果你使用到了数据，我再去数据库查询
//		//这里没有查询到，就会出现异常
//		
//		//User user = entityManager.getReference(User.class, 3);
//		//System.out.println(user);
//		
//		 
//		
//		
//		
//		System.out.println("-------------------1111");
//		transaction.commit();
//		System.out.println("-------------------1111");
//		
//		entityManager.close();
//		entityManagerFactory.close();
//		
//	}
//}
