class Main {

	public static void main(String[] args) {
		
    Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Srilanka");
		countries.saveCountryNames("Australia");
		countries.saveCountryNames("Japan");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		
	}

}
