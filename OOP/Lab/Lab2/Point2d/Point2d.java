public class Point2d 
{
  private double xCoord;
  private double yCoord;
  public Point2d ( double x, double y) //Конструктор инициализации 
  {
    xCoord = x;
    yCoord = y;
  }
  public Point2d () //Конструктор по умолчанию
  {
    this(0, 0);
  }
  public double getX () 
  {
     return xCoord;
  }
  public double getY () 
  {
     return yCoord;
  }
  public void setX ( double val) 
  {
     xCoord = val;
  }
  public void setY ( double val) 
  {
     yCoord = val;
  }
  public static void main(String[] args) 
  {
     Point2d firstPoint = new Point2d();
     Point2d secondPoint = new Point2d(5,3);
     Point2d thirdPoint = new Point2d();
     if (firstPoint.equals(secondPoint))
     {
       System.out.println("the same points");
     }
     else
     {
       System.out.println("not the same");
     }
  }
  public boolean equals(Object obj)
  {
    Point2d tmp =(Point2d)obj;
    if(tmp.getX() == getX() && tmp.getY() == getY())
      return true;
    else
      return false;
  }
}