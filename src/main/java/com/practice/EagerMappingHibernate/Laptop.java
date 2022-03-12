package com.practice.EagerMappingHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
@Id
private int lid;
private String brand;
private int price;
@ManyToOne
private Alien alein;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Alien getAlein() {
	return alein;
}
public void setAlein(Alien alein) {
	this.alein = alein;
}
@Override
public String toString() {
	return "Laptop [lid=" + lid + ", brand=" + brand + ", price=" + price + ", alein=" + alein + "]";
}


}
