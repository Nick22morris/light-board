public class LightBoard {
	private boolean[][] lights;
	
	public LightBoard(int numRows, int numCols) {
		lights = new boolean[numRows][numCols];
		populate();
		print();
	}
	public void populate() {
		for(int i = 0; i < lights.length; i++) {
			for(int j = 0; j < lights[i].length; j++) {
				double rando = Math.random();
				if(rando < 0.4) {
					lights[i][j] = true;
				}
				else {
					lights[i][j] = false;
				}
			}
		}
	}
	public boolean evaluateLight( int row, int col) {
		if(lights[row][col] == true) {
			int count = 0;
			for (int i = 0; i < lights.length; i ++) {
				if(lights[i][col] == true) {
					count++;
				}
			}
			if(count%2 == 0) {
				return false;
			}
			return true;
		}
		else {
			int count = 0;
			for (int i = 0; i < lights.length; i ++) {
				if(lights[i][col] == true) {
					count++;
				}
			}
			if(count%3 == 0) {
				return true;
			}
			return false;
		}
	}
	public void print() {
		for(int i = 0; i < lights.length; i++) {
			for(int j = 0; j < lights[i].length; j++) {
				System.out.print(lights[i][j]+ "  ");
			}
			System.out.print("\n");
		}
	}
}
