package solution;


public class GameNodes {
	FrameNode startScreen;
	FrameNode[] startScreenLink;
	FrameNode cursor;
	
	FrameNode carillon;
	FrameNode[] carillonlink;
	
	FrameNode carillon2;
	FrameNode[] carillonlink2;
	
	FrameNode home;
	FrameNode[] homeLink;
	
	FrameNode hogs;
	FrameNode[] hogLinks;
	
	FrameNode noHogs;
	FrameNode[] noHogLinks;
	
	FrameNode town1;
	FrameNode[] town1Links;
	
	FrameNode grocer;
	FrameNode[] grocerLinks;
	
	FrameNode armory;
	FrameNode[] armoryLinks;

	
	FrameNode butcher;
	FrameNode[] butcherLink;
	
	FrameNode sale;
	FrameNode[] saleLink;
	
	FrameNode flute;
	FrameNode[]fluteLinks;
	
	FrameNode slaughter;
	FrameNode[] slaughterLink;
	
	FrameNode swanson;
	FrameNode[] swansonLink;
	FrameNode pickett;
	FrameNode[] pickettLink;
	FrameNode loch;
	FrameNode[] lochLink;
	FrameNode bragg;
	FrameNode[] braggLink;
	FrameNode mountains;
	FrameNode[] mountainsLink;
	
	
	public GameNodes() 
	{
		
		grocerLinks = new FrameNode[1];
		grocer = new FrameNode(grocerLinks, "data/town1map.txt", "data/grocer.txt");
		
		armoryLinks = new FrameNode[1];
		armory = new FrameNode(armoryLinks, "data/town1map.txt", "data/grocer.txt");
		saleLink = new FrameNode[1];
		sale = new FrameNode(saleLink, "data/town1map.txt", "data/sale.txt");
		butcherLink = new FrameNode[2];
		butcher = new FrameNode(butcherLink, "data/town1map.txt", "data/butcher.txt");
		
		town1Links = new FrameNode[3];
		town1 = new FrameNode(town1Links, "data/town1map.txt", "data/town1.txt");
		
		noHogLinks = new FrameNode[2];
		noHogs = new FrameNode(noHogLinks, "data/home.txt", "data/noHogs.txt");
		
		slaughterLink = new FrameNode[2];
		slaughter = new FrameNode(slaughterLink, "data/home.txt", "data/slaughter.txt");
		
		hogLinks = new FrameNode[2];
		hogs = new FrameNode(hogLinks, "data/home.txt", "data/hogs1.txt");
		//hogs.setLink(0, home);
		//hogs.setLink(1, flute);
		
		
		fluteLinks = new FrameNode[1];
		flute = new FrameNode(fluteLinks, "data/home.txt", "data/flute.txt");
		flute.setLink(0, slaughter);
		
		
		homeLink = new FrameNode[1];
		homeLink[0] = hogs;
		home = new FrameNode(homeLink, "data/home.txt", "data/homeText.txt");
		home.setLink(0, hogs);
		
		carillonlink = new FrameNode[6];
		carillonlink[0] = swanson;
		carillonlink[1] = pickett;
		carillonlink[5] = home;
		carillon = new FrameNode(carillonlink, "data/Map1.txt", "data/Carillon1.txt");
		carillon.setLink(0, swanson);
		carillon.setLink(1, pickett);
		carillon.setLink(5, home);
		
		startScreenLink = new FrameNode[1];
		startScreen = new FrameNode(startScreenLink, "data/startScreen.txt",
				"WELCOME TO GIANT SLAYER! ENTER YOUR CHARACTER NAME BELOW: ");
		startScreen.setLink(0, home);
		cursor = startScreen;
		hogs.setLink(0, slaughter);
		hogs.setLink(1, flute);
		slaughter.setLink(0, slaughter);
		slaughter.setLink(1, town1);
		noHogs.setLink(0, town1);
		noHogs.setLink(1, flute);
		town1.setLink(0, butcher);
		butcher.setLink(0, sale);
		sale.setLink(0, town1);
		town1.setLink(1, grocer);
		town1.setLink(2, armory);
		grocer.setLink(0, town1);
		armory.setLink(0, town1);
		
		
		
		
	}
	public FrameNode getCursor() 
	{
		return cursor;
	}


}
