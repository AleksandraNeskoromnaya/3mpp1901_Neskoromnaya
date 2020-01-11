public class Point3d
{
  private  double point3dX;
  private  double point3dY;
  private  double point3dZ;
  public static void main(String[] args)
  {
    //для примера
    Point3d point3dOne=new Point3d(3,8,7);
    Point3d point3dTwo=new Point3d(1,2,3);
    Point3d point3dThree=new Point3d(3,8,7);
    System.out.format("%.2f%n", point3dOne.distanceTo(point3dTwo)); //Вывод в формате числа с 2мя знаками после запятой
        
  }
  public Point3d(double x,double y,double z) //Конструктор
  {
    point3dX=x;
    point3dY=y;
    point3dZ=z;
  }
  public Point3d() //Конструктор по умолчанию
  {
    this(0,0,0);
  }
  public double getX () //Вовращение координат
  {
    return point3dX;
  }
  public double getY ()
  {
    return point3dY;
  }
  public double getZ ()
  {
    return point3dZ;
  }
  public void setX (double newVal) //Установка координат
  {
    point3dX = newVal;
  }
  public void setY (double newVal)
  {
    point3dY = newVal;
  }
  public void setZ (double newVal)
  {
    point3dZ = newVal;
  }
  public boolean equalsTwoPoint(Object obj) //Сравнение точек покоординатно
  {
    Point3d tmp =(Point3d) obj;
    if(tmp.getX() == getX() && tmp.getY() == getY()&& tmp.getZ() == getZ())
      return true;
    else
      return false;
  }
  public  double distanceTo(Point3d two) //Расстояние между точками
  {
    double distance = Math.sqrt((Math.pow(two.getX() - this.getX(), 2) + Math.pow(two.getY() - this.getY(), 2) + Math.pow(two.getZ() - this.getZ(), 2)));
    return distance;
  }
}