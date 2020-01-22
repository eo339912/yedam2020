public class Forexample {
	public static void main(String[] args) {
		char chr1 = 64;
		for(int i=0; i<26; i++) {
			chr1 = (char)(chr1+1);
			System.out.println(chr1);
		}
		
		for(int i=0; i<26; i++) {
			char chr2 = (char)(65+i);
			System.out.println(chr2);
		}
		
		char chr3 = 65;
		for(int i = 0; i < 26; i++) {
			System.out.println(chr3++);
		}

	}
		
}
