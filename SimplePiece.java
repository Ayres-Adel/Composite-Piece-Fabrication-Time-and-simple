public class SimplePiece extends piece {
	public int time; 

    public SimplePiece(int time) {
        this.time = time;
    }

    @Override
    public int fab_time() {
        return time;
    }

}
