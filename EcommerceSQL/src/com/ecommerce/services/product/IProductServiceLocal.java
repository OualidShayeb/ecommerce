package com.ecommerce.services.product;

import java.util.List;

import com.ecommerce.models.Product;
public interface IProductServiceLocal {
	public Product getProduct(int idProduct);
	public List<Product> listProducts();
	public List<Product> productsByKeyWord(String kword);
	public List<Product> productsByCategory(int idCategory);
	

}
