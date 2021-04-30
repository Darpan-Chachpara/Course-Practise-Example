package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_2_7_BookInfo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String bname;
		int price;
		System.out.println("Enter No. of books.");
		int n=sc.nextInt();
		String bookname[] = new String[n] ;
		int bookprice[] = new int[n];
		
		
		Book bn = new Book();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Book name");
	
			bn.setBook_Title(sc.next());
			System.out.println("Enter Book price");
			bn.setBook_Price(sc.nextInt());
			bn.creatBook(i,bn.getBook_Title(),bn.getBook_Price(),bookname,bookprice);
		}
		
		bn.showBook(bookname,bookprice);
	}

}

class Book {
	
	private String Book_Title;
	private int Book_Price;
	int i=0;
	public void setBook_Title(String book_Title) {
		Book_Title = book_Title;
	}
	public String getBook_Title() {
		return Book_Title;
	}

	

	public void setBook_Price(int book_Price) {
		Book_Price = book_Price;
	}
	public int getBook_Price() {
		return Book_Price;
	}

	public void creatBook(int i,String a, int b, String c[],int d[])
	{		
		c[i] = a;
		d[i] = b;		
	}
	
	public void showBook(String a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Name : "+a[i]+"  Price "+b[i]);
		}
	
		
	}}
