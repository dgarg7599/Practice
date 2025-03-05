import java.util.Scanner;
public class UseTrimMethod {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		name = name.trim();
		System.out.println(name);
	}
}
