package com.ecommerce.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Favourites
 *
 */
@Entity

public class Favourites implements Serializable {

	private static final long serialVersionUID = 1L;

	private FavouritesPk favouritesPk;
	private Product product;
	private User user;
	
	
	
	
	
	@EmbeddedId
	public FavouritesPk getFavouritesPk() {
		return favouritesPk;
	}






	public void setFavouritesPk(FavouritesPk favouritesPk) {
		this.favouritesPk = favouritesPk;
	}





	@ManyToOne
	@JoinColumn(name="idProduct", referencedColumnName="idProduct",insertable=false,updatable=false)
	public Product getProduct() {
		return product;
	}






	public void setProduct(Product product) {
		this.product = product;
	}





	@ManyToOne
	@JoinColumn(name="idUser",referencedColumnName="idUser",insertable=false,updatable=false)
	public User getUser() {
		return user;
	}






	public void setUser(User user) {
		this.user = user;
	}






	public Favourites() {
		super();
	}

}
