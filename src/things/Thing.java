package things;

import java.util.ArrayList;

import creators.ThingCreator;

/**
 * Classe responsavel pelas coisas. literalmente.
 * 
 * @author Gabriel
 *
 */
public class Thing {
	
	//seed da coisa
	double seed = 0;
	//o que ela e (seus atributos)
	ArrayList<Atribute> is = new ArrayList<Atribute>();
	//o que ela tem
	ArrayList<Thing> has = new ArrayList<Thing>();
	//criador de coisas
	ThingCreator creator = new ThingCreator();

	//=========================
	//CONSTRUTORES
	//=========================
	
	/**
	 * Construtor padrao
	 */
	public Thing() {
		this.is = null;
		this.has = null;
	}


	/**
	 * Construtor com id e seed definido
	 * 
	 * @param id
	 * @param pSeed
	 */
	public Thing(String id, int pSeed) {
		this.is.add(0, new Atribute("ID",id));
		this.seed = pSeed;
	}
	
	//=========================
	//metodos
	//=========================

	/**
	 * Defide o objeto, detalhandoo mais
	 * 
	 */
	public void define() {
		this.is = this.creator.defineIs(this.is);
		this.has = this.creator.defineHas(this.is);
	}
	
	
	//==========================
	//getters
	//==========================
	
	/**
	 * Retorna o que o objeto e (seus atributos)
	 * @return
	 */
	public ArrayList<Atribute> getIs(){
		return this.is;
	}
	
	public ArrayList<Thing> getHas(){
		return this.has;
	}

}
