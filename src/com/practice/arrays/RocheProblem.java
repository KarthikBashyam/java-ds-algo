package com.practice.arrays;

public class RocheProblem {

	public static void main(String[] args) {

		final String normal = "MetLysGlyHisGlnGlnCys";
		final String mutated = "MetLysGlyHisGlaGlnGlnCys";
		// final String mutated ="MetLysGlyHisGlnGlnCyszza";

		// final String pname = "p.His4_Gln5insGla"; // Find P name

		int aminoAcidSize = 3;
		String prev = null;
		String mutatedAmino = null;
		StringBuilder pName = new StringBuilder("p.");
		int aminoCount = 0;

		for (int i = 0; i < mutated.length() && i < normal.length(); i = (i + aminoAcidSize)) {

			mutatedAmino = mutated.substring(i, i + aminoAcidSize);
			String normalAmino = normal.substring(i, i + aminoAcidSize);

			System.out.println(mutatedAmino);

			if (!normalAmino.equals(mutatedAmino)) {
				pName.append(prev).append(aminoCount).append("_").append(normalAmino).append(aminoCount + 1)
						.append("ins").append(mutatedAmino);
				break;
			}

			prev = mutatedAmino;
			++aminoCount;
		}
		System.out.println(pName);

	}

}
