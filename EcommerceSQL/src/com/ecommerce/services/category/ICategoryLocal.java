package com.ecommerce.services.category;

import java.util.List;

import javax.ejb.Local;

import com.ecommerce.models.Category;

@Local
public interface ICategoryLocal {

	public void addCategory(Category category);
	public List<Category> listCategories();
	public Category getCategory(int idCategory);
	public void deleteCategory(Category category);
	public void updateCategory(Category category);
	
	
}
