import java.util.Scanner;
public class Lab1
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    /*
    Point3d point3dOne=new Point3d(1,1,0);  // создание 3-х точек в пространстве
    Point3d point3dTwo=new Point3d(-2 ,4,0);
    Point3d point3dThree=new Point3d(-2,-2,0);
    */
    Point3d point3dOne=new Point3d();  //Создаем три точки
    Point3d point3dTwo=new Point3d();
    Point3d point3dThree=new Point3d();
    System.out.println("Fist point."+"\n" +" X=");
    point3dOne.setX(in.nextDouble());
    System.out.println(" y=");
    point3dOne.setY(in.nextDouble());
    System.out.println(" z=");
    point3dOne.setZ(in.nextDouble());
    System.out.println("Second point."+ "\n"  + "X=");
    point3dTwo.setX(in.nextDouble());
    System.out.println(" y=");
    point3dTwo.setY(in.nextDouble());
    System.out.println(" z=");
    point3dTwo.setZ(in.nextDouble());
    System.out.println("Three point." + "\n"  + "X=");
    point3dThree.setX(in.nextDouble());
    System.out.println("  y=");
    point3dThree.setY(in.nextDouble());
    System.out.println("  z=");
    point3dThree.setZ(in.nextDouble());
    if (point3dOne.equalsTwoPoint(point3dTwo) == true || point3dTwo.equalsTwoPoint(point3dThree) == true || point3dThree.equalsTwoPoint(point3dOne) == true)// проверка на существование треугольника
    {
      System.out.print("одна из точек равна другой, поэтому S=0");
    }
    else
    {
      System.out.println( "S= "+   computeArea(point3dOne,point3dTwo,point3dThree));//передача данных для расчёта площади треугольника
    }
  }
  public  static double computeArea(Point3d firstPoint,Point3d secondPoint, Point3d thirdPoint) //Считаем площадь по формуле Герона
  {
    double a= firstPoint.distanceTo(secondPoint); //Вычисляем длины сторон треугольника
    double b= secondPoint.distanceTo(thirdPoint);
    double c= thirdPoint.distanceTo((firstPoint));
    double P=(a+b+c)/2; //Полупериметр
    double s=Math.sqrt(P*(P-a)*(P-b)*(P-c));
    return  Math.round(s * 100) / 100.0;
    }
}