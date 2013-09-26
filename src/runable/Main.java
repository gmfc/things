package runable;

import java.util.ArrayList;

import things.*;


//import gui.GUI;

public class Main {

	static Thing currentThing;
	
	public static void main(String[] args) {
		
		currentThing = new Thing("testting",425);
		currentThing.define();
		
		analize(currentThing);
	
	}
	
	public static void analize(Thing thing){
		System.out.println("========================================================");
		System.out.println("==============   ANALIZANDO              ===============");
		System.out.println("........................................................");
		
		System.out.println("Id da coisa: "+thing.getId());
		System.out.println("seed da coisa: "+thing.getSeed());
		
		System.out.println("........................................................");
		System.out.println("==============   ATRIBUTOS               ===============");
		
		ArrayList<Atribute> atr = thing.getIs();
		for(Atribute atrr:atr){
			System.out.println(atrr.getName()+": "+atrr.getValue());
		}
		
		System.out.println("........................................................");
		System.out.println("==============   O QUE TEM:              ===============");
		
		System.out.println("Numero de coisas: "+thing.getHas().size());
		
	}

}
