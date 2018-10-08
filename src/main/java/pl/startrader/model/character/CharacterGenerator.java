package pl.startrader.model.character;

public class CharacterGenerator {


    public Crew generateCrew(String skill){
        return new Crew("", 0, 0, 0);
    }

    //generateCustomCrew(...);
    //generateRandomCrew();


    public Administrator generateAdministrator(String skill) {
        return new Administrator("", 0, 0 ,0);
    }


    public Spy generateSpy(String skill) {
        return new Spy("", 0 ,0 ,0);
    }
}
