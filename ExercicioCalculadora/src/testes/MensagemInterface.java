package testes;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface MensagemInterface extends Remote {
    
    public String falar() throws RemoteException;
    public String falar(String mensagem) throws RemoteException;
    public String soma(String a, String b) throws RemoteException;
    public String sub(String a, String b) throws RemoteException;
    public String div(String a, String b) throws RemoteException;
    public String mult(String a, String b) throws RemoteException;
}
