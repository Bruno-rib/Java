package over30;

public enum tuna44 {
	bucky("nice", "22"),
	kelsey("cutie", "10"),
	julia("bigmistake", "12"),
	nicole("italian", "13"),
	candy("different", "14"),
	erin("Iwish", "16");
	
	private final String desc;
	private final String year;
	
	tuna44 (String description, String birthday) {
		desc = description;
		year = birthday;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
	
}
