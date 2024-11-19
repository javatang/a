//package com.yr.aa;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//public class JPATest {
//
//	private EntityManagerFactory entityManagerFactory;
//	private EntityManager entityManager;
//	private EntityTransaction transaction;
//	
//	
//	public static void main(String[] args) {
//		
//	}
//	@Before
//	public void init(){
//		entityManagerFactory = Persistence.createEntityManagerFactory("jpa-1");
//		entityManager = entityManagerFactory.createEntityManager();
//		transaction = entityManager.getTransaction();
//		transaction.begin();
//	}
//	
//	@After
//	public void destroy(){
//		transaction.commit();
//		entityManager.close();
//		entityManagerFactory.close();
//	}
//	
//	
//
//
//	@Test
//	public void insert()
//	{
//		
//		int pageSize = 3;
//		int pageNo = 4;
//		String sql ="from User";
//		Query query =entityManager.createQuery(sql);
//		query.setFirstResult( (pageNo -1) * pageSize );//开始下标
//		query.setMaxResults(pageSize);//返回几行
//		
//		
//		List<User> list = query.getResultList();
//		for (User user : list) {
//			System.out.println(user.getId());
//		}
//		
//		
//		
//		
//	}
//	
//
//}
