package practice4.t3.app;
import practice4.t3.model.*;
public class App {

	public static void getStatistics(Game g) {
        g.a();
        g.b();
        g.c();
    }
	public static void main(String[] args) {
	        Game g1 = new LogicGame();
	        Game g2 = new MemoryGame();

	        getStatistics(g1);
	        System.out.println();
	        getStatistics(g2);
	        
//	        System.out.println();
//	        
//	        iPhone phone = new iPhone();
//	        phone.sell();
//	        phone.plugIn();
	        
	}

}
