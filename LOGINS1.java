package AprendendoTestes;

import java.util.Scanner;

public class LOGINS1 {
    public boolean Login(String user, String Password) {
        if (Password == null || Password.isEmpty()) {
            System.out.println("Senha não fornecida!");
            return false;
        }
        if (user.equals("ADMIN") && Password.equals("4567")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LOGINS1 service = new LOGINS1();

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        boolean resultado = service.Login(usuario, senha);

        if (resultado) {
            System.out.println("✅ Login realizado com sucesso!");
        } else {
            System.out.println("❌ Falha no login. Verifique usuário e senha.");
        }

        scanner.close();
    }
}
