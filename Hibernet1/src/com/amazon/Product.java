package com.amazon;

public class Product {

		private int id;
		private String pname;
		private double price;
		
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Pojo [id=" + id + ", pname=" + pname + ", price=" + price + "]";
		}
		
		
	

}
