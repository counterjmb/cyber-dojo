package hundreddoors;

/*
* 100 doors in a row are all initially closed.
* You make 100 passes by the doors.
* The first time through, you visit every door and toggle the door (if the door is closed, you open it; if it is open, you close it).
* The second time you only visit every 2nd door (door #2, #4, #6, ...).
* The third time, every 3rd door (door #3, #6, #9, ...), etc, until you only visit the 100th door.
*
* Question: What state are the doors in after the last pass? Which are open, which are closed?
*
* [Source http://rosettacode.org]
* */

public class Main {

    public static void main(String[] args) {

        System.out.println("Starting ");

        Door[] doors = new Door[101];

        //init
        for(int i = 1; i < doors.length; i++){
            doors[i] = new Door();
            doors[i].setId(i);
        }

        //recursiveDoors(1,doors);
        doorToggler(doors);


        //printAll(doors);
        printOpen(doors);


    }

    //failure
    public static void recursiveDoors(int x, Door[] doors){
        for(int i = 1; i < doors.length; i = (i + x)){
            doors[i].toggleDoor();
            recursiveDoors(i, doors);
        }
    }

    public static void doorToggler(Door[] doors){
        for(int i = 1; i < doors.length; i++){
            for(int j = i; j < doors.length; j += i){
                doors[j].toggleDoor();
            }
        }
    }

    public static void printAll(Door[] doors){
        for(int i = 1; i < doors.length; i++){
            System.out.println(doors[i].getDoorState());
        }
    }

    public static void printOpen(Door[] doors){
        for(int i = 1; i < doors.length; i++){
            if(doors[i].isOpen()){
                System.out.println(doors[i].getDoorState());
            }
        }
    }

}
