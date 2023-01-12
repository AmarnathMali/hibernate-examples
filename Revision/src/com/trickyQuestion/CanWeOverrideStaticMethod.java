package com.trickyQuestion;

public class CanWeOverrideStaticMethod {

	public static void main(String[] args) {
		Screen sc = new ColorScreen();
		sc.show();
	}

}
class Screen{
	public void show(){
		System.out.println("The static method from parent class");
	}
}
class ColorScreen extends Screen{
	public void show(){
		System.out.println("the static method from child class");
	}
}