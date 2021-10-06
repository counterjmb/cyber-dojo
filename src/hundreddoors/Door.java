package hundreddoors;

public class Door {

    private boolean open;
    private int id;


    public Door() {
        open = false;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }


    public boolean isOpen() {
        return open;
    }

    public void closeDoor() {
        open = false;
    }

    public void openDoor() {
        open = true;
    }

    public void toggleDoor() {
        if (open) {
            closeDoor();
        } else {
            openDoor();
        }
    }

    public String getDoorState() {
        String state;
        if (open) {
            state = "open";
        } else {
            state = "closed";
        }
        return "Door " + id + " is " + state + ".";
    }
}
