import java.util.ArrayList;

public class VideoJuego3 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Soldado>> arr = new ArrayList<ArrayList<Soldado>>();
		arr.add(new ArrayList<Soldado>());
		arr.get(0).add(1,null);
		arr.get(0).add(2,null);
		arr.get(0).add(3,null);
		for( int i=0; i<arr.size(); i++) {
			for( int j=0; j<arr.size(); j++) {
				System.out.print(arr.get(i).get(j)+"\t");
			}
		}
	}
}

