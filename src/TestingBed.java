import static org.junit.Assert.*;

import org.junit.*;

import TourneyRegistry.StringParser;
import TourneyRegistry.TourneyRegistry;
import junit.*;

public class TestingBed
{

	StringParser parser;
	TourneyRegistry registry;
	String [] parsedCommands;
	String returnedOutput;
    @Before public void setUp() 
    { 
    	
    	parser=new StringParser();    	    	
    } //end setup

    @Test  public void testStringParsing()
    {   
    	
    	//standard case
    	parsedCommands=parser.parseCommand("AddTeam \"The Fighting Quackers\"");
    	assertTrue((parsedCommands.length==2)&&
    		   (parsedCommands[0].equals("AddTeam"))&&
    		   (parsedCommands[1].equals("The Fighting Quackers")));
    }
    @Test  public void testStringParsing1()
    {
    	//quote at start
    	parsedCommands=parser.parseCommand("\"AddTeam \"The Fighting Quackers\"");
    	//outputParsedCommands();
    	assertTrue((parsedCommands.length==2)&&
    		   (parsedCommands[0].equals("AddTeam"))&&
    		   (parsedCommands[1].equals("The Fighting Quackers")));
    }
    @Test  public void testStringParsing2()
    {    	
    	//missed a space
    	parsedCommands=parser.parseCommand("AddTeam\"The Fighting Quackers\"");
    	assertTrue((parsedCommands.length==2)&&
    		   (parsedCommands[0].equals("AddTeam"))&&
    		   (parsedCommands[1].equals("The Fighting Quackers")));
    }
    @Test  public void testStringParsing3()
    {
    	//no quotes
    	parsedCommands=parser.parseCommand("AddTeam The Fighting Quackers");
    	assertTrue((parsedCommands.length==4)&&
    		   (parsedCommands[0].equals("AddTeam"))&&
    		   (parsedCommands[1].equals("The"))&&
    		   (parsedCommands[2].equals("Fighting"))&&
    		   (parsedCommands[3].equals("Quackers")));
    }
    @Test  public void testStringParsing4()
    {
    	//unquoted phrase added before
    	parsedCommands=parser.parseCommand("AddTeam 52 \"The Fighting Quackers\"");
    	assertTrue((parsedCommands.length==3)&&
    		   (parsedCommands[0].equals("AddTeam"))&&
    		   (parsedCommands[1].equals("52"))&&
    		   (parsedCommands[2].equals("The Fighting Quackers")));
    }
    @Test  public void testStringParsing5()
    {
    	//unquoted phrase added after
    	parsedCommands=parser.parseCommand("AddTeam \"The Fighting Quackers\" 52");
    	assertTrue((parsedCommands.length==3)&&
    		   (parsedCommands[0].equals("AddTeam"))&&
    		   (parsedCommands[1].equals("The Fighting Quackers"))&&
    		   (parsedCommands[2].equals("52")));
    }
    @Test  public void testStringParsing6()
    {
    	//two quoted phrases
    	parsedCommands=parser.parseCommand("AddTeam \"The Fighting Quackers\" \"yar\"");
    	assertTrue((parsedCommands.length==3)&&
    		   (parsedCommands[0].equals("AddTeam"))&&
    		   (parsedCommands[1].equals("The Fighting Quackers"))&&
    		   (parsedCommands[2].equals("yar")));
    }
    @Test  public void testStringParsing7()
    {
    	//	two quoted phrases, 1 unquoted before
    	parsedCommands=parser.parseCommand("AddTeam 52 \"The Fighting Quackers\" \"yar\"");
    	assertTrue((parsedCommands.length==4)&&
    		   (parsedCommands[0].equals("AddTeam"))&&
    		   (parsedCommands[1].equals("52"))&&
    		   (parsedCommands[2].equals("The Fighting Quackers"))&&
    		   (parsedCommands[3].equals("yar")));
    }
    @Test  public void testStringParsing8()
    {
    	//	two quoted phrases, 1 unquoted middle
    	parsedCommands=parser.parseCommand("AddTeam \"The Fighting Quackers\" 52 \"yar\"");
    	assertTrue((parsedCommands.length==4)&&
    		   (parsedCommands[0].equals("AddTeam"))&&
    		   (parsedCommands[1].equals("The Fighting Quackers"))&&
    		   (parsedCommands[2].equals("52"))&&
    		   (parsedCommands[3].equals("yar")));
    }
    @Test  public void testStringParsing9()
    {
    	// 	two quoted phrases, 1 unquoted end
    	parsedCommands=parser.parseCommand("AddTeam \"The Fighting Quackers\" \"yar\" 52");
    	assertTrue((parsedCommands.length==4)&&
    		   (parsedCommands[0].equals("AddTeam"))&&
    		   (parsedCommands[1].equals("The Fighting Quackers"))&&
    		   (parsedCommands[2].equals("yar"))&&
    		   (parsedCommands[3].equals("52")));
    }
    
    @Test  public void TourneyRegistry()   
    {
    	//garbage input
    	registry=new TourneyRegistry();
    	returnedOutput=registry.runCommand("asdasd sdf sdasd asd \" dsd \" ");
    	System.out.println(returnedOutput);
    	assertTrue(returnedOutput.equalsIgnoreCase("The command \"asdasd\" was not recognized."));
    }
} //end testing bed
