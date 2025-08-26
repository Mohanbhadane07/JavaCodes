class Mobile
{
 String brand; 
 int price;
  static String name;

  public void Show()

 {
     System.out.println(brand + ":" + price + ":" + name);
 }
}
public class strings 
{
 public static void main(String args[])
 {
 Mobile m1=new Mobile();
 m1.brand="Apple";
 m1.price=100000;
 Mobile.name = "Iphone";



 Mobile m2=new Mobile();
 m2.brand="Samsung";
 m2.price=80000;
 Mobile.name="Galaxy";


 Mobile m3=new Mobile();
 m3.brand="Oneplus";
 m3.price=60000;
 Mobile.name = "Nord";

 m1.name = "phone";
 
 m1.Show();
 m2.Show();
 m3.Show();
    
 


 }
}

