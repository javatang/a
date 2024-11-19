//package com.yr.shuang.many2many;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
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
//@Table(name="CATEGORIES")
//@Entity
//public class Category {
//
//	private Integer id;
//	private String categoryName;
//	
//	private Set<Item> items = new HashSet<>();
//
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Id
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	@Column(name="CATEGORY_NAME")
//	public String getCategoryName() {
//		return categoryName;
//	}
//
//	public void setCategoryName(String categoryName) {
//		this.categoryName = categoryName;
//	}
//
//	//放弃自己维护关联的权力
//	@ManyToMany(mappedBy = "categories",cascade = CascadeType.REMOVE )
//	public Set<Item> getItems() {
//		return items;
//	}
//
//	public void setItems(Set<Item> items) {
//		this.items = items;
//	}
//}
