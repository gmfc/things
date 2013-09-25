package creators;

import java.util.ArrayList;

import readers.ThingReader;
import things.Atribute;
import things.Thing;

/**
 * Classe criadora de coisas
 * 
 * @author Gabriel
 * 
 */
public class ThingCreator {

	ThingReader reader;
	String id;
	double seed;
	
	public ThingCreator(String pId,double pSeed){
		this.id=pId;
		this.seed=pSeed;
		this.reader = new ThingReader(this.id);
	}

	/**
	 * Retorna os atributos de uma determinada coisa
	 * 
	 * @param is
	 *            atributos iniciais.
	 * @return todos os atributos.
	 */
	public ArrayList<Atribute> defineIs() {
		return reader.defineIs();
	}

	/**
	 * Retorna o que uma determinada coisa tem.
	 * 
	 * @param is
	 *            atributos iniciais
	 * @return o que a coisa tem
	 */
	public ArrayList<Thing> defineHas() {
		// TODO Pensar nisso aqui!
		return null;
	}

}
