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
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//@Table(name="produc")
//@Entity
//public class Product {
//  
//  
//    private Integer id;
//    @Column(name="productName")
//    private String productName;
//
//    private Set<Category> categories=new HashSet<>();
//
//    
//    
//    
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", productName='" + productName + '\'' +
//                '}';
//    }
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
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//	
//    @JoinTable(name = "Category_Product",
//            joinColumns = {@JoinColumn(name = "product_id",referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name="category_id",referencedColumnName = "id")}
//    )
//    @ManyToMany
//    public Set<Category> getCategories() {
//		return categories;
//	}
//	public void setCategories(Set<Category> categories) {
//		this.categories = categories;
//	}
//
//    
//}
