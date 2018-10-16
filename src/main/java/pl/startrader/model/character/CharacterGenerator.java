package pl.startrader.model.character;

public class CharacterGenerator {


    public static Crew generateCrew(String name){
        return new Crew(name, 0, 0, 0);
    }

    //generateCustomCrew(...);
    //generateRandomCrew();


    public static Administrator generateAdministrator() {
        return new Administrator("", 0, 0 ,0);
    }


    public static Spy generateSpy() {
        return new Spy("", 0 ,0 ,0);
    }
}
