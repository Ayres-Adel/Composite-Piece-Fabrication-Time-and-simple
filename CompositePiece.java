public class CompositePiece extends piece {
	public piece tab[];
	int size;
	int nb_elem;
	public int assemblyTime;
	public CompositePiece(int size,int assemblyTime){
		this.assemblyTime = assemblyTime;
		tab = new piece[size];
		nb_elem=0;
	}
	
	public void add(piece p){
		if(nb_elem<tab.length){
			tab[nb_elem]=p;
			nb_elem++;
		}
		else{
			System.out.println("erreur");
		}
	}
    @Override
    public int fab_time() {
        int totalFabTime = assemblyTime; 


        for (int i=0;i<nb_elem;i++){
            totalFabTime = tab[i].fab_time();
        }

        return totalFabTime;
    }
}
	

	

	


