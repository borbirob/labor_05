package registry2;

public class Drummer {
	private String name; 
	private String neptun;
	protected int yob; // Year Of Birth
	private String art;
	
	private Drummer(String na, String ne, int yob,String art) {
		this.name=na;
		this.neptun=ne;
		this.yob=yob;
		this.art="Zene";
	}
		public String getName() { return name; }
		public String getNeptun() { return neptun; }
		public int getYob() { return yob; }
		
		public String toString() 
		{
			return name + " (" + neptun + ") " + yob + " ," + art;
		}

		private double weight; // testsúly, privát
		public double getWeight() { return weight; }
		
		protected void setWeight(double w) 
		{ // setter
			weight = w;
		}
		
		public String getArt()
		{
			return art;
		}	
		
		public String greetings() 
		{
		    return "Szeva!";
		}
		
		public void meet(Person p) 
		{
			System.out.println(greetings() + " " + p.getName());
		}
}
