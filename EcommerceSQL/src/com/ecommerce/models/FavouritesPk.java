package com.ecommerce.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FavouritesPk
 *
 */
@Embeddable

public class FavouritesPk implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	private int idUser;
	private int idProduct;
	
	
	
	public int getIdUser() {
		return idUser;
	}



	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}



	public int getIdProduct() {
		return idProduct;
	}



	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}



	public FavouritesPk() {
		super();
	}
   
}
