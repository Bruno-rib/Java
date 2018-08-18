package Intermediate;

class stringMethods1 {
	public static void main (String[] args) {
		
		String words[] = {"funk", "chunk", "furry", "baconatortatata"};
		
		//starts with
		for (String w : words) {
			if (w.startsWith("fu"))
				System.out.println(w + " starts with fu");
		}
		
		System.out.println();
		
		//ends with
		for (String w : words) {
			if (w.endsWith("unk"))
				System.out.println(w + " ends with uk");
		}
		
		System.out.println(words[3].indexOf('t', 7));
		System.out.println(words[3].indexOf('z'));
		System.out.println(words[3].indexOf("ona"));
		
		String a = "Bacon ";
		String b = "    monster";
		System.out.println(a.concat(b));
		
		System.out.println(a.replace('B', 'F'));
		System.out.println(b.toUpperCase());
		System.out.println(b.trim());
		
	}
}
