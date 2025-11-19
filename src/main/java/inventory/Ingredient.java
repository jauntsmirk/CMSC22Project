package inventory;

public class Ingredient {

	private String INGREDIENT_NAME;
	private double AMOUNT;
	
	public Ingredient(String INGREDIENT_NAME, double AMOUNT) {
		this.setINGREDIENT_NAME(INGREDIENT_NAME);
		this.AMOUNT = AMOUNT;
		// TODO Auto-generated constructor stub
	}

	public String getINGREDIENT_NAME() {
		return INGREDIENT_NAME;
	}

	public void setINGREDIENT_NAME(String iNGREDIENT_NAME) {
		this.INGREDIENT_NAME = iNGREDIENT_NAME;
	}

}
