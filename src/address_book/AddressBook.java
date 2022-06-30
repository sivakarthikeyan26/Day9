package address_book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	public static final ArrayList contact = new ArrayList();
	public static void main(String[] args) {
		;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Adding contacts\n2.Display contacts\n3.Edit contacts");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter first name, last name, Address, city, Zip code, Phone number, Email");
				String fn = sc.next();
				String ln = sc.next();
				String ad = sc.next();
				String ci = sc.next();
				int zip = sc.nextInt();
				long pn = sc.nextLong();
				String em = sc.next();
				Book bk = new Book(fn, ln, ad, ci, zip, pn, em);
				contact.add(bk);
				System.out.println(contact);
				break;
			case 2:
				System.out.println("Enter the First name of the person to display all info");
				String s = sc.next();
				for (int i = 0; i < contact.size(); i++) {
					bk = (Book) contact.get(i);
					if (s.equals(bk.first_name)) {
						bk.DisplayAllInfo();
						break;
					} else if(i==contact.size()-1) {
						System.out.println("No record found");
					}
				}
				break;
			case 3:
				System.out.println("enter the first name of the person to edit his details");
				String s1 = sc.next();
				for (int i = 0; i < contact.size(); i++) {
					bk = (Book) contact.get(i);
					if (s1.equals(bk.first_name)) {
						System.out.println("1.To edit fname\n2. TO edit last name\n3.To edit phone number\n4.Delete record");
						int n = sc.nextInt();
						if (n == 1) {
							System.out.println("enter the first name to update");
							String s2 = sc.next();
							bk.edit_fname(s2);
							break;
						} else if (n == 2) {
							System.out.println("enter the last name to update");
							String s2 = sc.next();
							bk.edit_lname(s2);
							break;
						} else if (n == 3) {
							System.out.println("enter the phone number to update");
							long num = sc.nextLong();
							bk.edit_pNUM(num);
							break;
						} else if (n == 4) {
							System.out.println("enter the first nameto delete record");
							String s2 = sc.next();
							bk.delete_record(s2);
							break;
						}
					} else {
						System.out.println("No record found");
					}
				}
				break;
			}
		}
	}

}
