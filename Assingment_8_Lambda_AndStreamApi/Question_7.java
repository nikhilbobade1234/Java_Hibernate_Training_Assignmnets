package Assignment_Stream_And_Lambda;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Iteam {
	int itemid;
	String iname;
	LocalDateTime date_of_manufacturing, date_of_expiry;
	float price;
	
	public Iteam(int itemid, String iname, LocalDateTime date_of_manufacturing, LocalDateTime date_of_expiry,
			float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
		this.price = price;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public LocalDateTime getDate_of_manufacturing() {
		return date_of_manufacturing;
	}
	public void setDate_of_manufacturing(LocalDateTime date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}
	public LocalDateTime getDate_of_expiry() {
		return date_of_expiry;
	}
	public void setDate_of_expiry(LocalDateTime date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Iteam [itemid=" + itemid + ", iname=" + iname + ", date_of_manufacturing=" + date_of_manufacturing
				+ ", date_of_expiry=" + date_of_expiry + ", price=" + price + "]";
	}
	public static void main(String[] args) {
	List<Iteam>slist=new ArrayList<>();
	
	slist.add(new Iteam(1, "Pen", LocalDateTime.of(1996,2 , 13, 12, 04),LocalDateTime.of(2002, 4, 10, 9, 34),24.05f));
	slist.add(new Iteam(2, "Pencil", LocalDateTime.of(1998,2 , 16, 12, 04),null,51.05f));
	slist.add(new Iteam(4, "Shirt", LocalDateTime.of(1999,2 , 13, 12, 04),null,34.05f));
	slist.add(new Iteam(3, "Laptop", LocalDateTime.of(2001,4 , 3, 2, 44),LocalDateTime.of(2014, 5, 16, 2, 44),84.05f));
	System.out.println("===============1) Average of all Price ===============");
	Double Avg=slist.stream().collect(Collectors.averagingDouble(w->w.price));
	System.out.println("Average price of All Product = "+Avg);
	System.out.println("================2) having highest price.================");
	Iteam e3 = slist.stream().max((e1, e2) -> e1.price > e2.price ? 1 : -1).get();
	System.out.println(e3);
	System.out.println("==============3) having lowest price.=================");
	Iteam e6=slist.stream().min((e4,e5)->e4.price>e5.price?1:-1).get();
	System.out.println(e6);
System.out.println("================print the item with maximum price and not having any expiry date===========");
Iteam i3 =slist.stream().filter(r->r.date_of_expiry==null).max((e4,e5)->e4.price>e5.price?1:-1).get();
System.out.println(i3);
	}
	
}
