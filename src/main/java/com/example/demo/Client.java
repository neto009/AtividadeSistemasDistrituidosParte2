package com.example.demo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        VerificaInterface verificaInterface;
        try {
            Scanner in = new Scanner(System.in);
            verificaInterface = (VerificaInterface) Naming.lookup("rmi://localhost:2335/area");

            System.out.println("Informe um numero para saber se ele e par ou impar, primo ou não primo e divisivel!");
            Integer primeiro = in.nextInt();

            System.out.println("Informe o número divisor!");
            Integer divisor = in.nextInt();

            System.out.println(verificaInterface.parOuImpar(primeiro));

            System.out.println(verificaInterface.primoOuNaoPrimo(primeiro));

            System.out.println(verificaInterface.divisivelPor(primeiro, divisor));

        }
        catch(MalformedURLException e) {
            System.out.println( "nao eh um URL RMI valida");
        }
        catch(RemoteException re) {
            System.err.println("Objeto Remoto tratou a execucao " + re);
        }
        catch(NotBoundException e) {
            System.out.println( "Nao foi possivel achar o objeto remoto no servidor");
        }
    }
}
