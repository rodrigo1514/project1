class InchesToFeet
{
public static void main(String[] args)
{
final int INCHES_IN_FEET = 12;
int inches = 86;
float ft, in;
ft = inches / INCHES_IN_FEET;
in = inches % INCHES_IN_FEET;
System.out.println(inches + " inches is " + ft +" and " + in + " inches" );
}
}