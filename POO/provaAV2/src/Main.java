import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        UsuarioController uc = new UsuarioController();

        while (true) {
            uc.exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

            switch (opcao) {
                case 1:
                    try {
                        System.out.print("Digite o email: ");
                        String email = scanner.nextLine();
                        System.out.print("Digite o usuário: ");
                        String usuario = scanner.nextLine();
                        System.out.print("Digite a senha: ");
                        String senha = scanner.nextLine();

                        Usuario novoUsuario = new Usuario(email, usuario, senha);
                        usuarios.add(novoUsuario);
                        System.out.println("Usuário cadastrado com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
                    }

                    break;
                case 2:
                    System.out.print("Digite o usuário: ");
                    String usuarioLogin = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senhaLogin = scanner.nextLine();

                    boolean loginSucesso = false;
                    for (Usuario usuario : usuarios) {
                        if (usuario.getUsername().equals(usuarioLogin) && usuario.getPassword().equals(senhaLogin)) {
                            loginSucesso = true;
                            break;
                        }
                    }

                    if (!loginSucesso) {
                        System.out.println("Login realizado com sucesso!");
                    } else {
                        throw new UsuarioIncorretoException("Usuário e/ou senha incorretos. Login falhou.");
                    }

                    break;
                case 3:
                    // Opção de visualização
                    for (Usuario usuario : usuarios) {
                        System.out.println(usuario.getUsername());
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }

            System.out.println(); // Linha em branco para melhorar a legibilidade
        }
    }
}