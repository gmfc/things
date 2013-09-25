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

	ThingReader reader = new ThingReader();

	/**
	 * Retorna os atributos de uma determinada coisa
	 * 
	 * @param is
	 *            atributos iniciais.
	 * @return todos os atributos.
	 */
	public ArrayList<Atribute> defineIs(ArrayList<Atribute> is) {
		return reader.defineIs(is.get(0));
	}

	/**
	 * Retorna o que uma determinada coisa tem.
	 * 
	 * @param is
	 *            atributos iniciais
	 * @return o que a coisa tem
	 */
	public ArrayList<Thing> defineHas(ArrayList<Atribute> is) {
		// TODO Pensar nisso aqui!
		return null;
	}

}
