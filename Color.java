public class Color{
  private int RValue;
  private int GValue;
  private int BValue;
  private static final int MAX = 255;
  private static final int MIN = 0;					
  
  public static void main(String[] args) {
  }
  
  public int getRValue(){
    return RValue;
  }
  
    public int getBValue(){
    return BValue;
  }
  
    public int getGValue(){
    return GValue;
  }
  
  
    private int checkRange(int newValue){
    if(newValue >= MIN && newValue <= MAX){
      return newValue;
    }
    return MIN;
  }
  
  
    public void setRValue(int newValue){
    RValue = checkRange(newValue);
  }

    public void setBValue(int newValue){
    BValue = checkRange(newValue);
  }
  
    public void setGValue(int newValue){
    GValue = checkRange(newValue);
  }
  
  public Color(){
    RValue = MIN;
    BValue = MIN;
    GValue = MIN;
  }
  
  public Color(int R, int G, int B){
    setRValue(R);
    setGValue(G);
    setBValue(B);
    
  }
  
  public void printColor(){
    System.out.println(RValue + "," + GValue + "," + BValue);
  }
  
  public boolean isBlack(){
    return RValue == MIN && GValue == MIN && BValue == MIN;
  }
  
  public boolean isWhite(){
    return RValue == MAX && GValue == MAX && BValue == MAX;
  }
  
  public void combineColor(Color otherColor){
    setRValue( RValue + otherColor.getRValue() );
    setBValue( BValue + otherColor.getBValue() );
    setGValue( GValue + otherColor.getGValue() );
    
  }

}