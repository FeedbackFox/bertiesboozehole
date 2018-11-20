import java.util.Scanner;

public class BertieBoozeHole {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Bertie's Boozehole. Please enter your age below.");
    boolean ofAge = allowedToDrink(sc);
    int boozeAmount = 1;
    int userInputBuy = 1;
    double boozeCost = 0d;
    String boozeTypeAmount = "";
    String finalBoozeTypeOne = "0";
    String finalBoozeTypeTwo = "0";
    String finalBoozeTypeThree = "0";
    String userInputContinue = "";
    if(ofAge)
    {
      shopMainPage(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
    }
  }

  // The code below starts the actual shopping off.

  public static void shopMainPage(String boozeTypeAmount, int boozeAmount, double boozeCost, int userInputBuy,  String userInputContinue, Scanner sc, String finalBoozeTypeOne, String finalBoozeTypeTwo, String finalBoozeTypeThree) {
    System.out.println("\n\nWhat kind of booze would you like to buy?\n1. Bavarian lager, 6 bottles:\n8.50\n\n2. Bud Light, Sixpack:\n5.30\n\n3. House Brand Vodka, 1 liter:\n4.40\n\nPlease enter the number of the type of booze you'd like to buy.");
    userInputBuy = sc.nextInt();

    //Sets boozetypeamount to the correct value using the method continueShopping.

    boozeTypeAmount = continueShopping(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
    if(boozeTypeAmount == null)
    {
      shopMainPage(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
    }

    //Secondary page if the user wants to continue.

    finalBoozeTypeOne = boozeTypeAmount;
    userInputContinue = likeToContinue(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
    if(userInputContinue.equals("Y") || userInputContinue.equals("y"))
    {
      finalBoozeTypeTwo = shopMainPageTwo(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
    }


    userInputContinue = likeToContinue(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
    if(userInputContinue.equals("Y") || userInputContinue.equals("y"))
    {
      finalBoozeTypeThree = shopMainPageThree(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
    }
    shoppingCart(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
  }

  public static String shopMainPageThree(String boozeTypeAmount, int boozeAmount, double boozeCost, int userInputBuy,  String userInputContinue, Scanner sc, String finalBoozeTypeOne, String finalBoozeTypeTwo, String finalBoozeTypeThree)
  {


        if(finalBoozeTypeOne.contains("Lager") && finalBoozeTypeTwo.contains("Bud") || finalBoozeTypeTwo.contains("Lager") && finalBoozeTypeOne.contains("Bud"))
        {
          System.out.println("\n\nWhat kind of booze would you like to buy?\n3. House Brand Vodka, 1 liter:\n4.40\n\nPlease enter the number of the type of booze you'd like to buy.");
          userInputBuy = sc.nextInt();
          boozeTypeAmount = continueShopping(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
          return boozeTypeAmount;
        }
        else if(finalBoozeTypeOne.contains("Vodka") && finalBoozeTypeTwo.contains("Bud") || finalBoozeTypeTwo.contains("Vodka") && finalBoozeTypeOne.contains("Bud"))
        {
          System.out.println("\n\nWhat kind of booze would you like to buy?\n1. Bavarian lager, 6 bottles:\n8.50\n\nPlease enter the number of the type of booze you'd like to buy.");
          userInputBuy = sc.nextInt();
          boozeTypeAmount = continueShopping(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
          return boozeTypeAmount;
        }
        else if(finalBoozeTypeOne.contains("Lager") && finalBoozeTypeTwo.contains("Vodka") || finalBoozeTypeTwo.contains("Lager") && finalBoozeTypeOne.contains("Vodka"))
        {
          System.out.println("\n\nWhat kind of booze would you like to buy?\n2. Bud Light, Sixpack:\n5.30\n\nPlease enter the number of the type of booze you'd like to buy.");
          userInputBuy = sc.nextInt();
          boozeTypeAmount = continueShopping(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
          return boozeTypeAmount;
        }
        else
        {
          boozeTypeAmount = shopMainPageTwo(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
          return boozeTypeAmount;
        }

  }




  public static String shopMainPageTwo(String boozeTypeAmount, int boozeAmount, double boozeCost, int userInputBuy,  String userInputContinue, Scanner sc, String finalBoozeTypeOne, String finalBoozeTypeTwo, String finalBoozeTypeThree)
  {


        if(finalBoozeTypeOne.contains("Lager"))
        {
          System.out.println("\n\nWhat kind of booze would you like to buy?\n2. Bud Light, Sixpack:\n5.30\n\n3. House Brand Vodka, 1 liter:\n4.40\n\nPlease enter the number of the type of booze you'd like to buy.");
          userInputBuy = sc.nextInt();
          boozeTypeAmount = continueShopping(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
          return boozeTypeAmount;
        }
        else if(finalBoozeTypeOne.contains("Bud"))
        {
          System.out.println("\n\nWhat kind of booze would you like to buy?\n1. Bavarian lager, 6 bottles:\n8.50\n\n3. House Brand Vodka, 1 liter:\n4.40\n\nPlease enter the number of the type of booze you'd like to buy.");
          userInputBuy = sc.nextInt();
          boozeTypeAmount = continueShopping(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
          return boozeTypeAmount;
        }
        else if(finalBoozeTypeOne.contains("Vodka"))
        {
          System.out.println("\n\nWhat kind of booze would you like to buy?\n1. Bavarian lager, 6 bottles:\n8.50\n\n2. Bud Light, Sixpack:\n5.30\n\nPlease enter the number of the type of booze you'd like to buy.");
          userInputBuy = sc.nextInt();
          boozeTypeAmount = continueShopping(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
          return boozeTypeAmount;
        }
        else
        {
          boozeTypeAmount = shopMainPageTwo(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
          return boozeTypeAmount;
        }

  }

  //The code below this comment asks how much alcohol you would like to purchase
  //and then returns the number as well as the alcohol's name as a string.

  public static String continueShopping(String boozeTypeAmount, int boozeAmount, double boozeCost, int userInputBuy, String userInputContinue, Scanner sc, String finalBoozeTypeOne, String finalBoozeTypeTwo, String finalBoozeTypeThree)
  {
    if(userInputBuy == 1 && !finalBoozeTypeOne.contains("Lager") && !finalBoozeTypeTwo.contains("Lager"))
    {
      System.out.println("You have selected: Bavarian Lager. How much would you like to add to your cart?");
      boozeAmount = sc.nextInt();
      boozeCost = boozeAmount * 8.50;
      boozeTypeAmount = "Bavarian Lager: x" + boozeAmount + ", " + boozeCost;
      return boozeTypeAmount;
    }
    else if(userInputBuy == 2 && !finalBoozeTypeOne.contains("Bud") && !finalBoozeTypeTwo.contains("Bud"))
    {
      System.out.println("You have selected: Bud Light. How much would you like to add to your cart?");
      boozeAmount = sc.nextInt();
      boozeCost = boozeAmount * 5.30;
      boozeTypeAmount = "Bud Light: x" + boozeAmount + ", " + boozeCost;
      return boozeTypeAmount;
    }
    else if(userInputBuy == 3 && !finalBoozeTypeOne.contains("Vodka") && !finalBoozeTypeTwo.contains("Vodka"))
    {
      System.out.println("You have selected: House Brand Vodka. How much would you like to add to your cart?");
      boozeAmount = sc.nextInt();
      boozeCost = boozeAmount * 4.40;
      boozeTypeAmount = "House Brand Vodka: x" + boozeAmount + ", " + boozeCost;
      return boozeTypeAmount;
    }
    else
    {
      System.out.println("Invalid number, please select 1, 2 or 3.");
      return null;
    }
  }

//This code checks whether or not you would like to continue shopping or go to your shopping cart.

  public static String likeToContinue(String boozeTypeAmount, int boozeAmount, double boozeCost, int userInputBuy, String userInputContinue, Scanner sc, String finalBoozeTypeOne, String finalBoozeTypeTwo, String finalBoozeTypeThree) {
    System.out.println("Added it to your cart!\n\nWould you like to continue shopping? Y/N");
    sc.nextLine();
    userInputContinue = sc.nextLine();
    if(userInputContinue.equals("Y") || userInputContinue.equals("y"))
    {
      return userInputContinue;
    }
    else if(userInputContinue.equals("N") || userInputContinue.equals("n"))
    {
      shoppingCart(boozeTypeAmount, boozeAmount, boozeCost, userInputBuy, userInputContinue, sc, finalBoozeTypeOne, finalBoozeTypeTwo, finalBoozeTypeThree);
      return userInputContinue;
    }
    else
    {
      System.out.println("Invalid command, please enter Y/N");
      return null;
    }
  }


  //The code below this comment displays the user's current shopping cart by taking individual boozeTypeAmounts and saving them as different strings outside of the function.

  public static void shoppingCart(String boozeTypeAmount, int boozeAmount, double boozeCost, int userInputBuy, String userInputContinue, Scanner sc, String finalBoozeTypeOne, String finalBoozeTypeTwo, String finalBoozeTypeThree)
  {

    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYour current shopping cart is:\n\n" + finalBoozeTypeOne + "\n\n" + finalBoozeTypeTwo + "\n\n" + finalBoozeTypeThree);
    System.out.println("Checking out...");
    try {
    Thread.sleep(2000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    finalBoozeTypeOne = finalBoozeTypeOne.replaceAll("[^\\.0123456789 ]","");
    finalBoozeTypeTwo = finalBoozeTypeTwo.replaceAll("[^\\.0123456789 ]","");
    finalBoozeTypeThree = finalBoozeTypeThree.replaceAll("[^\\.0123456789 ]","");
    finalBoozeTypeOne = finalBoozeTypeOne.substring(finalBoozeTypeOne.lastIndexOf(' ') + 1).trim();
    finalBoozeTypeTwo = finalBoozeTypeTwo.substring(finalBoozeTypeTwo.lastIndexOf(' ') + 1).trim();
    finalBoozeTypeThree = finalBoozeTypeThree.substring(finalBoozeTypeThree.lastIndexOf(' ') + 1).trim();
    double finalBoozePrice1 = 0d;
    double finalBoozePrice2 = 0d;
    double finalBoozePrice3 = 0d;
    finalBoozePrice1 = Double.parseDouble(finalBoozeTypeOne);
    finalBoozePrice2 = Double.parseDouble(finalBoozeTypeTwo);
    finalBoozePrice3 = Double.parseDouble(finalBoozeTypeThree);
    double ultimateBoozePrice = finalBoozePrice1 + finalBoozePrice2 + finalBoozePrice3;
    System.out.println("Success! A total of " + ultimateBoozePrice + " has been withdrawn from your account.");
    System.exit(1);
  }

//The code below this comment checks whether or not you are allowed to buy alcohol.

  public static boolean allowedToDrink(Scanner sc) {
    int age = sc.nextInt();
    if(age >= 18)
    {
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nWelcome, sir/madam, to Bertie's Boozehole, the finest in cheap alcohol. Our motto is: \"If it'll get you drunk, it's good enough.\"");
      boolean ofAge = true;
      return ofAge;
    }
    else
    {
      System.out.println("Sorry, you're underage, and due to government-imposed laws and moral issues, we unfortunately can't sell you any alcohol.");
      boolean ofAge = false;
      return ofAge;
    }
  }
}
