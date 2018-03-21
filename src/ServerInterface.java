import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote{
    boolean startGame(String playerName, boolean newGame) throws RemoteException;
    int randomCharacterID() throws RemoteException;
    void bindChallenger(Challenger challenger) throws RemoteException;
}
