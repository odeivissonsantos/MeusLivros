import java.util.Scanner;

public class AppMeusLivros {

	public static void main(String[] args) {
		int opcao = 0;
		Scanner entrada = new Scanner(System.in);
		Livro livro = new Livro(null, null, null, null);

		do {
			System.out.println("");
			System.out.println("======= [ Seja Bem Vindo ] =======");
			System.out.println("");
			System.out.println("O que deseja fazer? ");
			System.out.println("[1] CADASTRAR LIVRO");
			System.out.println("[2] PESQUISAR LIVRO");
			System.out.println("[3] LISTAR LIVROS");
			System.out.println("[4] EXCLUIR LIVRO");
			System.out.println("[5] SAIR");
			System.out.print("==> ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				livro.cadastrarLivro();
				break;
			case 2:
				livro.pesquisarLivro();
				break;
			case 3:
				livro.listarLivro();
				break;
			case 4:
				livro.excluirLivro();
				break;
			case 5:
				System.out.println("");
				System.out.println("SAINDO...");
				break;
			default:
				System.out.println("");
				System.out.println("OPÇÃ INVÁLIDA, TENTE NOVAMENTE!!!");
				break;
			}
		} while (opcao != 5);
	}

}
