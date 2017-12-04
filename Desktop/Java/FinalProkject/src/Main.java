import java.util.ArrayList;

public class Main {
    public static void main(String args) {
        ArrayList<Rooms> rooms = new ArrayList<Rooms>(6);
        Rooms Dinobili = new Rooms();
        Rooms Damen = new Rooms();
        Rooms Cudahy = new Rooms();
        Rooms SanFran = new Rooms();
        Rooms Mundelein = new Rooms();
        Rooms LSB = new Rooms();

        rooms.add(Dinobili);
        rooms.add(Damen);
        rooms.add(Cudahy);
        rooms.add(SanFran);
        rooms.add(Mundelein);
        rooms.add(LSB);

        ArrayList <Suspects> suspects = new ArrayList<Suspects>(6);

        Suspects Madonna = new Suspects();
        Suspects Wilbur = new Suspects();
        Suspects Louis = new Suspects();
        Suspects Orville = new Suspects();
        Suspects Dilbert = new Suspects();
        Suspects Ingrid = new Suspects();

        suspects.add(Madonna);
        suspects.add(Wilbur);
        suspects.add(Louis);
        suspects.add(Orville);
        suspects.add(Dilbert);
        suspects.add(Ingrid);

        ArrayList <Weapons> weapons = new ArrayList <Weapons>(6);

        Weapons SharpPencil = new Weapons();
        Weapons PlasticBag = new Weapons();
        Weapons Shoelace = new Weapons();
        Weapons Flamethrower = new Weapons();
        Weapons Katana = new Weapons();
        Weapons Cannon = new Weapons();

        weapons.add(SharpPencil);
        weapons.add(PlasticBag);
        weapons.add(Shoelace);
        weapons.add(Flamethrower);
        weapons.add(Katana);
        weapons.add(Cannon);

    }
}