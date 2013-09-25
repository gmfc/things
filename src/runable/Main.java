package runable;

import java.util.ArrayList;

import things.*;


//import gui.GUI;

public class Main {

	
	public static void main(String[] args) {
		Thing thing =  new Thing("testting",42);
		thing.define();
		ArrayList<Atribute> analizador = thing.getIs();
		
		System.out.println("ID: "+thing.getId());
		System.out.println("Seed: "+thing.getSeed());
		System.out.println("========================================================");
		System.out.println("========================================================");
		if(analizador==null){
			System.out.println("NULL!");
		}else{
			for(Atribute atr:analizador){
				System.out.println("Atributo: "+atr.getName());
				System.out.println("Valor: "+atr.getValue());
				System.out.println("========================================================");
			}
		}
		
	}

}
