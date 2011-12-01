package diodfr.codeStory;

/**
 * JE SUIS VRAIMENT PAS UN ARTISTE :(
 * @author broca
 *
 */
public class FooBarQix {

	/**
	 * Encode nb with the FooBarQix algorithm
	 * <a href="http://www.code-story.net/2011/11/16/foobarqix.html">FooBarQix algorithm description</a>
	 * @param nb
	 * @return
	 */
	public String encode(int nb) {
		StringBuilder result = new StringBuilder();

		// {{{{ TESTS DE MULTIPLICITE
		if (nb%3 == 0) {
			result.append("Foo");
		}

		if (nb%5 == 0) {
			result.append("Bar");
		}

		if (nb%7 == 0) {
			result.append("Qix");
		}
		// }}}}

		StringBuilder builder = new StringBuilder();

		builder.append(nb);

		// {{{{ Tests d'apparition des symboles
		for(int i = 0; i < builder.length(); i++) {
			switch(builder.charAt(i)) {
			case '3' :
				result.append("Foo");
				break;
			case '5' :
				result.append("Bar");
				break;
			case '7' :
				result.append("Qix");
				break;
			}
		}

		// si je n'ai pas de diviseur ou de symbole
		if (result.length() == 0) {
			result.append(nb); // je met le nombre
		}

		return result.toString();
	}

	private void encode1to100() {
		for (int i = 1; i < 100; i++) {
			String result = encode(i);

			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		FooBarQix fooBarQix = new FooBarQix();

		fooBarQix.encode1to100();
	}
}
