import Jinetes.Guerra;
import Jinetes.Hambre;
import Jinetes.Muerte;
import Jinetes.Peste;

public class Amagedon extends Jinetes {
	public static void main (String[] args) {
    Muerte  jinete1= new Muerte();
    Guerra  jinete2= new Guerra();
    Peste   jinete3= new Peste();
    Hambre  jinete4= new Hambre();
    System.out.print(jinete1.Invocar());
    System.out.println(jinete1.nombre);
    System.out.print(jinete2.Invocar());
    System.out.println(jinete2.nombre);
    System.out.print(jinete3.Invocar());
    System.out.println(jinete3.nombre);
    System.out.print(jinete4.Invocar());
    System.out.println(jinete4.nombre);
  }
}
