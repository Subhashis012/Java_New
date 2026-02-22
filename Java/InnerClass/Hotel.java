package Java.InnerClass;

public class Hotel {
    private String name;
    private int totalRoom;
    private int reservedRooms;

    public Hotel(String name, int totalRoom, int reservedRooms) {
        this.name = name;
        this.totalRoom = totalRoom;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){
        class ReservationValidator{
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name can not be empty");
                    return false;
                }
                if(numOfRooms <= 0){
                    System.out.println("Number of rooms can not be less than zero");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRoom){
                    System.out.println("Reserved rooms can not be greater than total rooms");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()){
            reservedRooms += numOfRooms;
            System.out.println("Reservation Confirm for " + guestName + " for " + numOfRooms + " rooms");
        }else{
            System.out.println("Reservation failed");
        }
    }
}
