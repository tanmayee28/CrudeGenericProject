package bookpkg;

class BookMain {

	public static void main(String[] args) {
		
		LAddress l1=new LAddress("WCE1","100Ft Road","Sangli");
		LAddress l2=new LAddress("WCE2","Chandani Chowk","Delhi");
		LAddress l3=new LAddress("WCE3","Bandra","Mumbai");
		LAddress l4=new LAddress("WCE4","Tilak Road","Pune");
		LAddress l5=new LAddress("WCE5","GandhiNagar","Solapur");
		
		Book b1=new Book(1,"Java",l1);
		Book b2=new Book(2,"Champak",l2);
		Book b3=new Book(3,"Agnipankh",l3);
		Book b4=new Book(4,"CPP",l4);
		Book b5=new Book(5,"C",l5);		
		
		BookInterface bi=new BookImp();
		bi.addBook(b2);
		bi.addBook(b3);
		bi.addBook(b4);
		bi.addBook(b5);
		bi.addBook(b1);
		
		System.out.println(bi.getAllList());
		
		System.out.println(bi.deleteBook(1));
		System.out.println("After Deleting Book:");
		System.out.println(bi.deleteBook(4));
		System.out.println(bi.getAllList());
		
		System.out.println("Get Book :"+bi.getBook(1));
		
		b1.getLibadd().setLnm("Central Liabrary");
		bi.updateBook(b1);
		
	   System.out.println("After upadating List:");
	   System.out.println(bi.getAllList());
	}

}
