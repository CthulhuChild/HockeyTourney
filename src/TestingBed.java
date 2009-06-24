import org.junit.*;

import TourneyRegistry.StringParser;
import TourneyRegistry.TourneyRegistry;
import junit.*;

public class TestingBed
{

	StringParser parser;
	TourneyRegistry registry;
    @Before public void setUp() 
    { 
    	registry=new TourneyRegistry();
    	parser=new StringParser();    	    	
    } //end setup

    @Test  public void testStrings()
    {
    	
    	parser.parseCommand("help me");
    }
} //end testing bed
