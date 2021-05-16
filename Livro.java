import java.util.ArrayList;
import java.util.Scanner;

public class Livro implements Controlador {
	public String nome;
	public String autor;
	public String editora;
	public String ano;
	public String cadEscolha;

	Scanner entrada = new Scanner(System.in);
	ArrayList<Livro> meusLivros = new ArrayList<Livro>();

	public Livro(String nome, String autor, String editora, String ano) {
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.ano = ano;
	}

	public String toString() {
		return "Livro: " + this.getNome() + "\nAutor: " + this.getAutor() + "\nEditora: " + this.getEditora()
				+ "\nAno: " + this.getAno();
	}

	public void cadastrarLivro() {
		do {
			System.out.println("");
			System.out.print("Digite o nome do livro: ");
			this.setNome(entrada.next());
			System.out.print("Digite o autor do livro: ");
			this.setAutor(entrada.next());
			System.out.print("Digite a editora do livro: ");
			this.setEditora(entrada.next());
			System.out.print("Digite o ano do livro: ");
			this.setAno(entrada.next());

			meusLivros.add(new Livro(this.getNome(), this.getAutor(), this.getEditora(), this.getAno()));
			System.out.println("Livro cadastrado com SUCESSO!!!");
			System.out.println("");
			System.out.println("Deseja cadastrar mais um livro??");
			System.out.println("[S] SIM || [N] NÃO");
			System.out.print("==> ");
			this.setCadEscolha(entrada.next());
		} while (this.getCadEscolha().equalsIgnoreCase("S"));

	}

	public void mostrarLivro() {
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Editora: " + this.getEditora());
		System.out.println("Ano: " + this.getAno());
		System.out.println("");
	}

	public void pesquisarLivro() {
		System.out.println("");
		System.out.print("Digite o nome do livro: ");
		String busca = entrada.next();
		boolean achou = false;

		for (int i = 0; i < meusLivros.size(); i++) {
			if (meusLivros.get(i).getNome().contains(busca)) {
				meusLivros.get(i).mostrarLivro();
				System.out.println("");
				achou = true;
			} else if (!achou) {
				System.out.println("Livro não encontrado!");
				System.out.println("");
			}
		}
	}

	public void excluirLivro() {
		System.out.println("");
		System.out.print("Digite o nome do livro: ");
		String busca1 = entrada.next();
		for (Livro p : meusLivros) {
			if (p.getNome().contains(busca1)) {
				meusLivros.remove(p);
				break;
			}
		}
		System.out.println("Livro removido com sucesso!");
	}

	public void listarLivro() {
		for (int i = 0; i < meusLivros.size(); i++) {
			System.out.println("");
			System.out.println("---------------------------------------------");
			System.out.println("-> " + meusLivros.get(i));
		}
		if (meusLivros.size() == 0) {
			System.out.println("Ainda não há anuncios cadastrados.");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCadEscolha() {
		return cadEscolha;
	}

	public void setCadEscolha(String cadEscolha) {
		this.cadEscolha = cadEscolha;
	}

}
