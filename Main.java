
public class Main {

	public static void main(String[] args) {

        SimplePiece simplePiece1 = new SimplePiece(5);
        SimplePiece simplePiece2 = new SimplePiece(3);


        CompositePiece compositePiece = new CompositePiece(2,2);
        compositePiece.add(simplePiece1);
        compositePiece.add(simplePiece2);


        int totalFabTime = compositePiece.fab_time();
        System.out.println("Total fabrication time for the composite piece: " + totalFabTime);

	}

}
