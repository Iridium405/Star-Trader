package pl.startrader;


import pl.startrader.model.character.Crew;
import pl.startrader.model.heavenly_body.Planet;
import pl.startrader.model.starship.HullType;
import pl.startrader.model.starship.Starship;

public class Main {

    public static void main(String[] args) {

        Planet ziemia = new Planet("Ziemia", 10,0.0, 0.0, 0.0);
        Planet thetaTauri = new Planet("Theta Tauri", 15, 9.0, 12.0, 7.0);
        Planet muHerculis = new Planet("Mu Herculis", 7, -4.0, -15.0,8.0);

        Starship statek = new Starship("Statek-01", HullType.CLARINET);
        statek.setCurrentlyStationed(ziemia);


        Crew janusz = new Crew("Janusz Bombowiec", 3, 1,1);
        Crew zdzich = new Crew("Zdzichu Mechanik", 0, 0, 4);

        statek.addCrewMember(janusz);
        statek.addCrewMember(zdzich);

        System.out.println(statek.getCrewMembersList() + "\n");

        statek.travel(thetaTauri);

        statek.travel(muHerculis);

    }

}
