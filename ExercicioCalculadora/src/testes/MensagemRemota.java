/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.lang.Thread;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.lang.Thread;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class MensagemRemota extends java.rmi.server.UnicastRemoteObject implements MensagemInterface {
    
    private String mensagem = "";
    private int contador = 0;
    
    public MensagemRemota(String mensagem) throws RemoteException{
        super();
        this.mensagem = mensagem;
    }
    
    public String falar() throws RemoteException{
        return this.mensagem;
    }
    
    public String falar(String mensagem) throws RemoteException{
        System.out.println("Algém enviou pra o servidor: " + mensagem);
        
        return "Você disse para o servidor: " + mensagem;
    }
    
    public String soma(String n1, String n2){
        double a = Double.parseDouble(n1);
        double b = Double.parseDouble(n2);
        double res = a + b;
        return Double.toString(res);
    }
    
    public String sub(String n1, String n2){
        double a = Double.parseDouble(n1);
        double b = Double.parseDouble(n2);
        double res = a - b;
        return Double.toString(res);
    }
    
    public String div(String n1, String n2){
        double a = Double.parseDouble(n1);
        double b = Double.parseDouble(n2);
        double res = a / b;
        return Double.toString(res);
    }
    
    public String mult(String n1, String n2){
        double a = Double.parseDouble(n1);
        double b = Double.parseDouble(n2);
        double res = a * b;
        return Double.toString(res);
    }
}
