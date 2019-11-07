package com.coding.question;

public class TestInterface implements i, x {

	@SuppressWarnings("finally")
	@Override
	public int add() {
		try {
			System.out.println("oh");
			return 10;
		} catch (Exception e) {
			System.err.println();
		} finally {
			System.out.println("what?");
			return 12;
		}
	}

	public static void main(String[] args) {
		i f = new TestInterface();
		System.out.println(f.add());

		x g = new TestInterface();
		System.out.println(g.add());
	}

}

interface i {
	int add();
}

interface x {
	int add();
}
