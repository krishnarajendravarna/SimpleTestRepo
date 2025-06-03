package helloworld;

class Check_vowel{
	String s;
	Check_vowel(String str){
		s = str;
	}
	boolean isVowel() {
		if(s == "a" || s == "e" || s == "i" ||  s == "o" || s == "u") {
			return true;
		}else if(s.length() > 1) {
			return false;
		}else {
			return false;
		}
	}
}

public class Vowel {
	public static void main(String[] args) {
		Check_vowel obj = new Check_vowel("xyz");
		boolean x = obj.isVowel();
		System.out.println("Vowel:"+x);
	}
}
