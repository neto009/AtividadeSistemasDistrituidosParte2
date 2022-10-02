package com.example.demo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface VerificaInterface extends Remote {
    public String parOuImpar (int a) throws RemoteException;
    public String primoOuNaoPrimo (int a) throws RemoteException;
    public String divisivelPor (int a, int b) throws RemoteException;
}