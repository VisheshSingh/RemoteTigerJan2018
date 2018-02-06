package com.vishesh.designpatterns;

public class FactoryPatternPlanet {

	public static void main(String[] args) {
		PlanetFactory planet = new PlanetFactory();

		Planet p1 = planet.getComposition("mercury");
		p1.composition();

		Planet p2 = planet.getComposition("earth");
		p2.composition();

		Planet p3 = planet.getComposition("neptune");
		p3.composition();
	}

}
