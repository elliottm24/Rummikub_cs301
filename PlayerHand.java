public class PlayerHand {
    private char id;
    private int tileColor;
    private int tileNum;
    private int[][] tilesInHand = new int[tileColor][tileNum];


    public PlayerHand(char initId, int[][] initTilesInHand) {
        this.id = initId;
        this.tilesInHand = initTilesInHand;
    }

    public PlayerHand(PlayerHand orig) {
        this.id = orig.id;
        this.tilesInHand = orig.tilesInHand;
    }
}
