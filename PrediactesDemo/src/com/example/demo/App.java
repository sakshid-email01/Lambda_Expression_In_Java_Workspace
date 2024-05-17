package com.example.demo;

import java.util.function.IntPredicate;

public class App {
	public static void main(String[] args) {

		IntPredicate lessThan18 = new IntPredicate() {
			@Override
			public boolean test(int value) {
				if (value < 18) {
					return true;
				} else {
					return false;
				}
			}

		};
		System.out.println(lessThan18.test(12));

		IntPredicate MoreThan10 = i -> i > 10;

		System.out.println(lessThan18.and(MoreThan10).test(45));
		
		System.out.println(lessThan18.or(MoreThan10).test(45));

	}

}
