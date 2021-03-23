package javaprogrammingmasterclass.section09.video127.memberinnerclasses;

public class GearBoxMain {
    public static void main(String[] args) {
        Gearbox bmw = new Gearbox(6);
        bmw.operateClutch(true);
        bmw.changeGear(1);
        bmw.operateClutch(false);
        System.out.println(bmw.wheelSpeed(1000));
        bmw.changeGear(2);
        System.out.println(bmw.wheelSpeed(3000));
        bmw.operateClutch(true);
        bmw.changeGear(3);
        bmw.operateClutch(false);
        System.out.println(bmw.wheelSpeed(6000));
    }

}
