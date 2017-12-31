

public class MarkerTest {
          
	public static void main(String[] args) {
		
		Marker m=new Marker();
		m.pointerSize();
		m.pointerSize(0.5f);
		
	     Marker nm=new NewMarker();
		 nm.pointerSize();
		System.out.println(nm.price);
		nm.lukfeel();
		///nm.addGrip();
		
		    NewMarker    mm= (NewMarker) nm;
		    mm.addGrip();
		
    /*NewMarker n = new NewMarker(23, "luxor", "blue", 67);
		n.addGrip();
		n.lukfeel();
		n.pointerSize();
		n.writingQuality();
		n.markerDetails();*/
	}

}
