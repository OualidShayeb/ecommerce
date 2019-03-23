package com.ecommerce.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idProduct;
	private String description;
	private String designation;
	private String mark;
	private Category category;
	private List<Favourites> favourites;
	private List<ProductInfo> productInfos;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getIdProduct() {
		return idProduct;
	}

	
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@ManyToOne
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@OneToMany(mappedBy = "product")
	public List<Favourites> getFavourites() {
		return favourites;
	}

	public void setFavourites(List<Favourites> favourites) {
		this.favourites = favourites;
	}
	
	
	@OneToMany(mappedBy="product")
	public List<ProductInfo> getProductInfos() {
		return productInfos;
	}

	public void setProductInfos(List<ProductInfo> productInfos) {
		this.productInfos = productInfos;
	}

	public Product() {
		super();
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((favourites == null) ? 0 : favourites.hashCode());
		result = prime * result + idProduct;
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		result = prime * result + ((productInfos == null) ? 0 : productInfos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (favourites == null) {
			if (other.favourites != null)
				return false;
		} else if (!favourites.equals(other.favourites))
			return false;
		if (idProduct != other.idProduct)
			return false;
		if (mark == null) {
			if (other.mark != null)
				return false;
		} else if (!mark.equals(other.mark))
			return false;
		if (productInfos == null) {
			if (other.productInfos != null)
				return false;
		} else if (!productInfos.equals(other.productInfos))
			return false;
		return true;
	}


}
