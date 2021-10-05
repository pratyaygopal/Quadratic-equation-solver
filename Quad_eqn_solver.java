import java.util.*;
public class Quad_eqn_solver
{
    public static void quad ()
    {
        Scanner in = new Scanner(System.in);
        double a,b,c,dis,sq_d,x1,x2,xnum,disx = 0 ;
        int d = 0;
        System.out.print('\u000C');
        System.out.println("The equation is in the form of ax^2 + bx + c = 0");
        System.out.println("Enter the values of a, b and c :");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();

        dis = (b*b) - (4 * a * c);  //This is the discriminant
        sq_d = Math.sqrt(dis);   //This is the sqrt of the discriminant
        x1 = (-b + sq_d) / (2 * a); //one root
        x2 = (-b - sq_d) / (2 * a); //second root
        disx = dis/(a*2);
        xnum = -b / (a*2);
        d = (int)dis ;
        
        if (d<0){
            System.out.println("x1 value =" + xnum + " + square root of " + disx);
            System.out.println("x2 value =" + xnum + " - square root of " + disx);
            System.out.println("Discriminant Value = " + dis);
        }
        else{
            if(sq_d%1 != 0){
                System.out.println("x1 value =" + xnum + " + square root of " + disx);
                System.out.println("x2 value =" + xnum + " - square root of " + disx);
                System.out.println("Discriminant Value = " + dis);
                }    
            else{
                System.out.println("x1 value =" + x1);
                System.out.println("x2 value =" + x2);
                System.out.println("Discriminant Value = "+ dis);   
                }       
            }
        }
    }

