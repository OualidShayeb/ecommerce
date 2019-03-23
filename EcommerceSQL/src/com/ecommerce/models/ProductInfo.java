package com.ecommerce.models;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProductInfo
 *
 */
@Entity

public class ProductInfo implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	
	
	private ProductInfoPk productInfoPk;
	private double price;
	private Byte[] image;
	private Shop shop;
	private Product product;
	
	@EmbeddedId
	public ProductInfoPk getProductInfoPk() {
		return productInfoPk;
	}



	public void setProductInfoPk(ProductInfoPk productInfoPk) {
		this.productInfoPk = productInfoPk;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Byte[] getImage() {
		return image;
	}



	public void setImage(Byte[] image) {
		this.image = image;
	}



	public ProductInfo() {
		super();
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(image);
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productInfoPk == null) ? 0 : productInfoPk.hashCode());
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
		ProductInfo other = (ProductInfo) obj;
		if (!Arrays.equals(image, other.image))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (productInfoPk == null) {
			if (other.productInfoPk != null)
				return false;
		} else if (!productInfoPk.equals(other.productInfoPk))
			return false;
		return true;
	}


	
	@ManyToOne
	@JoinColumn(name="idShop",referencedColumnName="idShop",insertable=false,updatable=false)
	public Shop getShop() {
		return shop;
	}



	public void setShop(Shop shop) {
		this.shop = shop;
	}


	@ManyToOne
	@JoinColumn(name="idProduct",referencedColumnName="idProduct",insertable=false,updatable=false)
	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	@Override
	public String toString() {
		return "ProductInfo [productInfoPk=" + productInfoPk + ", price=" + price + ", image=" + Arrays.toString(image)
				+ ", shop=" + shop + ", product=" + product + "]";
	}
	
	
   
}
