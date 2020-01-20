/**
 * 
 */

/**
 * @author mausan
 *
 */
public class TestApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario user1 = new Usuario(5852555, "LDLSKSLK", "SDKHÑDFSAHSD", 544654654);
	
		Aplicaciones app1 = new Aplicaciones("google");
		
		Usuario user2 = new Usuario(88987, "Nicolas", "Chile", 987987);
		Aplicaciones app2 = new Aplicaciones("yahoo");
		
		
	
		System.out.println(user1.toString() +"\n" + app1.toString());
		System.out.println("--------------");
		System.out.println(user2.toString() +"\n"+ app2.toString() );
	}

}
