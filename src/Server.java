import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.ThreadLocalRandom;

public class Server extends UnicastRemoteObject implements ServerInterface {
    protected Player player1;
    protected Player player2;

    private Server() throws RemoteException {
        this.player1 = null;
        this.player2 = null;
    }


    public boolean startGame(String playerName, boolean newGame) {
        System.out.println("GAME STARTED!!!!!!!!!!!!!!!");
        boolean isChallenger = false;

        if (player1 == null || newGame == true) {
            this.player1 = new Player(playerName, Player.challengerID);

            isChallenger = true;

        } else {
            this.player2 = new Player(playerName, Player.challengedID);
        }

        return isChallenger;
    }

    @Override
    public int randomCharacterID() {
        //int randomID = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        //return randomID;
        return 1;
    }

    @Override
    public void bindChallenger(Challenger challenger){

    }


    public static void main(String[] args) {
        try{
            Server obj = new Server();
            Naming.rebind("adivinaquien", obj);
        } catch (Exception e){
            System.out.println("Server error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
