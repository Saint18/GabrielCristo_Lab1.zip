public class Pixel {
  private int x;
  private int y; 
  private Color color;
  private int minX;
  private int maxX;
  private int minY;
  private int maxY;
  
  
  public Pixel(){
    x = 0;
    y = 0;
    color = new Color();
  }
  
  public Pixel(int x, int y){
    this.x = x; 
    this.y = y;
    color = new Color();  
  }
  
  public Pixel(Color color){
    this();
    this.color = color; 
    
  }
  
  
  
  public Pixel(int x, int y, Color color){
    this(x, y);
    this.color = color;
  }
  
  
  public void printPixel(){
    System.out.println(x + "," + y);
    color.printColor();
  }
  
  
  public void moveHor(int x){
    if(checkHelper(this.x+x, y))
      this.x += x; 
  }
  
  public void moveVer(int y){
   if(checkHelper(x, this.y+y))
    this.y += y;
  }
  
  public void moveMeth(int x, int y){
    moveHor(x);
    moveVer(y);
  }
  
  public void setBorder(int minX, int maxX, int minY, int maxY){
    this.minX = minX;
    this.maxX = maxX;
    this.minY = minY;
    this.maxY = maxY;
    
  }
  
  
  public boolean checkHelper(int x, int y){
	  if(x < minX){
	      return false;
	    }
	    if(x > maxX){
	      return false;
	    }
	    if(y < minY){
	      return false;
	    }
	    if(y > maxY){
	      return false;
	    }
	    return true;
	  }
  
   public int getXValue(){
	     return x;
	   }
  
   public int getYValue(){
	    return y;
	  }
	  
   public int getMinXValue(){
		     return minX;
		   }
	  
   public int getMinYValue(){
		    return minY;
		  }
   
   public int getMaxXValue(){
	     return maxX;
	   }
   public int getMaxYValue(){
	    return maxY;
	  }
   public Color getColor() {
	   return color;
   }
   
	public void setColor(Color color){
        this.color = color;
    }
}