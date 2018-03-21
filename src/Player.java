public class Player {
    public static int challengerID = 1;
    public static int challengedID = 2;

    protected int role;
    protected String playerName;

    public Player(String playerName, int role){
        this.playerName = playerName;
        this.role = role;
    }
}
