package com.techno.javabasic;

public class AccessSpecifierDemo {
	public static void main(String[] args) {
		AccessSpecifierDemo accessdpecifierdemo = new AccessSpecifierDemo();
		accessdpecifierdemo.publicAccess();
		accessdpecifierdemo.privateAccess();
		accessdpecifierdemo.defaultAccess();
		accessdpecifierdemo.protectedAccess();
		
	}

	public void publicAccess() {
		System.out.println("Public method()");
	}

	private void privateAccess() {
		System.out.println("Private method()");
	}

	void defaultAccess() {
		System.out.println("default mehtod()");
	}

	protected void protectedAccess() {
		System.out.println("protected method()");
	}
}
