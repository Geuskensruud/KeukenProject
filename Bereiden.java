package Keuken;

import java.util.*;

public class Bereiden {

	public static void main(String[] args) {

	}
}

abstract class Ingredient{
	boolean geprepareerd = false;
	abstract void prepareren();
	
}

class Gerecht{
	ArrayList<Ingredient> ingredienten = new ArrayList<Ingredient>();
	boolean isGeprepareerd() {
		return false;
	}
}
