package aula1;

public class SGEApplication {
	
	public static void main(String[] args) {
		
	DadosPessoais aluno1= new DadosPessoais("Cássia", "425.275.698-01", 22, 1.57, false, "cassia.lima@email.com", "(11)97373-7373", "15/06/1999");
	
	System.out.println(aluno1);
	System.out.println(aluno1.getEmail());
	
}

}
