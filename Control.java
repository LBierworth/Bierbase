/*
*  Title: Assignment 4
* Description: Program to create a Text Based Adventure Game
* Date: October 11th, 2020
* Author Lawrence Bierworth
* @ID: 3374567
* Version 1.0
*/

/* DOCUMENTATION
* 
* Adventure Game
* 
* Purpose and Decription
* 
* From the assignment page:
* This is a programming project. It represents a significant amount of programming work and a substantial investment of your time. You will need to research programs using Internet resources and Landing discussions, and then design your program to include the major Elements of the User Experience (described below). Moreover, you will need to code your program, document it, and test it.
*
* What you will be researching, designing, building, documenting and testing is an adventure game. Text-based adventure games were common and popular in the 1970s, 80s and 90s.
*
* The grandfather of all text-based adventure games is Colossal Cave Adventure, which also went by the names Adventure and ADVENT (on early systems with file name limits). Adventure was created by Will Crowther and Don Woods in 1975–1977 and originally written in FORTRAN (a third-generation computer language) for PDP minicomputers. It has been ported to many other systems and rewritten in several other computer languages.
*
* Your first line of research is to find out more about this game, especially the style of game play and how the game was constructed. An Internet search on topics such as “Adventure (game)” or “Colossal Cave Adventure” will turn up plenty of information. A good starting point is Wikipedia.
*
* Ultimately, your game will comprise all the following elements, and will form a complete, playable game.
*
* Elements of the User Experience
* The game, itself, is a text-based adventure game. There are no graphics; only text is used for communication between the game and the player. All output is descriptive, in the form of paragraphs and short answers (e.g., “You can’t go in that direction.”). All input is in the form of simple text commands chosen from a limited set of options (e.g., “go north”). The input is sophisticated, though, as it recognizes “go north,” “north,” and “n” as identical commands, and acts accordingly. Punctuation and capitalization are ignored as input.
*
* You are the main character or player. The game space is represented as a set of rooms, connections between rooms, characters you meet, and items. Items include things you will need to successfully complete the game, such as food, rope, flashlight, etc., as well as items you find that will increase your final score, such as treasure, rugs, coins, batteries, etc. Items found can be carried, dropped or used. Carried items are maintained in an inventory accessible with the “inventory,” “invent” or “i” command.
*
* Items can be combined with action words to cause action events in the game (e.g., “throw rock at goblin”).
*
* Sometimes action event outcomes are random. For example, if you throw a rock at a goblin, the goblin might duck or it might get hit.
*
* The player might encounter other characters, such as a thief, goblin, bird, snake, etc. Some are good characters, and many are evil. Encounters are random and occur at any time or location. Encounters may be triggered by an item in the inventory (e.g., if you have a jewel, you are more likely to encounter the thief).
*
* The player begins the game at a common location, and proceeds to explore the game world using the input commands and responding to the displayed output. Some rooms have multiple entrances and exits, and some have many ways in, but only one way out (e.g., sliding down a tunnel). Sometimes you may encounter a maze, and dropping an inventory item will help you navigate out.
*
* The play proceeds with the player inputting a text command sequence. The game then responds by displaying the outcome. Sometimes the outcome will be a long, descriptive paragraph explaining what is happening. Other times, it will be a description of what the player can see at that location. Usually, the first time visiting a location will trigger a long descriptive output, and subsequent visits will display an abbreviated output (e.g., “You are at the chasm again”).
*
* The game proceeds until the player either perishes or wins. The player can perish in an interaction with a nasty character, by starvation or thirst, or by falling down a hole or off a cliff. A win is usually indicated by a return to a “safe area” with all the treasures.
*
* The establishment of a safe area can benefit the game play by allowing the player to “stash” inventory items for safe keeping or to relieve him or herself of carrying multiple items.
*
* Your Game
* The game you write for this assignment is based on the book Alice’s Adventures in Wonderland by Lewis Carroll, also known as Alice in Wonderland. You may base your game on either the book by Lewis Carroll or one of the movie adaptations of the book.
*
* Alice’s Adventures in Wonderland is in the public domain. You can access a copy of the work online through Project Gutenberg.
*
* Alice in Wonderland makes for an entertaining adventure game, because there are many rooms (scenes), as well as a number of key characters and situations you may employ in your game.
*
* You are not expected to follow the entire plot of the book, nor are you expected to program the entire book, all the items, or all the characters.
*
* Rather, your game is to be an adaptation of the book into the form of an adventure game in which your character—Alice, perhaps—sees various scenes and characters and can interact with them and with the items found in their vicinity. There is no requirement that your main character (i.e., you, the player) represents Alice, although this is probably the most common choice.
*
* For example, you may start your game as Alice, above ground, who encounters the white rabbit and talks to him. Eventually, you find the rabbit hole and fall down to the room containing “eat me” and “drink me.” Consuming these items will presumably have the same effect as in the book.
*
* Likewise, you may interact with the Cheshire Cat, the Mad Hatter and other book characters. Prolonged interaction with the Red Queen will, presumably, prove to be unfortunate.
*
* Ultimately, you will decide how the book characters, scenes and items “come to life” in your game.
*
* Project Requirements
* The game must employ object-oriented principals for all the components. That means the highest class is Game—your finished game. You may choose to call this main class Wonderland or another appropriate name. The Game class should have one main() method that creates an instance of the game and invokes it for game execution. Within Game, necessary classes must include Locations, Items, Characters, Actions, Inventory and Control. You may find more classes are necessary to complete the game.
*
* The Control class is the class that reads user input and checks the input against valid Actions. If an Action is allowed, then the methods required to complete the action should be called on the objects involved (e.g., Action: “take”; object involved: “flashlight”). Certain actions will result in changes in the user’s inventory. Other actions will change the user’s location. Changes in location will trigger appropriate descriptive outputs based on the room entered and whether it is the first time entering.
*
* Give careful consideration to your how the objects (classes) in your game interact.
*
* Your game can contain any reasonable number of locations (rooms), with a minimum of five (5). A common starting point is near the rabbit hole, and the ending point is somewhere in wonderland. Once you descend into the rabbit hole, you are unable to return. Otherwise, the locations (rooms) and how you connect them is your design choice, which MUST be completely documented as part of the design documents for the game. You should create a “safe room” to act as a gathering area for your treasures.
*
* Locations should have a minimum of one entrance and one exit (not the same), but at least one room must have more than three (3) exits.
*
* You must portray a minimum of five (5) characters from the book. You must have a minimum of 12 items for the main character to interact with, which should be taken from the book.
*
* You will need to establish a goal for the main character (e.g., Alice), and you must state this at the beginning of the game.
*
* The items, characters, location descriptions and action words should be contained in separate text files, which are opened and loaded into the game at the start of the game.
*
* Test Plan
* 
* Test each command and observe results.  Attempt to complete objectives within the game and test if those objectives show as complete.
* 
* Actual:
* Some troubleshooting, but results now display as expected.
* 
* Troubleshooting:
* 
* Methods have been a bit of a pain for me.  I learned a simple way to impliment tyhe ones I need to for this project, and figured out why some of them were not correctly returning variables.  I am attempting to use methods primarily to reduce redundancy in my main control flow switch.  However, since some properties of my variables are strings, and some art integers, many of them cannot be placed in a method together.
*
* Parsing the string hit a snag when I tried to overcome the issue of not knowing the length of the command string when it is input.  It took embarrassingly long to realize the solution was the .length parameter, which I had known about, but forgotten.
*
* I tooled around a while before deciding how to determine characters, objects, and items for commands like look, get, and so forth.  I have found it easiest to use a search for a matching name, then check if the location is correct (you cannot look at an item in a different room).  This works, although a bit of extra code is needed because, while objects can contain items, their interior isn't the same as the room location, for obvious reasons.
*
* A particular event that triggers on the cake task when outside was firing when it wasn't supposed to.  I set up a variable to track if it's done and simplified the call statement for it.  Works when it should now, and doesn't when it shouldn't.
*
* Get and put statements were moving all matching items rather than one at a time.  Revolved by putting in break statement in for when the task is successful once.
*
* A few item tags weren't very useful - if I'm naming my items wrong, it should be fixed.  Done.
*/

// CODE..

import java.util.Scanner;		// We will need the scanner for input

public class Control 			// Control class will contain must of our program
{

	public static void main(String []args)	
	{
		String[] locationName = {"The Long Hallway", "Store Room", "Poolside", "Outside House", "Inside House", "House Upstairs", "Pool", "Card Room"};
		String[] locationDesc = {"At one end of the hallway lies the hole from which the dreaded child is expected.  Lining both sides of the hallway are lit laterns.  To the East is the storeroom.", 
								"This poorly lit storeroom is lined with shelves, mostly containing junk, with some cobwebs in the corners.  Doors lead west to the hallway and south to the pool.", 
								"A lovely little poor, recently skimmed of pigeon feathers and bird poop, shimmers nicely.  Around it, the grass is invitingly well manicured.  A door North to the storage room is carefully concealed here, and the grass stretches South to a small home.  You can also go North deeper into the pool.  Never a safe thing to do in Australia.  Finally, to the East there appear to be several costumed figures.", 
								"A small path leads up to a small house.  The sign out front contains the letters W. RABBIT in still-drying paint.  The door leads West into the house, or the grass continues North to the pool.", 
								"The main floor is cramped, with the living area and kitchen combined into one space.  Stairs lead upwards, and a door to the East leads back outside.", 
								"The upstairs room is small and claustrophobic.  You can go back down the stairs from here.", 
								"You reach the deeper waters of the pool, only to discover you cannot swim!", 
								"This room seems to have a few people preparing take part in some kind of strange costume game.  They are best avoided.  You can head back West to the pool from here."};
// These two arrays contain the descriptions for the various rooms that are a part of this game.
// The rooms are set to the same value in each array: 0-hallway, 1-Store room, 2-Poolside, 3-Outside home, 4-Inside house, 5-House upstairs.
// It should be noted here that, when a location is assigned to an item, location 6 will be the player's inventory.
		
		String[] characterName = {"Gary", "Lucas", "Tom", "Dennis", "Sue"};
		String[] characterDesc = {"Gary is here, trying his best to be helpful.", 
								"Lucas is here, doing his very least to be helpful.", 
								"Tom is here, uncomfortably wearing a playing card costume.", 
								"Dennis is here, looking like his card costume is a few sizes too small.", 
								"Sue is wearing a card costume and glowering angrily."};
		String[] characterLook = {"Gary is about average in height, about average in weight, and above average is being a great guy.  Way to be, Gary.", 
								"Lucas is the owner's son, and it's hard for you to see past that.  It's hard for Lucas to see past that as well.  He's keeping himself cool with a paper fan.", 
								"Tom is wearing a five of hearts card costume and seems to be trying to motion you away.", 
								"Dennis is wearing a seven of hearts costume and is doing his best to try to get it to fit.", 
								"Sue is wearing a queen of hearts costume, and seems to be trying her best to make it look serious."};
		String[] characterTalk = {"'All right there, mate' Gary says to you, offering a wide grin.  'What can I do to help?  I know, why don't I list your tasks for you again.\n\nFirst off, there's a bunch of cakes in the house that need to be delievered.  One to the upstairs on a table, and another one here, anywhere is good.  Don't try carrying them all at once.  That's just asking for trouble.\nYou also need to gather the costumes.  I think Sue has them around her area.  Just have them all by the pool and ready to go.\nThere also need to be a key on that glass table over there.  Not sure where it's at though, sorry mate.\nThere's a pair of bottles somewhere, one goes on that glass table as well, the other upstairs on the table there.\nSpeaking of that table, you also need to find some gloves and a fan to put on it.  I think Lucas stole the fan.  But he's not ro bright, now is he?  Give find something he wants, give it to him, and he'll forget all about that fan.\nLastly, if you find anything that's distinctly Australian, make sure to gather it up.  You leave anything like that behind, we're done for sure.'\n\n'Sure hope that helps, mate.  If you need me, I'll be around.  I've got some time before I have to put on that silly rabbit costume.",
								"Lucas lets out an exasperated sigh, 'Why does work have to be so hard?",
								"Tom shoos at you, 'Git!  Git!  before Sue makes you a card or something!", 
								"Dennis pulls at the corners of his Seven of Hearts costume, failing to make it fit.  'You shouldn't bother sue.  She'll make you into a two!'",
								"Sue fixes you with an icy glare.  'You there!  Are you one of mine!  If you are, you should be in costume already!  We have rehearsals to do!'"};

		int[] characterLoc= {0, 3, 7, 7, 7};
//	These arrays hold information on the characters for their names, their descriptions, and what information the user will get from looking at them.
// characterLoc holds the locations of the characters.  They don't move, but rooms will check this when displaying contents.	
		
		String[] objectName = {"glass", "shelves", "pool", "table", "cobwebs"};
		String[] objectDesc = {"A glass table sits by the wall.",
								"A set of dusty shelves stand against the wall.", 
								"A pool of water takes on the centre of this area.", 
								"A simple table sits against the window.", 
								"A few cobwebs stretch across the corners of the room."};
		String[] objectLook = {"The three legged table combines the fragility of glass with the weight of glass.",
								"The shelves are mostly full of dust and junk.", 
								"The pool is about knee deep and looks almost green with algie.  Still, a close look reveals there might be a few items hidden inside.", 
								"The table is wood, about table height, and about as big as your average table.  You suspect it weights about one table.", 
								"The cobwebs are old and probably no longer occupied by any spiders.  There does seem to be something caught inside.  Possibly a fly?  Or is it a jar of some kind?"};
		int[] objectLoc = {0, 1, 2, 5, 1};
// These arrays hold the descriptive term for the game's objects.
// This game defines objects as those things which cannot be moved or picked up, and may hold objects themselves.
// objectLoc is a value for each item to indicate it's location
		
		String[] itemName = {"bottle", "bottle", "vegemite", "vegemite", "vegemite", "key", "fan", "gloves", "cake", "cake", "cake", "cake", "cake", "cake", "costumes", "head", "head"};
		String[] itemDesc = {"A small bottle lies on the ground.", 
							"A small bottle lies on the ground.", 
							"A jar of vegemite is here, looking very Australian.", 
							"A jar of vegemite is here, looking very Australian.", 
							"A jar of vegemite is here, looking very Australian.", 
							"A small golden key barely catches your eye.", 
							"A fan sits here, gathering dirt.", 
							"A pair of white gloves sit here, looking out of place.", 
							"A small cake saits here, waiting to be devoured.", 
							"A small cake saits here, waiting to be devoured.", 
							"A small cake saits here, waiting to be devoured.", 
							"A small cake saits here, waiting to be devoured.", 
							"A small cake saits here, waiting to be devoured.", 
							"A small cake saits here, waiting to be devoured.", 
							"A stack of costumes look unconvincing here.", 
							"The soggy head from an eagle costume sits here.", 
							"The head from an eagle costume sits here."};
		String[] itemLook = {"It is a small bottle of juice, laced with LSD.", 
							"It is a small bottle of juice, laced with LSD.", 
							"Seeing even one of these is sure to let Alice in on the ruse.", 
							"Seeing even one of these is sure to let Alice in on the ruse.", 
							"Seeing even one of these is sure to let Alice in on the ruse.", 
							"It's heavy for it's size, and looks pretty when it catches the sunlight.", 
							"It's a small paper fan.", 
							"Just looking at them makes you want to put them on and run a finger along a surface with disapproval.", 
							"It looks delicious.  You're sure it's spiked with something hallucinogenic.", 
							"It looks delicious.  You're sure it's spiked with something hallucinogenic.", 
							"It looks delicious.  You're sure it's spiked with something hallucinogenic.", 
							"It looks delicious.  You're sure it's spiked with something hallucinogenic.", 
							"It looks delicious.  You're sure it's spiked with something hallucinogenic.", 
							"It looks delicious.  You're sure it's spiked with something hallucinogenic.", 
							"An eagle?  A dodo?  A lizard?  Who thought these were a good idea?", 
							"The feathers lack the proper fluff to pull this off.", 
							"This head looks about right now.  Good enough to trick a hallucinating child anyway."};
		int[] itemLoc = {13, 13, 13, 12, 9, 99, 99, 10, 4, 4, 4, 4, 4, 4, 7, 99, 99};
// The item variables have the same name, description, look description options as objects and characters,
// but also have a variable to determine their current location.
// Some of the values are redundant.  That is intentional.  Their location in the array is related to their item number for tracking purposes.
// This also makes it clear, looking at the code, that there are several of each of these items.
// The itemLoc sets the initial placement for items.  Several have location 99, which indicates they are not attainable until certain conditions are met.

		int score = 0;
// The game will track the user's score for completing tasks.
		
		Scanner input = new Scanner(System.in);
// input sets up the program to receive a command line from the user		
		
		int play = 1;
// play is the variable controlling the main play loop.  When the game is ended, this becomes zero.
		int location = 0;
// Possibly the most important variable in the program.  location tracks the current location of the user, and is checked for many
// commands such as look, get, put, etc to ensure that the target of an interaction is in the same room.
		int hadVegemite = 0;
// This variable is used to track if you have vegemite in your inventory when you try to give some to Lucas.  If you don't, it shows
// an error on the attempt.
		int costumeDrop = 0;
// These is a special case for the costume quest that happens once.  This tracks for that occurance.
		int cakePassed = 0;
// This tracks an occurrance in the cake delivery quest

		System.out.println("'G'day there bud,' Gary gives you a friendly smile.  We're gonna need your help with something.'\n"
				+ "He gestures to the hole behind him.  See, some American lass is set to fall through this later on, and we can't\n"
				+ "be letting her know that there's an easy way for Americans to start popping up in out backyards anythime they\n"
				+ "please'  Gary takes a long sigh.\n"
				+ "'Look, I've gotta pretend I'm a rabbit or something soon - don't make that face at me, couple of us got Lucas"
				+ "tricked into being a dodo.  Sue over in accounting has some kind of plan to get people to be playing cards or"
				+ "something.  Hoping that power doesn't go to her head.\n\n"
				+ "Where do you come in?  Glas you asked.  There's a list your tasks for you:\\nFirst off, there's a bunch of cakes "
				+ "in the house that need to be delievered.  One to the upstairs on a table, and another one here, anywhere is good. "
				+ " Don't try carrying them all at once.  That's just asking for trouble.\\nYou also need to gather the costumes.  "
				+ "I think Sue has them around her area.  Just have them all by the pool and ready to go.\\nThere also need to be a "
				+ "key on that glass table over there.  Not sure where it's at though, sorry mate.\\nThere's a pair of bottles "
				+ "somewhere, one goes on that glass table as well, the other upstairs on the table there.\\nSpeaking of that table, "
				+ "you also need to find some gloves and a fan to put on it.  I think Lucas stole the fan.  But he's not ro bright, "
				+ "now is he?  Give find something he wants, give it to him, and he'll forget all about that fan.\\nLastly, if you "
				+ "find anything that's distinctly Australian, make sure to gather it up.  You leave anything like that behind, we're "
				+ "done for sure.'\\n\\n'Sure hope that helps, mate.  If you need me, I'll be around.  I've got some time before I "
				+ "have to put on that silly rabbit costume.\nWhen you're done, just state that.  'done'  Talk to me again if you "
				+ "need a reminder'\n");
// This block of text serves as our introduction to the game.  It is presented as if said by character Gary, who is in the starting room.		
		
//		CORE GAMEPLAY LOOP START
		
		while (play == 1)
		{
// This is the main loop that runs our command input and execution.  Play remains 1 unless changed by the player typing "done" or the character dying.
		
		System.out.println(locationName[location]);
		System.out.println(locationDesc[location]);
// The location name and description is output at the start of each loop
		for (int i = 0; i < 5; i ++)
		{
			if (characterLoc[i] == location)
			{
				System.out.println(characterDesc[i]);
			}
		}
// The program searches for characters in the current location and outputs their names if they are present
		for (int i = 0; i < 5; i ++)
		{
			if (objectLoc[i] == location)
			{
				System.out.println(objectDesc[i]);
			}
		}
// Process repeats for objects			
		for (int i = 0; i < 17; i ++)
		{
			if (itemLoc[i] == location)
			{
				System.out.println(itemDesc[i]);				
			}
		}
// Process repeats for items		
		
		System.out.println("Enter Command:");
		String userInput = input.nextLine(); 
		String[] words = userInput.split("\\s+");
// Once the input is received by the user, it is broken up into it's component words to parsing.
//	Control myControl = new Control(String[] words);
				
// Following is the switch which reads the commands input by the user
		switch (words[0].toLowerCase())
		{
//	DIRECTIONAL INPUT
		case "n":
			location = moveNorth(location);	
			for (int i = 8; i < 14; i ++)  // a for loop to check through certain items in the character's inventory
			{
				if ((itemLoc[i] == 8) && ((itemLoc[5] == 99) || (itemLoc[5] == 2)))  // a check to see if the player has a cake and if the key event has triggered already, or if it is still on the ground
				{
					itemLoc[5] = 2;
					System.out.println("Oh no!  You slipped on something and dropped a cake into the pool!  It's ruined!");
					itemLoc[i] = 99;
// The key is set to it's lcoation on the ground.  This even must fire at least once to complete the key quest.
				}
			}
// There is a scripted event for entering the pool with a cake in your inventory that happens until the player picks up the key from that zone
// though the key is not there until it triggers the first time.			
			break;
		case "north":
			location = moveNorth(location);
			for (int i = 8; i < 14; i ++)
			{
				if ((itemLoc[i] == 8) && ((itemLoc[5] == 99) || (itemLoc[5] == 2)))
				{
					itemLoc[5] = 2;
					System.out.println("Oh no!  You slipped on something and dropped a cake into the pool!  It's ruined!");
					itemLoc[i] = 99;
				}
			}
// The event again, for the other input possible to move north.
			break;
// If the user inputs n or north the program checks if that direction is viable, and moves them if it is.		
		case "s":
			location = moveSouth(location);
			break;
		case "south":
			location = moveSouth(location);
			break;
			// If the user inputs s or south the program checks if that direction is viable, and moves them if it is.		
		case "e":
			location = moveEast(location);
// There is a scripted event which the program will now check for.
			for (int i = 8; i < 14; i ++)	// for loop to go through certain inventory items
			{
				if ((itemLoc[i] == 8) && (itemLoc[15] == 8))	// if statement to check if one of those items is in the character's incentory
				{
					System.out.println("The breeze threatens to knock the cake from your hands, but instead whirls about the wet eagle costume head, drying it off!");
					itemLoc[15] = 99;
					itemLoc[16] = 8;
					cakePassed = 1;
					break;
// This is the case desired by the player - it finishes the event and makes the costume quest possible to complete
				}
				else if (((itemLoc[i] == 8) && (itemLoc[15] != 8)) && (cakePassed == 0))  // else if statement determines if the player has not completed the event in a way that concludes it
				{
					System.out.println("Stepping outside, your hands shake a little in the cold breeze, dropping a cake!");
					itemLoc[i] = 99;
					break;
// This case 'destroys' one of the cake items by moving it to an unattainable location
				}
			}
// This scripted event is set to occur when the player exits the house with a cake but not the wet eagle costume head.
			break;
		case "east":
			location = moveEast(location);
			for (int i = 8; i < 14; i ++)
			{
				if ((itemLoc[i] == 8) && (itemLoc[15] == 8))
				{
					System.out.println("The breeze threatens to knock the cake from your hands, but instead whirls about the wet eagle costume head, drying it off!");
					itemLoc[15] = 99;
					itemLoc[16] = 8;
					cakePassed = 1;
					break;
				}
				else if (((itemLoc[i] == 8) && (itemLoc[15] != 8)) && (cakePassed == 0))
				{
					System.out.println("Stepping outside, your hands shake a little in the cold breeze, dropping a cake!");
					itemLoc[i] = 99;
					break;
				}
			}
// A repeat of that event for  the other directional input of East.		
			break;
// If the user inputs e or east the program checks if that direction is viable, and moves them if it is.		
		case "w":
			location = moveWest(location);
			break;
		case "west":
			location = moveWest(location);
			break;
// If the user inputs w or west the program checks if that direction is viable, and moves them if it is.
		case "up":
			location = moveUp(location);
			break;
		case "u":
			location = moveUp(location);
			break;
// If the user inputs u or up the program checks if that direction is viable, and moves them if it is.			
		case "down":
			location = moveDown(location);
			break;
		case "d":
			location = moveDown(location);
			break;
// If the user inputs d or down the program checks if that direction is viable, and moves them if it is.		
// These cases cover directional movement and adjust the current location if needed.
			
//	LOOK COMMAND
		case "look":
			if (words.length > 1)
			{
				
				for (int i = 0; i < 5; i ++)
				{
					if ((words[1].contentEquals(characterName[i])) && (location == characterLoc[i]))
					{
					System.out.println(characterLook[i]);
					}
				}
// The program searches for characters matching the name in the current location and outputs their names if they are present
				for (int i = 0; i < 5; i ++)
				{
					if ((words[1].contentEquals(objectName[i])) && (location == objectLoc[i]))
					{
						System.out.println(objectLook[i]);
						System.out.println("Containing:");
						switch (words[1])
						{
						case "glass":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 9)
								{
									System.out.println(itemDesc[n]);
								}
							}
							break;
						case "shelves":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 10)
								{
									System.out.println(itemDesc[n]);
								}
							}
							break;
						case "pool":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 13)
								{
									System.out.println(itemDesc[n]);
								}
							}
							break;
						case "cobwebs":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 12)
								{
									System.out.println(itemDesc[n]);
								}
							}
							break;
						case "table":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 11)
								{
									System.out.println(itemDesc[n]);
								}
							}
							break;
						default:
							System.out.println("I don't see that here.");	
						}
					System.out.println();			
					}
				}
// Process repeats for objects.  Objects is much longer, as looking at an object lists the items that object contains.
// So for each object, a search is done for what items are located in it, and then they are listed.
				for (int i = 0; i < 17; i ++)
				{
					if ((words[1].contentEquals(itemName[i])) && (location == itemLoc[i]))
					{
					System.out.println(itemLook[i]);
					break;
					}
				}			
// Finally the look command can look at an item in your location and display information on it.
		}
		else	
		{
			System.out.println(locationDesc[location]);							
		}
			break;
// The look feature operates for several situations:
// If only "look" is written, it repeats the room description and lists objects in the room, as is done at the start of each new command line.
// If look has only two words, the second word is checked for matches to characters, objects, or items.  If there is a match, it checks as well 
// if that item is in the room.  If the case both are true, it gives the look description of that.
// If the item is not found, it prints a message indicating that.	
			
//	TALK COMMAND
		case "talk":
			for (int i = 0; i < 5; i ++)
			{
				if ((words[1].contentEquals(characterName[i])) && (location == characterLoc[i]))
				{
				System.out.println(characterTalk[i]);
				}
			}
// Talk is a very simple command.  If the character being targetted with the talk command is in the same room as the player, their dialogue is output.
			break;
			
//	GET COMMAND
		case "get":
			int getSuccess = 0;
// Simply tracks if an item was actually moved from the transaction to determine if an error must be output.
			if (words.length > 2)
			{
// get starts by determining if you are removing an item from an object.  If so, it determines if you are, and if that object is in your location.
				for (int i = 0; i < 5; i ++)
				{
					if ((words[2].contentEquals(objectName[i])) && (location == objectLoc[i]))
					{
						
						switch (words[2])
						{
// in the case that there is a match of these items, the game then checks if the item is there.
						case "glass":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 9 &&  words[1].contentEquals(itemName[n]))
								{
									itemLoc[n] = 8;
									getSuccess = 1;
									break;
// If it is, the item is moved to the player's inventory, and the getSuccess variable is changed to disable the error for not finding an item.
// A break is used in each of these to avoid the player taking all items of the same name with one command.
								}
							}
							break;
						case "shelves":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 10 &&  words[1].contentEquals(itemName[n]))
								{
									itemLoc[n] = 8;
									getSuccess = 1;
									break;
								}
							}
							break;
						case "pool":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 13 &&  words[1].contentEquals(itemName[n]))
								{
									itemLoc[n] = 8;
									getSuccess = 1;
									break;
								}
							}
							break;
						case "cobwebs":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 12 &&  words[1].contentEquals(itemName[n]))
								{
									itemLoc[n] = 8;
									getSuccess = 1;
									break;
								}
							}
							break;
						case "table":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 11 &&  words[1].contentEquals(itemName[n]))
								{
									itemLoc[n] = 8;
									getSuccess = 1;
									break;
								}
							}
							break;
						}
					}

				}
				
			}
			else if (words.length > 1)
			{
				for (int i = 0; i < 17; i ++)
				{
					if ((words[1].contentEquals(itemName[i])) && (location == itemLoc[i]))
					{
						itemLoc[i] = 8;
						getSuccess = 1;
						break;
					}
				}
			}	
			if (getSuccess != 1)
			{
				System.out.println("You don't see that here.");
			}
			break;

// PUT COMMAND
		case "put":
			int putSuccess = 0;
// putSuccess simply tracks if an item was actually moved from the transaction to determine if an error must be output.
			if (words.length > 2)
			{
// The put command is esentially the same as the get command, except each positive result swaps the itemLoc variables from searing
// the target location and place in the inventory, to searching the inventory and placing in the target location.
				for (int i = 0; i < 5; i ++)
				{
					if ((words[2].contentEquals(objectName[i])) && (location == objectLoc[i]))
					{
						
						switch (words[2])
						{
						case "glass":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 8 &&  words[1].contentEquals(itemName[n]))
								{
									itemLoc[n] = 9;
									putSuccess = 1;
									break;
								}
							}
							break;
						case "shelves":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 8 &&  words[1].contentEquals(itemName[n]))
								{
									itemLoc[n] = 10;
									putSuccess = 1;
									break;
								}
							}
							break;
						case "pool":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 8 &&  words[1].contentEquals(itemName[n]))
								{
									itemLoc[n] = 13;
									putSuccess = 1;
									break;
								}
							}
							break;
						case "cobwebs":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 8 &&  words[1].contentEquals(itemName[n]))
								{
									itemLoc[n] = 12;
									putSuccess = 1;
									break;
								}
							}
							break;
						case "table":
							for (int n = 0; n < 17; n++)
							{
								if (itemLoc[n] == 8 &&  words[1].contentEquals(itemName[n]))
								{
									itemLoc[n] = 11;
									putSuccess = 1;
									break;
								}
							}
							break;
						}
					}

				}
				
			}
			else if (words.length < 3)
			{
				System.out.println("Put what where?");
			}	
			if (putSuccess != 1)
			{
				System.out.println("You don't see that here.");
			}
			break;
			
//	DROP COMMAND
		case "drop":
			if (move.length > 1)
			{
				for (int i = 0; i < 17; i ++)
				{
					if (itemLoc[i] == 8 &&  words[1].contentEquals(itemName[i]))
					{
						itemLoc[i] = location;
						break;
					}
// The drop command is very simple: it searching your inventory for the item mentioned; if it is there, the item is moved to the current location	
				}
			}
			else
			{
				System.out.println("Drop what?");
//If the player fails to provide an object to drop, this error occurs.			
			}
			if ((costumeDrop == 0) && (itemLoc[14] == 2))
			{
				itemLoc[15] = 13;
				costumeDrop = 1;
				System.out.println("Oh no!  One of the costume heads rolled into the pool!  You'd better get that dried off and place it with the rest!");
			}
// This is a scripted event that occurs in the costume quest line.  It can only happen once, and results in creating the wet eagle costume head item in the pool
			break;
			
//	GIVE COMMAND			
		case "give":
			if ((words[1].contentEquals( "vegemite") ) && (location == 3) && (words[2].contentEquals("Lucas")))
			{
				for (int i = 0; i < 17; i ++)
				{
					if (itemLoc[i] == 8 &&  words[1].contentEquals(itemName[i]))
					{
						System.out.println("Lucas' eyes brighten.  'Thanks!' he says, taking the vegemite from you.");
						System.out.println("Having trouble opening the jar with one hand holding the fan, he drops the to the ground.");
						characterLook[1] = "Lucas is the owner's son, and it's hard for you to see past that.  It's hard for Lucas to see past that as well.  Without his fan, he's significantly sweatier and worse smelling.";
						itemLoc[6] = 3;
						itemLoc[i] = 99;
						hadVegemite = 1;
						break;
					}				
				}

				if (hadVegemite == 0)
				{
					System.out.println("You don't have any.");
				}	
			}
			else
			{
				System.out.println("They don't want that.");
			}
			break;
// Since there is only one instance where the give command is useful, the program checks if that is currently the case.
// If so, it checks the player's inventory for the item in question, changes the location value of that item, and provides
// output for the event.
			
//	INVENTORY COMMAND		
		case "i":
			System.out.println("You are carrying:");
			for (int i = 0; i < 17; i++)
			{
				if (itemLoc[i] == 8)
				{
					System.out.println(itemDesc[i]);
				}
			}
// the inventory command is simple: it goes through each item to see if it is in the inventory location, then outputs the description if it is.
			break;
		case "inv":
			System.out.println("You are carrying:");
			for (int i = 0; i < 17; i++)
			{
				if (itemLoc[i] == 8)
				{
					System.out.println(itemDesc[i]);
				}
			}
			break;
		case "inventory":
			System.out.println("You are carrying:");
			for (int i = 0; i < 17; i++)
			{
				if (itemLoc[i] == 8)
				{
					System.out.println(itemDesc[i]);
				}
			}
			break;
// These cases list the player's inventory.

//	HELP COMMAND			
		case "help":
			Help(words);
			break;
// This case is used to access the help menu

//	DONE COMMAND			
		case "done":
			System.out.println("Thank you for playing!");
			play = 0;
			score = calcScore(itemLoc);
// This command calls a method to calculate the player's score, and outputs a message
			if (score == 75)
			{
				System.out.println("Congratulations!  You won!  With a total score of 75/75!");
			}
			else
			{
				System.out.println("You scored a total of " + score + "/75.");
			}
			break;
// This case is used when the player ends the game.
	
		default:
			System.out.println("Unknown command.");
			break;
		}
//  This case comes up if the first word typed in the command line does not match any commands		
		if (location == 6)
		{
			play = 0;
			System.out.println("You drowned!");
			score = calcScore(itemLoc);
			System.out.println("You scored a total of " + score + "/75.");	
		}		
// Traveling to location 6, the pool, drowns the player and ends the game.	
		
	}
}	// end of method
	
	static int moveNorth(int location)
	{
		
		if (location == 2)
		{
			location = 1;
		}
		else if (location == 3)
		{
			location = 2;
		}
		else
		{
			System.out.println("You cannot go that way.");
		}
		return location;
		
// The movement system is very basic.  Since the rooms are static, there are only certain directions that can be traveled in certain
// directions.  This code checks if the user is in a room with a north exit, and if they are, moves them to the room north of their
// current location.  If they're not, it provides feedback that they cannot go that way.
	}
	static int moveSouth(int location)
	{
		if (location == 2)
		{
			location = 3;
		}
		else if (location == 1)
		{
			location = 2;
		}
		else
		{
			System.out.println("You cannot go that way.");
		}		
		return location;
	}
// Same idea, moving South in this case.	
	static int moveEast(int location)
	{
		if (location == 2)
		{
			location = 7;
		}
		else if (location == 4)
		{
			location = 3;
		}
		else if (location == 1)
		{
			location = 0;
		}
		else
		{
			System.out.println("You cannot go that way.");
		}		
		return location;
	}
// Same idea, moving East in this case.	
	static int moveWest(int location)
	{
		if (location == 2)
		{
			location = 6;
		}
		else if (location == 7)
		{
			location = 2;
		}
		else if (location == 0)
		{
			location = 1;
		}
		else if (location == 3)
		{
			location = 4;
		}
		else
		{
			System.out.println("You cannot go that way.");
		}		
		return location;
	}
// Same idea, moving West in this case.		
	static int moveUp(int location)
	{
		if (location == 4)
		{
			location = 5;
		}
		else
		{
			System.out.println("You cannot go that way.");
		}		
		return location;
	}
// Same idea, moving up in this case.	
	static int moveDown(int location)
	{
		if (location == 5)
		{
			location = 4;
		}
		else
		{
			System.out.println("You cannot go that way.");
		}
		return location;
	}
// Same idea, moving down in this case.	
	static int calcScore(int[] itemLoc)
	{
		int tally = 0;
		for (int i = 0; i < 2; i++)
		{	
			if ((itemLoc[i] == 9) | (itemLoc[i] == 11))
			{
				tally = tally + 5;
			}
		}
		for (int i = 8; i < 14; i++)
		{	
			if ((itemLoc[i] == 0) | (itemLoc[i] == 11))
			{
				tally = tally + 10;
			}
		}
		if (itemLoc[2] != 13)
		{
			tally = tally + 5;
		}
		if (itemLoc[3] != 12)
		{
			tally = tally + 5;
		}
		if (itemLoc[4] != 9)
		{
			tally = tally + 5;
		}
		if (itemLoc[5] == 9)
		{
			tally = tally + 10;
		}
		if (itemLoc[6] == 11)
		{
			tally = tally + 5;
		}
		if (itemLoc[7] == 11)
		{
			tally = tally + 5;
		}
		if (itemLoc[14] == 6)
		{
			tally = tally + 5;
		}
		if (itemLoc[16] == 6)
		{
			tally = tally + 15;
		}
		return tally;
	}

// The help method mostly provides output and returns nothing
	static void Help(String[] words)
	{
		if (words.length > 0)
		{
			switch (words[1].toLowerCase())
			{
			case "move":
				System.out.println("You can move in any direction using the commands 'North', 'South', 'East', 'West', 'Up', or 'Down', though just the first letter works as well.  Be careful to read the room descriptions for potential hazards.");
				break;
			case "look":
				System.out.println("Look gives you more information about a room, object, person, or item.  You can 'look (target)' or just 'look' for rooms.");
				break;
			case "talk":
				System.out.println("People, they like to talk.  'talk (character)' to converse with them.");
				break;
			case "get":
				System.out.println("It's not stealing if it's virtual.  The command 'get (item)' with place the object in your inventory, if it is available and possible to carry.  If the item is in or on an object, use 'get (item) (object)'");
				break;
			case "put":
				System.out.println("They say it's better to Put than to Get.  'put' places an object on or in another object with 'put (item) (object)'");
				break;
			case "drop":
				System.out.println("This is how you can remove an item from your inventory, just to leave it lying about the room.  Like your college roommate.  Still, some quests do require this.  Use 'drop (item) to perform this action.");
				break;
			case "give":
				System.out.println("If someone wants something you have, this is your command.  Use 'give (item) (character) to perform this action.");
				break;
			case "inventory":
				System.out.println("This provides a list of everything you are currently carrying.  Use 'inventory', 'inv' or just 'i'");
				break;
			case "done":
				System.out.println("This ends the game!  If you have completed all your quests, or if you're just giving up.  You will also be told your score.  Type 'done' to perform this action.");
				break;
			default:
				System.out.println("Your goal in this game is to complete a series of tasks.  For more information about your tasks, talk to Gary.");
				System.out.println("For more information about available commands, type 'help' followed by any one of the following: move, look, talk, get, put, drop, inventory, done");
				System.out.println("Commands are not case sensitive, but names of people an objects are.");
				break;
			}
		}
		else
		{
			System.out.println("Your goal in this game is to complete a series of tasks.  For more information about your tasks, talk to Gary.");
			System.out.println("For more information about available commands, type 'help' followed by any one of the following: move, look, talk, get, put, drop, inventory, done");
			System.out.println("Commands are not case sensitive, but names of people an objects are.");
		}
// This set of cases provides the help menu.  It first checks if the player has typed more than one word in the help line.
// If so, it checks if they have requested help on a particular topic, and displays that information.  Or, if they have 
// typed only "help" or wrote a name the program doesn't recognize, the default help menu is displayed.
	}
}


