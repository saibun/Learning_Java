package String;

public class StringBuilderDelete {
	public static void main(String[]args) {
		StringBuilder sb = new StringBuilder("Hello Sir");
		sb.delete(6, 9);
		System.out.println(sb);
	}

}
