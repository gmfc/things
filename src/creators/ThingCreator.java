package creators;

import java.util.ArrayList;

import readers.ThingReader;
import things.Atribute;
import things.Thing;

public class ThingCreator {
	
	ThingReader reader =  new ThingReader();

	public ArrayList<Atribute> defineIs(ArrayList<Atribute> is) {
		return reader.defineIs(is.get(0));
	}

	public ArrayList<Thing> defineHas(ArrayList<Atribute> is) {
		//TODO Pensar nisso aqui!
		return null;
	}
	
}
