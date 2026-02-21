package lab1.task5;

public class DragonLaunchTest {

    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();
        launch.kidnap(new Person(Gender.BOY));
        launch.kidnap(new Person(Gender.BOY));
        launch.kidnap(new Person(Gender.GIRL));
        launch.kidnap(new Person(Gender.GIRL));
        System.out.println("BBGG: will dragon eat? " + launch.willDragonEatOrNot());

        launch = new DragonLaunch();
        launch.kidnap(new Person(Gender.GIRL));
        launch.kidnap(new Person(Gender.GIRL));
        launch.kidnap(new Person(Gender.BOY));
        launch.kidnap(new Person(Gender.GIRL));
        System.out.println("GGBG: will dragon eat? " + launch.willDragonEatOrNot());
        System.out.print("Remaining: ");
        for (Person p : launch.getPeople()) {
            System.out.print(p);
        }
        System.out.println(); 
    }

}
