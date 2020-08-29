ppublic class Relacionais {
	
	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		String nome = "Maria";
		
		//booleano - true or false
		System.out.println("x = " + x);
		System.out.println("y = " +y);
		
		System.out.println("\nx == y -> " + (x == y)); //x igual y?
		System.out.println("x < y -> " + (x < y)); //x menor que y?
		System.out.println("x > y -> " + (x > y)); //x maior que y?
		System.out.println("x <= y -> " + (x <= y)); //x menor ou igual a y?
		System.out.println("x >= y -> " + (x >= y)); //x maior ou igual a y?
		System.out.println("x != y -> " + (x != y)); //x diferente de y?
		
		System.out.println("\nnome == 'Maria' -> " + (nome == "Maria")); //java difere letra maiuscula de minuscula
		System.out.println("nome == 'maria' -> " + (nome == "maria"));
		
		System.out.println("\nx != y && x < y -> " + (x != y && x < y));// x diferente de y E x menor de y
		System.out.println("x != y && x > y -> " + (x != y && x > y)); //x diferente de y E x maior de y
		System.out.println("x != y || x < y -> " + (x != y || x < y)); //x diferente de y OU x menor de y
		System.out.println("x != y || x < y -> " + (x != y || x > y)); //x diferente de y OU x maior de y
		
	}

}
