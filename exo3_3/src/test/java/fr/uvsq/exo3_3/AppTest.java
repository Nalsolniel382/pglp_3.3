package fr.uvsq.exo3_3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest 
    
{
    
   
    @Test
	public void robotAvanceNord()
	{	
		Position p1 = new Position();
		Robot r1 = new Robot(p1,Direction.nord);
		r1.avencer();
		
		assertEquals(r1.getP().getY(),1);
		
	}
	
	@Test
	public void robotAvanceEst()
	{	
		Position p1 = new Position(1,1);
		Robot r1 = new Robot(p1,Direction.est);
		r1.avencer();
		
		assertEquals(r1.getP().getX(),2);
	}
	
	@Test
	public void robotAvanceSud()
	{	
		Position p1 = new Position(10,10);
		Robot r1 = new Robot(p1,Direction.sud);
		r1.avencer();
		
		
		assertEquals(r1.getP().getY(),9);
	}
	
	@Test
	public void robotAvanceOuest()
	{	
		Position p1 = new Position(15,15);
		Robot r1 = new Robot(p1,Direction.ouest);
		r1.avencer();
		
		
		assertEquals(r1.getP().getX(),14);
	}
	
	
	@Test
	public void robotTourneDepuisNord()
	{	
		Position p1 = new Position();
		Robot r1 = new Robot(p1,Direction.nord);
		r1.tourner();
		
		assertEquals(r1.getD(),Direction.est);
	}
	
	@Test
	public void robotTourneDepuisEst()
	{	
		Position p1 = new Position();
		Robot r1 = new Robot(p1,Direction.est);
		r1.tourner();
		
		assertEquals(r1.getD(),Direction.sud);
	}
	
	@Test
	public void robotTourneDepuisSud()
	{	
		Position p1 = new Position();
		Robot r1 = new Robot(p1,Direction.sud);
		r1.tourner();
		
		assertEquals(r1.getD(),Direction.ouest);
	}
	
	@Test
	public void robotTourneDepuisOuest()
	{	
		Position p1 = new Position();
		Robot r1 = new Robot(p1,Direction.ouest);
		r1.tourner();
		
		assertEquals(r1.getD(),Direction.nord);
	}
	
    
    
}
