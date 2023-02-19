class InventoryCompany
{
  private int prodid;
  private String prodname;
  private float prodcost;
  public InventoryCompany(int prodid,String prodname,float prodcost)
  {
     this.prodid=prodid;
     this.prodname=prodname;
     this.prodcost=prodcost;
  }
  public int getproductid()
  {
     return prodid;
  }
  public String getproductname()
   {
     return prodname;
   }
  public float getproductcost()
   {
     return prodcost;
    }
  public void setproductcost(float prodcost)
   {
      this.prodcost=prodcost;
   }
 }

class Prod
{
   final int no_cust=15;
   InventoryCompany prod[]=new InventoryCompany[no_cust];
   int i=0;
   public void addproduct(InventoryCompany a)
    {
       prod[i]=a;
       i++;
    }     
   public void Count()
   {
	   System.out.println(i);
   }
   public void viewallproducts()
   {
       System.out.println("productid \t productname \t productcost");
       for(int j=0;j<i;j++)
       {
          System.out.println(prod[j].getproductid()+"\t\t"+prod[j].getproductname()+"\t\t"+prod[j].getproductcost());

       }
   }
    public void ViewProduct(int prodid)
    {
       for(int j=0;j<i;j++)
        {
           if(prod[j].getproductid()==prodid)
                {
                    System.out.println(prod[j].getproductid()+"\t\t"+prod[j].getproductname()+"\t\t"+prod[j].getproductcost());
                     return;
                 }
        }
        System.out.println("There is no such product with that id");
    }
    public void Update(int prodid,float cost)
    {
       for(int j=0;j<i;j++)
        {
           if(prod[j].getproductid()==prodid)
                {
                 prod[j].setproductcost(prod[j].getproductcost()+cost);
                     return;
                 }
        }
        System.out.println("Invalid Account Number");
    }
}
class InventorySystem
{
  public static void main(String args[])
   {
        Prod c=new Prod();
        InventoryCompany a;
        int prodid,ch;
        String prodname;
        float cost;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
           System.out.println("1.ADD PRODUCT\n2.PRODUCTS LIST\n3.PRODUCT COUNT\n4.VIEW PRODUCT DETAILS\n5.UPDATE COST\n6.EXIT");
           ch=sc.nextInt();
           switch(ch)
           {
             case 1:
                     prodid=sc.nextInt();
                     sc.nextLine();
                     prodname=sc.nextLine();
                     cost=sc.nextFloat();
                     a=new InventoryCompany(prodid,prodname,cost);
                     c.addproduct(a);
                     break;
             case 2:
                     c.viewallproducts();
                      break;
             case 3:
            	 c.Count();
            	 break;
            case 4:
                     prodid=sc.nextInt();
                     c.ViewProduct(prodid);
                     break;
            case 5:
            	prodid=sc.nextInt();
                cost=sc.nextFloat();
            	c.Update(prodid,cost);
            	break;
            case 6:
                     System.exit(0);
           }
         }

   }
}