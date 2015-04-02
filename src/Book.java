
public class Book extends ReadingMaterials {

	public Book(){
		ReadingMaterials.author=null;
		ReadingMaterials.title=null;
		ReadingMaterials.publisher=null;
		ReadingMaterials.numberOfPg=0;
	}
	public Book(String author, String title, String publisher, int numPgs){
		ReadingMaterials.author=author;
		ReadingMaterials.title=title;
		ReadingMaterials.publisher=publisher;
		ReadingMaterials.numberOfPg=numPgs;	
	}
	@Override
	public String toString() {
		return "Book [numberOfPg=" + numberOfPg + ", author=" + author + ", publisher=" + publisher
				+ ", title=" + title + "]";
	}
	
	
	
	
	
}
