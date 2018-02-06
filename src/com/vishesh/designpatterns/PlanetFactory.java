package com.vishesh.designpatterns;

public class PlanetFactory {
	public Planet getComposition(String planetType) {
		if (planetType.equalsIgnoreCase("Mercury")) {
			return new Mercury();

		} else if (planetType.equalsIgnoreCase("Earth")) {
			return new Earth();

		} else if (planetType.equalsIgnoreCase("Neptune")) {
			return new Neptune();
		}
		return null;
	}
}
