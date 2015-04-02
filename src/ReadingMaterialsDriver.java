
public class ReadingMaterialsDriver {
	public static void main (String[]args){
	
		ReadingMaterials harryPotter= new Book("Harry", "Potter", "English", 700);
		System.out.println(harryPotter.toString());
	
		ReadingMaterials adventureskelly = new Novel(1, "Adventures of Kelly Volume II");
		System.out.println(adventureskelly.toString());
		
		ReadingMaterials drToday = new Journal(4,2014,"Medicine","UVA");
		System.out.println(drToday.toString());
		
		ReadingMaterials autoToday= new Magazine(4,2014,"March");
		System.out.println(autoToday.toString());
		
	
	}

}
