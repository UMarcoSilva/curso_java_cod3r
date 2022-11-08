package classe;

public class Equal {
	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Marco Silva";
		u1.email = "marco.silva@gmail.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Marco Silva";
		u2.email = "marco.silva@gmail.com.br";

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));

		//System.out.println(u2.equals(new Date()));
		
	}
}
