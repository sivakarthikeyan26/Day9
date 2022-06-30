package address_book;

public class Book {
	String first_name;
	String last_name;
	String Address;
	String city;
	int zip;
	long phone_number;
	String email;
	public Book (String fname, String lname, String addr, String cit, int zcode, long pNUM, String em) {
		this.first_name=fname;
		this.last_name=lname;
		this.Address=addr;
		this.city=cit;
		this.zip=zcode;
		this.phone_number=pNUM;
		this.email=em;
	}
	public void DisplayAllInfo() {
		System.out.println("First name = "+first_name+"\nLast name= "+last_name+"\nAddress = "+Address+"\nCity = "+city+"\nZip code = "+zip+"\nPhone numbe = "+phone_number+"\nEmail = "+email );
		
	}
	public void edit_fname(String s1) {
		this.first_name=s1;
		System.out.println("updated first name");
	}
	public void edit_lname(String s1) {
		this.last_name=s1;
		System.out.println("updated last name");
	}
	public void edit_pNUM(long s1) {
		this.phone_number=s1;
		System.out.println("updated phone number");
	}
	public void delete_record(String s2) {
		for (int j = 0; j < AddressBook.contact.size(); j++) {
			Book bk = (Book) AddressBook.contact.get(j);
			if (s2.equals(bk.first_name)) {
				AddressBook.contact.remove(j);
				System.out.println("Record removed successfully");
				break;
			}
		}
	}

}
