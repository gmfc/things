package things;

public class Atribute {

	String name = "";
	String value = "";
	
	public Atribute(String pName, String pValue){
		this.name = pName;
		this.value = pValue;
	}
	
	public Atribute(String pName, double pValue) {
		this.name = pName;
		this.value = pValue+"";
	}
	
	public Atribute(String pName, int pValue) {
		this.name = pName;
		this.value = pValue+"";
	}
	
	public Atribute(String pName, char pValue) {
		this.name = pName;
		this.value = pValue+"";
	}
	
	//============================================

	public void setName(String pName){
		this.name = pName;
	}
	
	public void setValue(String pValue){
		this.value = pValue;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getValue(){
		return this.value;
	}
}
