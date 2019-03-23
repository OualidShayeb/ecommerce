package com.ecommerce.services.category;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ecommerce.models.Category;
import com.ecommerce.models.Product;

/**
 * Session Bean implementation class CategoryService
 */
@Stateless
@LocalBean
public class CategoryServiceImpl implements ICategoryLocal {

	@PersistenceContext(unitName = "Ecommerce")
	private EntityManager entityManager;

	@Override
	public void addCategory(Category category) {
		entityManager.persist(category);

	}

	@Override
	public List<Category> listCategories() {
		Query query = entityManager.createQuery("SELECT c FROM Category c");
		return query.getResultList();

	}

	@Override
	public Category getCategory(int idCategory) {
		return entityManager.find(Category.class, idCategory);
	}

	@Override
	public void deleteCategory(Category category) {
		entityManager.remove(category);
	}

	@Override
	public void updateCategory(Category category) {
		entityManager.merge(category);
	}

	public CategoryServiceImpl() {
		// TODO Auto-generated constructor stub
	}

}
