package things;

import java.util.ArrayList;

import creators.ThingCreator;

public class Thing {

	ArrayList<Atribute> is = new ArrayList<Atribute>();
	ArrayList<Thing> has = new ArrayList<Thing>();

	ThingCreator creator = new ThingCreator();

	public Thing() {
		this.is = null;
		this.has = null;
	}

	public Thing(ArrayList<Atribute> pIs) {
		this.is = pIs;
	}

	public Thing(String id, int seed) {
		is.add(0, new Atribute("ID",id));
		is.add(1, new Atribute("Seed",seed));
	}
	
	//=========================

	public void define() {
		this.is = this.creator.defineIs(this.is);
		this.has = this.creator.defineHas(this.is);
	}
	
	
	//==========================
	
	public ArrayList<Atribute> getIs(){
		return this.is;
	}
	
	public ArrayList<Thing> getHas(){
		return this.has;
	}

}
