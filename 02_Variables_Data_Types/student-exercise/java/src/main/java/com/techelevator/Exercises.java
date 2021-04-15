
package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		System.out.println(remainingNumberOfBirds + " birds are left on the branch.");

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println("There are " + numberOfExtraBirds + " more birds than nests.");

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		
		int raccoonsPlaying = 3;
		int raccoonsDinner = 2;
		int raccoonsLeft = raccoonsPlaying - raccoonsDinner;
		System.out.println(+ raccoonsLeft + " raccoon is left in the woods.");
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		
		int flowers = 5;
		int bees = 3;
		int leftOverFlowers = flowers - bees;
		System.out.println("There are " + leftOverFlowers + " less bees than flowers.");
			
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		
		int firstPigeon = 1;
	    int anotherPigeon = 1;
	    int totalPigeons = firstPigeon + anotherPigeon;
	    System.out.println(totalPigeons + " pigeons are eating breadcrumbs now.");

        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
	    
	    int owlsFence = 3;
	    int owlsJoinedFence = 2;
	    int totalOwls = owlsFence + owlsJoinedFence;
	    System.out.println(totalOwls + " owls are now on the fence.");

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
	    
	    int beaversWorking = 2;
	    int beaversSwim = 1;
	    int beaversWorkingHome = beaversWorking - beaversSwim;
	    System.out.println(beaversWorkingHome + " beaver is still working on their home.");

        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
	    
	    int toucansSitting = 2;
	    int toucansJoin = 1;
	    int toucansTotal = toucansSitting + toucansJoin;
	    System.out.println("There are " + toucansTotal + " in all.");

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
	    int squirrels = 4;
	    int nuts = 2;
	    int moreSquirrels = squirrels - nuts;
	    System.out.println("There are " + moreSquirrels + " more squirrels than nuts.");

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

	    double quarter = .25;
	    double dime = .1;
	    double nickel = .05;
	    double totalMoney = 1.00 - (quarter + dime + (nickel * 2));
	    System.out.println("Mrs. Hilt found $" + totalMoney + " cents.");	    
	    
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
	    
	    int briermuffins = 18;
	    int macadamnsmuffins = 20;
	    int flannerymuffins = 17;
	    int totMuffins = briermuffins + macadamnsmuffins + flannerymuffins;
	    System.out.println("First grade baked " + totMuffins + " muffins.");	
	    
        /*
        12. Mrs. Hilt bought a  for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

	    double yoyo = .24;
	    double whistle = .14;
	  	double totalToyPrice = yoyo + whistle;
	    System.out.println("Mrs. Hilt spent " + totalToyPrice + " cents for the two toys.");
	    
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

	    int lgMarshmallows = 8;
	    int miniMarshmallows = 10;
	  	int totMarshmallows = lgMarshmallows + miniMarshmallows;
	    System.out.println("Mrs. Hilt used " + totMarshmallows + " marshmallows!");
        
	    /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

	    int hiltsHouseSnow = 29;
	    int schoolSnow = 17;
	  	int totSnow = hiltsHouseSnow - schoolSnow;
	    System.out.println("Mrs. Hilt's house had " + totSnow + " more inches of snow.");
	    
	    
	    
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
	    
	    int hiltHas = 10;
	    int toyTruck = 3;
	  	int pencilCase = 2;
	  	int moneyLeft = hiltHas - (toyTruck + pencilCase);
	    System.out.println("Mrs. Hilt has $" + moneyLeft + " left.");
	      
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

	    int collection = 16;
	  	int lost = 7;
	  	int remainingMarbles = collection - lost;
	    System.out.println("Josh has " + remainingMarbles + " marbles left.");
	    
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

	    int hasSeashells = 19;
	  	int needSeashells = 25;
	  	int collectionSeashells = needSeashells - hasSeashells;
	    System.out.println("Megan needs to find " + collectionSeashells + " seashells to have 25 total.");
	    
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

	    int allBalloons = 17;
	  	int redBalloons = 8;
	  	int restGreen = allBalloons - redBalloons;
	    System.out.println("Brad has " + restGreen + " green ballons.");
	    
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

	    int booksShelf = 38;
	  	int booksAdded = 10;
	  	int totBooks = booksShelf + booksAdded;
	    System.out.println("There are now " + totBooks + " books on the shelf.");
	    
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

	    int beeLegs = 6;
	  	int beeTot = 8;
	  	int totLegs= beeLegs * beeTot;
	    System.out.println("Eight bees have " + totLegs + " legs.");
	    
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

	    double iceCream = .99;
	    double totCost = iceCream * 2;
	    System.out.println("Two ice cream cones cost $" + totCost + ".");
	    
	    
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

	    int rockNeeds = 125;
	  	int rockHas = 64;
	  	int moreRocks = rockNeeds - rockHas;
	    System.out.println("Mrs. Hilt needs " + moreRocks + " more rocks to complete the border.");
	    
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
	    
	    int marblesHad = 38;
	  	int marblesLost = 15;
	  	int marblesLeft = marblesHad - marblesLost;
	    System.out.println("Mrs. Hilt has " + marblesLeft + " marbles left.");

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

	    int milesAway = 78;
	  	int milesStopped = 32;
	  	int milesLeft = milesAway - milesStopped;
	    System.out.println("Mrs. Hilt and her sister had " + milesLeft + " miles left to drive.");
	    
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */

	    int shovSnowMorn = 90;
	    int shovSnowAfter = 45;	    
	    int hrsSnowShov = ((shovSnowMorn + shovSnowAfter) / 60);
	    int minsSnowShov = ((shovSnowMorn + shovSnowAfter) % 60);
	    System.out.println("Total time shoveling snow = " + hrsSnowShov + " hours and " + minsSnowShov + " minutes.");
	    
	    
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

	    double hotDogs = 6;
	    double hotDogCost = .50;
	    double totDogCost = hotDogs * hotDogCost;
	    System.out.println("Mrs. Hilt paid " + totDogCost + " for all of the hot dogs!");
	    
	    /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
	    
	    double hiltCents = .50;
	    double pencilCost = .07;
	    double totPencils = hiltCents / pencilCost;
	    System.out.println("Mrs. Hilt can buy " + (Math.floor(totPencils)) + " pencils.");

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
	    
	    int butterSeen = 33;
	  	int butterOrange = 20;
	  	int butterRed = butterSeen - butterOrange;
	    System.out.println("There were " + butterRed + " red butterflies.");

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
	    
	    double kateGave = 1;
	    double katCandy = .54;
	    double change = kateGave - katCandy;
	    System.out.println("Kate should receive $" + change + ".");
	    
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

	    int markTrees = 13;
	  	int markPlants = 12;
	  	int totPlants = markTrees + markPlants;
	    System.out.println("Mark will have " + totPlants + " trees.");
	    
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

	     int timeInDay = 24;
	     int days = 2;
	     int totTime = timeInDay * days;
	     System.out.println(totTime + " hours until Joy sees her grandma.");
	    		 
	    
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

	     int kimCousins = 4;
	     int gumToGive = 5;
	     int gumNeeded = kimCousins * gumToGive;
	     System.out.println(gumNeeded + " pieces of gum needed.");
	    		 
	     
	     
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

	     int danHas = 3;
	     int candyBar = 1;
	     int danLeft = danHas - candyBar;
	     System.out.println("There is $" + danLeft + " left.");
	    		 
	     
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

	     int boats = 5;
	     int peopleEachBoat = 3;
	     int totPeople = boats * peopleEachBoat;
	     System.out.println(totPeople + " total people on boats in lake.");
	     
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

	     int legos = 380;
	     int lostLegos = 57;
	     int legosNow = legos - lostLegos;
	     System.out.println("Ellen has " + legosNow + " legos now.");
	     
	     /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

	     int bakedMuffins = 35;
	     int totalMuffins = 83;
	     int missingMuffins = totalMuffins - bakedMuffins;
	     System.out.println("In order to have 83 muffins, Arthur needs " + missingMuffins + " more!");
	     
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

	     int willy = 1400;
	     int lucy = 290;
	     int crayonsNeeded = willy - lucy;
	     System.out.println("Willy has " + crayonsNeeded + " more crayons than Lucy.");
	     
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
 
	     int stickers = 10;
	     int pages = 22;
	     int moreStickers = stickers * pages;
	     System.out.println("There are " + moreStickers + " stickers.");
	     
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
	     
	     int cupcakes = 96;
	     int kids = 8;
	     int cupsPerPerson = cupcakes / kids; 
	     System.out.println("Each person will get " + cupsPerPerson + " cupcakes.");
	     

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

	     int gingerbread = 47;
	     int jars = 8;
	     int notPlaced = gingerbread % jars;
	     System.out.println(notPlaced + " cookies will not be placed in a jar.");
	     
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

	     int croissants = 59;
	     int neighbors = 8;
	     int santsLeft = croissants % neighbors;
	     System.out.println("Marian will have " + santsLeft + " croissants left.");
	     
	     
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
	     
	     int tray = 12;
	     int totCookies = 276;
	     int traysNeeded = 276/tray;
		 System.out.println("Marian will need " + traysNeeded + " trays.");
	     
	     
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		 int serving = 12;
		 int totPretzels = 480;
		 int totServings = totPretzels / serving;
		 System.out.println("Marian can prepare " + totServings + " servings.");
	     
		 
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		 
		 int lmCupcakes = 53;
		 int leftHome = 2;
		 int boxOfCupcakes = 3;
		 int totBoxes = ((lmCupcakes - leftHome) / boxOfCupcakes);
	     System.out.println(totBoxes + " boxes were given away.");
	     
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
	     
	     int cutCarrots = 74;
	     int carrotPeople = 12;
	     int uneaten = cutCarrots % 12;
	     System.out.println(uneaten + " carrot sticks were uneaten.");
	     
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
	     
	     int tbears = 98;
	     int perShelf = 7;
	     int fullShelves = tbears / 7;
	     System.out.println(fullShelves + " full shelves.");
	     
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

	     int album = 20;
	     int pictures = 480;
	     int totAlbum = pictures / album;
	     System.out.println(totAlbum);
	     
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

	     int cards = 94;
	     int boxHolds = 8;
	     int boxFilled = (cards / boxHolds);
	     int unfilledBox = (cards % boxHolds);
	     System.out.println(boxFilled + " boxes filled. " + unfilledBox + " unfilled boxes.");
	    
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
	     
	     int books = 210;
	     int shelves = 10;
	     int totBook = (books / shelves);
	     System.out.println(totBook + " books");
	    

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

	     int crisSants = 17;
	     int guests = 7;
	     int eachGuest = (crisSants / guests);
	     System.out.println(eachGuest + " per guest");
	    
	     
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
	     
	     double billRate = 2.15 * 5;
	     System.out.println(billRate);
	     double jillRate = 1.9 * 5;
	     System.out.println(jillRate);
	     double comboRate = billRate + jillRate;
	     System.out.println(comboRate);
	     double totalWallsInFeet = (12 * 14) * 5;
	     System.out.println(totalWallsInFeet);
	     double totPaintTime = totalWallsInFeet / comboRate;
	     System.out.println(totPaintTime);
	     //System.out.println("It will take the two painters " + totPaintTime + " hours to finish.");
	     
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
	     
	     String fName = "Shirkesha";
	     String lName = "Barnes";
	     String midInitial = "E";
	     String fullName = lName + ", " + fName + " " + midInitial + ".";
	     System.out.println(fullName);
	     
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

	     int totMiles = 800;
	     int milesTrav = 537;
	     double perComplete = milesTrav / totMiles;

	}

}
