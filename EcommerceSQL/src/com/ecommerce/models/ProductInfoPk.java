package com.ecommerce.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProductInfoPk
 *
 */
@Embeddable

public class ProductInfoPk implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private int idProduct;
	private int idShop;
	
	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getIdShop() {
		return idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	public ProductInfoPk() {
		super();
	}
   
}
