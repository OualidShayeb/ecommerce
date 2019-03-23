package com.ecommerce.services.product;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ecommerce.models.Product;

public class ProductServiceImpl implements IProductServiceLocal {

	@PersistenceContext(unitName = "Ecommerce")
	private EntityManager entityManager;

	@Override
	public Product getProduct(int idProduct) {
		Product product = entityManager.find(Product.class, idProduct);
		return product;
	}

	@Override
	public List<Product> listProducts() {
		Query query = entityManager.createQuery("SELECT p FROM Product p");
		return query.getResultList();
	}

	@Override
	public List<Product> productsByKeyWord(String kword) {
		Query query = entityManager.createQuery("SELECT p FROM product p WHERE p.description like :x or p.designation like :x or p.mark like :x");
		query.setParameter("x", "%" + kword + "%");

		return query.getResultList();
	}

	@Override
	public List<Product> productsByCategory(int idCategory) {
		Query query =entityManager.createQuery("SELECT p FROM Product p WHERE p.category.idCategory = :x ");
		query.setParameter("x", idCategory);
		return query.getResultList();
	}

}
