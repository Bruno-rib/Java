package GUI;

class writingToFiles80 {
	
	public static void main (String[] args) {
		
		cratefile80 g = new cratefile80 ();
		g.openFile();
		for (int i = 0; i < 5; i++) {
			g.addRecords();
		}
		g.closeFile();
		
		readfile81 r = new readfile81();
		r.openFile();
		r.readFile();
		r.closeFile();
		
	}
}
