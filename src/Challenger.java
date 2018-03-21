import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Challenger extends UnicastRemoteObject implements ClientInterface{

    protected Character characterWindow;
    protected int characterID;

    public Challenger(Character characterWindow) throws RemoteException{
        this.characterWindow = characterWindow;
        this.bind();
    }

    @Override
    public int getCharacterID() throws RemoteException {
        return this.characterID;
    }

    @Override
    public void endGame() throws RemoteException {

    }

    public void bind() {
        try{
            Naming.rebind("challenger", this);
        } catch (Exception e) {
            System.out.println("Binding challenger error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
