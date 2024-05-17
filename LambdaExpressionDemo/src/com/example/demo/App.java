package com.example.demo;

//We can make use of lambda expression for functional type interfaces only.  
//An interface with only a single abstract method is called a functional interface.

interface Lamda {
	abstract public void demo(int a1, float a2);

}

public class App {
	public static void main(String[] args) {
		Lamda lamda = (int a1, float a2) -> {
			System.out.println("The value of a1 is :" + a1 + " and the value of a2 is: " + a2);
			System.out.println("Statement from demo method");

		};

		lamda.demo(201, 503.12f);

	}

}
