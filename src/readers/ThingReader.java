package readers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import things.Atribute;


/**
 * Le .thing e retorna suas informacoes.
 * 
 * @author Gabriel
 *
 */
public class ThingReader {

	BufferedReader dotThing;
	String addres = "." + File.separator + "data" + File.separator + "things" + File.separator;

	public ThingReader(String pId) {
		try {
			
			this.dotThing = new BufferedReader(new FileReader(this.addres + pId + ".thing"));
			try {
				if((this.dotThing.readLine().equals("[THING@"+pId+"]"))==false){
						System.out.println("Arquivo nao [THING]!");
						this.dotThing=null;
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Atribute> defineIs() {
		String line;
		
		try {
			while ((line = this.dotThing.readLine()) != null ) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}


}
