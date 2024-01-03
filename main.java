import java.util.*;
class A
     {
          Scanner s = new Scanner(System.in);
            public int choice;
            public int t;
 public void df()
{ 
  int i; 
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("Choose destination:");
  System.out.println("\t1. Delhi(DEL)");
  System.out.println("\t2. Kolkatta(CCU)");
  System.out.println("\t3. Chennai(MAA)");
  System.out.println("\t4. Goa(GOI)");
  System.out.println("Select=");
  choice = s.nextInt();
  switch(choice)
  {
  case 1:
  i = 10637;
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("1. Delhi(DEL)");
  System.out.println("Mumbai------>>Delhi");
  System.out.println("The price for ticket is= Rs."+i);
  details();
  break;
  case 2:
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  i = 14109;
  System.out.println("2. Kolkatta(CCU)");
  System.out.println("Mumbai------>>Kolkatta");
  System.out.println("\nThe price for ticket is= Rs."+i);
  details();
  break;
  case 3:
  i = 10561;
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("3. Chennai(MAA)");
  System.out.println("Mumbai------>>Chennai");
  System.out.println("\nThe price for ticket is= Rs."+i);
  details();
  break;
  case 4:
  i = 7163;
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("4. Goa(GOI)");
  System.out.println("Mumbai------>>Goa");
  System.out.println("\nThe price for ticket is= Rs."+i);
  details();
  break;
  }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
 public void no()
{
    
  int i; 
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("Choose destination:");
  System.out.println("\t1. London, United Kingdom(LON)");
  System.out.println("\t2. New York, United States(NYC)");
  System.out.println("\t3. Dubai, United Arab Emirates(DXB)");
  System.out.println("\t4. Seoul, South Korea(SEL)");
  System.out.println("Select=");
  choice = s.nextInt();
  switch(choice)
  {
  case 1:
  i = 10637;
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("1. London, United Kingdom(LON)");
  System.out.println("Mumbai------>>London");
  System.out.println("\nDue to COVID-19, flights from Mumbai------>>London are not available :( ");
  break;
case 2:
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");      
  System.out.println("2. New York, United States(NYC)");
  System.out.println("Mumbai------>>New York ");
  System.out.println("\nDue to COVID-19, flights from Mumbai------>>New York are not available :( ");
  break;
  case 3:
  i = 120118;
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("3. Dubai(MAA)");
  System.out.println("Mumbai------>>Dubai");
  System.out.println("\nThe price for ticket is= Rs."+i);
  break;
case 4:
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");     
   System.out.println("2. Seoul(CCU)");
  System.out.println("Mumbai------>>Seoul");
  System.out.println("\nDue to COVID-19, flights from Mumbai------>>Seoul are not available :(");
  break;
  }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void dfr()
{ 
  int i;
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("Choose destination:");
  System.out.println("\t1. Delhi(DEL)");
  System.out.println("\t2. Kolkatta(CCU)");
  System.out.println("\t3. Chennai(MAA)");
  System.out.println("\t4. Goa(GOI)");
  System.out.println("Select=");
  choice = s.nextInt();
  switch(choice)
  {
  case 1:
  i = 5312;
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("1. Delhi(DEL)");
  System.out.println("Mumbai------>>Delhi------>>Mumbai");
  System.out.println("The price for ticket is= Rs."+i);
  details();
  break;
  case 2:
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  i = 6782;
  System.out.println("2. Kolkatta(CCU)");
  System.out.println("Mumbai------>>Kolkatta------>>Mumbai");
  System.out.println("\nThe price for ticket is= Rs."+i);
  details();
  break;
  case 3:
  i = 5311;
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("3. Chennai(MAA)");
  System.out.println("Mumbai------>>Chennai------>>Mumbai");
  System.out.println("\nThe price for ticket is= Rs."+i);
  details();
  break;
  case 4:
  i = 3842;
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("4. Goa(GOI)");
  System.out.println("Mumbai------>>Goa------>>Mumbai");
  System.out.println("\nThe price for ticket is= Rs."+i);
  details();
  break;
  }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void nor()
{
    
  int i; 
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("Choose destination:");
  System.out.println("\t1. London, United Kingdom(LON)");
  System.out.println("\t2. New York, United States(NYC)");
  System.out.println("\t3. Dubai, United Arab Emirates(DXB)");
  System.out.println("\t4. Seoul, South Korea(SEL)");
  System.out.println("Select=");
  choice = s.nextInt();
  switch(choice)
  {
  case 1:
  i = 10637;
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("1. London, United Kingdom(LON)");
  System.out.println("Mumbai------>>London------>>Mumbai");
  System.out.println("\nDue to COVID-19, flights from Mumbai------>>London------>>Mumbai are not available :( ");
  break;
case 2:
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");      
  System.out.println("2. New York, United States(NYC)");
  System.out.println("Mumbai------>>New York------>>Mumbai ");
  System.out.println("\nDue to COVID-19, flights from Mumbai------>>New York------>>Mumbai are not available :( ");
  break;
  case 3:
  i = 156220;
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println("3. Dubai(MAA)");
  System.out.println("Mumbai------>>Dubai------>>Mumbai");
  System.out.println("\nThe price for ticket is= Rs."+i);
  details();
  break;
case 4:
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");     
   System.out.println("2. Seoul(CCU)");
  System.out.println("Mumbai------>>Seoul------>>Mumbai");
  System.out.println("\nDue to COVID-19, flights from Mumbai------>>Seoul------>>Mumbai are not available :(");
  break;
  }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void details()
{
  System.out.println("\nEnter Name : ");
  s.nextLine();
  String name = s.nextLine();
  System.out.println("\n====TICKET BOOKED!====");
  System.out.println("\nPlease enjoy your flight");
  System.out.println("\nHave a happy journey:)");
} 
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public class Project
  {           
    public static void main(String [] args) 
      {
        A componentsA = new A();
        Scanner s = new Scanner(System.in);
        System.out.println("~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_WELCOME TO DREAM BOOKINGS_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~_~");
        System.out.println("Default departing point: Mumbai(BOM)");
        System.out.println("Please select your choice:");
        System.out.println("\t1. Domestic Flight");
        System.out.println("\t2. International Flight"); 
        System.out.println("Select= ");
        componentsA.choice = s.nextInt(); 
        System.out.println("Please select your ticket type:");
        System.out.println("\t1. Oneway");
        System.out.println("\t2. Round trip");
        componentsA.t = s.nextInt();
        switch(componentsA.t)
        {
            case 1:
            {
     switch(componentsA.choice)
        {
          case 1: 
          componentsA.df();
          break;
          case 2:
          componentsA.no();
          break;
          default:
          break;
          } }break;
         case 2:
        {
        switch(componentsA.choice)
        {
          case 1: 
          componentsA.dfr();
          break;
          case 2:
          componentsA.nor();
          break;
          default:
          break;
          } }break;
         } }
       }
       
      

