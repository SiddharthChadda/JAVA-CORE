package com.example;

public class PolyMorphismTest {

	public static void main(String[] args) {
		NewMarker nm=new NewMarker();
		nm.pointerSize(5);//
		nm.pointerSize();
		
		Marker m=new NewMarker();
		    m.pointerSize();
		    m.pointerSize(677);
		    m.lukfeel();
		    m.writingQuality();
		   System.out.println(m.price);
		   
		   Object obj=new NewMarker();
		   
		   NewMarker nm2=(NewMarker) obj;
		     
		   
		   
		    
		

	}

}
