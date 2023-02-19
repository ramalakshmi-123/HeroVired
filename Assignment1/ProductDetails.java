import java.util.*;
class Product
{
  Scanner sc=new Scanner(System.in);
  final int max_prod=10;
  String prodID[]=new String[max_prod];
  String prodName[]=new String[max_prod];
  String prodDesc[]=new String[max_prod];
  int prodQty[]=new int[max_prod];
  float prodCost[]=new float[max_prod];
  int i=0;  //i is used to count the product
  public void addProduct(String pid,String pname,String pdesc,int pqty,float pcost)
  {
     if(i>=10)
         System.out.println("No more space to add the product");
     else
     {
     	prodID[i]=pid;
     	prodName[i]=pname;
     	prodDesc[i]=pdesc;
     	prodQty[i]=pqty;
     	prodCost[i]=pcost;
     	i++;
      }
 }
 public int viewProductsCount()
  {
      return i;
  }
 public void addProdQuantity(String pid,int qty)
  {
      for(int j=0;j<i;j++)
      {
          if(prodID[j].equalsIgnoreCase(pid))
           {
 		prodQty[j]+=qty;
                return;
           }
      }
      System.out.println("Invalid Product ID");
  }
 public void reduceProdQuantity(String pid,int qty)
  {
      for(int j=0;j<i;j++)
      {
          if(prodID[j].equalsIgnoreCase(pid))
           {
 		prodQty[j]-=qty;
                return;
           }
      }
      System.out.println("Invalid Product ID");
  }
 public void viewProductDetails(String pid)
  {
     for(int j=0;j<i;j++)
      {
          if(prodID[j].equalsIgnoreCase(pid))
           {
 		System.out.println(prodID[j]+" "+prodName[j]+" "+prodDesc[j]+" "+prodQty[j]+" "+prodCost[j]);
              return;
           }
      }
      System.out.println("Invalid Product ID");

  }
public void listAllProductDetails()
  {
     if(i==0)
      System.out.println("No products are added till now");
     else
       for(int j=0;j<i;j++)
       {
          
         System.out.println(prodID[j]+" "+prodName[j]+" "+prodDesc[j]+" "+prodQty[j]+" "+prodCost[j]);
              
      }
  }
}
public class ProductDetails
{
  public static void main(String args[])
  {
     Product p=new Product();
     Scanner sc=new Scanner(System.in);
     String pid,pname,pdesc;
     int pqty,ch;
     float pcost;
     while(true)
     {
       System.out.println("1.Add Product\n2.View Product\n3.List All Products\n4.Add Quantity\n5.Reduce Quantity\n6.Count Products\n7.Exit");
     ch=sc.nextInt();
     sc.nextLine();
     switch(ch)
     {
       case 1:
               pid=sc.nextLine();
               pname=sc.nextLine();
               pdesc=sc.nextLine();
	       pqty=sc.nextInt();
	       pcost=sc.nextFloat();
               sc.nextLine();
               p.addProduct(pid,pname,pdesc,pqty,pcost);
               break;
        case 2:
	       pid=sc.nextLine();
               p.viewProductDetails(pid);
               break;
        case 3:
               p.listAllProductDetails();
	       break;
        case 4:
               pid=sc.nextLine();
	       pqty=sc.nextInt();
	       sc.nextLine();
               p.addProdQuantity(pid,pqty);
               break;
        case 5:
               pid=sc.nextLine();
               pqty=sc.nextInt();
               sc.nextLine();
               p.reduceProdQuantity(pid,pqty);
               break;
        case 6:
               int count=p.viewProductsCount();
               System.out.println(count);
               break;
        case 7:
               System.exit(0);
       }
     }
  }
}


