public class Book extends TangigleAsset{
	private String isbn;

	public Book(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}

	public String getIsbn(){ retrn this.isbn; }
}


