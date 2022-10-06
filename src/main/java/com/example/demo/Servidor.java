package com.example.demo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servidor extends UnicastRemoteObject implements VerificaInterface {

    public Servidor() throws RemoteException {
        super();
    }

    @Override
    public String parOuImpar(int a) throws RemoteException {
        if(a % 2 == 0) return "O número é Par";
        else return "O número é impar!";
    }

    @Override
    public String primoOuNaoPrimo(int a) throws RemoteException {
        for (int j = 2; j < a; j++) {
            if (a % j == 0) return "O número não é primo";
        }
        return "O número é primo!";
    }

    @Override
    public String divisivelPor(int a, int b) throws RemoteException {
        if(a % b == 0) return "O número é divisivel";
        else return "O número não é divisivel!";
    }
}
