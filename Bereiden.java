package Keuken;

import java.util.*;

public class Bereiden {

	public static void main(String[] args) {
		System.out.println("test");
	}
}

abstract class Ingredient{
	boolean geprepareerd = false;
	abstract void prepareren();
	
}
class Ui extends Ingredient{

	@Override
	void prepareren() {
		System.out.println("Ui gesneden.");
	}
	
}
class Saus extends Ingredient{

	@Override
	void prepareren() {
		System.out.println("Saus geroerd.");
	}
	
}
class Vlees extends Ingredient{

	@Override
	void prepareren() {
		System.out.println("Vlees gebakken.");
	}
	
}
class Gerecht{
	ArrayList<Ingredient> ingredienten = new ArrayList<Ingredient>();
	boolean isGeprepareerd() {
		for(Ingredient a:ingredienten) {
			if(!a.geprepareerd) {
				return false;
			}
		}
		return true;
	}
}
