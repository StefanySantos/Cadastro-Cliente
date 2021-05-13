package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {
	public static void main(String[] args) {
	     
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
        
        System.out.println("Digite os dados: "+"\nNome ");
        
        String nome = teclado.nextLine();
        
        System.out.println("Login desejado ");
        
        String login = teclado.nextLine();
        
        System.out.println("Cargo ");
        
        String cargo = teclado.nextLine();
        
        System.out.println("Senha de acesso");
        
        int senha = teclado.nextInt();
        
        
        Informacoes usuario;
        
        usuario = new Informacoes();
        
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setCargo(cargo);
        
        
        ArrayList<Informacoes> usuarios = new ArrayList<Informacoes>();
        
        usuarios.add(usuario);
        
//        System.out.println(usuario.getNome()+"\n"+usuario.getLogin()+"\n"+usuario.getCargo());
        
        teclado.close();
     }
}

