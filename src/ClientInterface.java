import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientInterface extends Remote{
    //int getPlayerID() throws RemoteException;
    int getCharacterID() throws RemoteException;
    void endGame() throws RemoteException;
}
