package com.coding.question;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PizzaDecorator {
	public static void main(String[] args) {
		Pizza pizza = new PaneerPizza(new NonVeg(new PaneerPizza(new NonVeg(new BasicPizza()))));
		pizza.cost();
		Map<Serializable, String> a = new HashMap<Serializable, String>();
		a.put(1, "fdg");
		a.put(1.2, "g");
		a.put("kjfsdk", "sdf");

		a.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});

		System.out.println(get());
		
		try {
			System.out.println("outer try");
			try {
				System.out.println("inner 1 try");
				int d=10/0;
				try {
					System.out.println("inner try");
					int k=10/0;
				}finally {
					System.out.println("finally inner");
					int e=10/0;
				}
			}catch(Exception e) {
				System.out.println("innner 1 catch");
				int f=10/0;
			}finally {
				System.out.println("inner 1 finally");
				int g=10/0;
			}
		}catch(Exception e) {
			System.out.println("outer catch");
		}finally {
			System.out.println("outer finally");
		}
	}

	private static int get() {
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}
