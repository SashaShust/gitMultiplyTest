package com.epam.commandlinename.main;

public class Main {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("You should enter your name when you launch your programm, please try again");
		} else {
			for (int i = 0; i < args.length; i++) {
				if (i == 0) {
					System.out.print("Hello " + args[0]);
				} else {
					System.out.print(" " + args[i]);
				}
			}
		}
	}
}
