package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.tiger();
		System.out.println();
		
		Safari sa = new Safari();
		sa.tiger();
		sa.giraffe();
	}
}
