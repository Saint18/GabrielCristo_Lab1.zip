import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PixelTest{


	@Test
	public void testPixelNoArgsConstructor() {
		// code that runs
		Pixel pixel = new Pixel();
		assertEquals(pixel.getXValue(), 0);
		assertEquals(pixel.getYValue(), 0);
        Color pixelColor = pixel.getColor();
      	assertEquals(0, pixelColor.getRValue());
      	assertEquals(0, pixelColor.getGValue());
      	assertEquals(0, pixelColor.getBValue());
	}

	@Test
	public void testTwoArgsConstructor() {
		// code that runs
		Pixel pixel = new Pixel(10, 13);
		assertEquals(pixel.getXValue(), 10);
		assertEquals(pixel.getYValue(), 13);
        Color pixelColor = pixel.getColor();
      	assertEquals(0, pixelColor.getRValue());
      	assertEquals(0, pixelColor.getGValue());
      	assertEquals(0, pixelColor.getBValue());
	}

	@Test
	public void testAllArgConstructor() {
		// code that runs
		Color color = new Color(50, 100, 150);
		Pixel pixel = new Pixel(1, 5, color);
		assertEquals(1, pixel.getXValue());
		assertEquals(5, pixel.getYValue());
      
        Color pixelColor = pixel.getColor();
      	assertEquals(50, pixelColor.getRValue());
      	assertEquals(100, pixelColor.getGValue());
      	assertEquals(150, pixelColor.getBValue());
	}

	
	  @Test
		public void testPixelColor() {
	      	Color color = new Color(50, 100, 150);
			Pixel pixel = new Pixel(color);
	        Color pixelColor = pixel.getColor();
	      	assertEquals(50, pixelColor.getRValue());
	      	assertEquals(100, pixelColor.getGValue());
	      	assertEquals(150, pixelColor.getBValue());
		}

	
	@Test
	public void testSetColor() {
		// code that runs
		Pixel pixel = new Pixel();
		Color color = new Color(50, 100, 150);
		pixel.setColor(color);
        Color pixelColor = pixel.getColor();
      	assertEquals(50, pixelColor.getRValue());
      	assertEquals(100, pixelColor.getGValue());
      	assertEquals(150, pixelColor.getBValue());
	}


	@Test 
    public void moveHorTest(){
        
    	Pixel pixel = new Pixel();
        pixel.setBorder(0, 100, 0, 100);
        pixel.moveHor(10);
        assertEquals(10, pixel.getXValue());
  }
  
@Test 
    public void moveVerTest(){
        
    	Pixel pixel = new Pixel();
        pixel.setBorder(0, 100, 0, 100);
        pixel.moveVer(10);
        assertEquals(10, pixel.getYValue());
  }
  
  

	@Test
  public void moveMeth(){
		Pixel pixel = new Pixel();
        pixel.setBorder(0, 100, 0, 100);
        pixel.moveMeth(10, 10);
        assertEquals(10, pixel.getXValue());
        assertEquals(10, pixel.getYValue());

  }
  

	@Test
  public void setBorderTest(){
		Pixel pixel = new Pixel();
		pixel.setBorder(0, 100, 0, 100);
		assertEquals(0, pixel.getMinXValue());
		assertEquals(100, pixel.getMaxXValue());
		assertEquals(0, pixel.getMinYValue());
		assertEquals(100, pixel.getMaxYValue());




  }


}