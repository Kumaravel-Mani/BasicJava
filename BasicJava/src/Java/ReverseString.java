package Java;

public class ReverseString {
	public static void reverseOfWord(){
		String s = "welcome";
		String reverse = " ";
		for (int i = s.length()-1; i >=0;i--){
		reverse = reverse + s.charAt(i);
		}
		System.out.println("Reverse of Word ="+reverse);
		}
		public static void reverseOfEachWordInString() {
		String s = "Welcome to java";
		String[] split = s.split(" ");
		String reverseString = "";
		for (String x:split){
		String reverseWord= "";
		for (int i = x.length()-1;i>=0;i--){
		reverseWord = reverseWord+x.charAt(i);
		}reverseString= reverseString+ reverseWord + " ";
		}
		System.out.println("original string = "+s);
		System.out.println("reverse string = "+reverseString);
		}
		public static void main(String[] arags){
		reverseOfWord();
		reverseOfEachWordInString();
		}
}
