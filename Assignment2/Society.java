import java.io.*;
public class Society {
    public static void main(String[] args) {
         ResidentialSociety rs = new ResidentialSociety();
         rs.societyName = "Galaxy-Apartment";
         rs.location = " Banjara Hills, Hyderabad";
         rs.SecretoryName ="Krishna Prasad Jakkula";

         Building A = new Building();
         Building B = new Building();
         Building C = new Building();
         A.BuildingName = "A";
         A.totalNumberOfApartments =10;
         B.BuildingName ="B";
         B.totalNumberOfApartments = 10;
         C.BuildingName="C";
         C.totalNumberOfApartments =10;
         String line ="";
         Apartment[] apartments = new Apartment [30];
         int i=0;
         try   
         {  
           BufferedReader br = new BufferedReader(new FileReader("Society.csv"));  
               while ((line = br.readLine()) != null)   
               {  
                  apartments[i] = new Apartment(line);   
                   i++;
            }  
         }   
         catch (IOException e)   
         {  
             e.printStackTrace();  
         }  
         for (Apartment apartment : apartments) {
            System.out.println(apartment.ApartmentID+" \t\t "+apartment.BuildingName+" \t\t "+apartment.OwnerName+" \t\t "+apartment.ElectricMeterNumber);
         }
    }
}

class ResidentialSociety{
    String societyName;
     String location;
     String SecretoryName;
}
class Building extends ResidentialSociety{
    String BuildingName;
    int totalNumberOfApartments;
}
class Apartment extends Building{
     int ApartmentID;
     String OwnerName;
     String ElectricMeterNumber;
     Apartment(String str){
        String[] line = str.split(",");
        this.ApartmentID = Integer.parseInt(line[0]);
        this.BuildingName = line[1];
        this.OwnerName = line[2];
        this.ElectricMeterNumber=line[3];
     }
}