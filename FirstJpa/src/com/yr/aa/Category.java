//package com.yr.aa;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//@Table(name="category")
//@Entity
//public class Category {
//    
//  
//    private Integer id;
//    @Column(name="categoryName")
//    private String categoryName;
//   
//    private Set<Product> products=new HashSet<>();
//    
//    
//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    @Override
//    public String toString() {
//        return "Category{" +
//                "id=" + id +
//                ", categoryName='" + categoryName + '\'' +
//                ", products=" + products +
//                '}';
//    }
//
//
//    @ManyToMany(mappedBy = "categories")
//	public Set<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(Set<Product> products) {
//		this.products = products;
//	}
//}