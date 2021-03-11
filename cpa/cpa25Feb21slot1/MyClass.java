/**

 @author  sd
 Date : 11/03/2021
 CPAFeb25slot1_2021
 
Input:

101
Arun
12-mar-2020
2
veg
5000
102
Karan
13-apr-2020
1
veg
2300
103
manu
11-Mar-2020
3
veg
7500
104
Ritu
15-Jan-2020
1
veg
1200
mar
veg

Output:

2
101


Input:

101
Kamal
12-sep-2020
2
veg
5000
102
Sudha
13-apr-2020
1
non-veg
2300
103
Vipin
11-apr-2020
3
non-veg
7500
104
jagdeep
15-Jun-2020
1
veg
1200
mar
vegan

Output:

No rooms booked
No such meal

 */

 import java.util.*;
import java.lang.*;
public class MyClass{
    public static void main(String[] args){
        int guestId;
        String guestName;
        String dateOfBooking;
        int noOfRoomsBooked;
        String mealOption;
        double totalBill;
        Scanner s = new Scanner(System.in);
        ResortGuest[] resortGuests = new ResortGuest[4];
        for(int i=0; i<resortGuests.length; i++){
            guestId = s.nextInt();s.nextLine();
            guestName = s.nextLine();
            dateOfBooking = s.nextLine();
            noOfRoomsBooked = s.nextInt();s.nextLine();
            mealOption = s.nextLine();
            totalBill = s.nextDouble();
            resortGuests[i] = new ResortGuest(guestId, guestName, dateOfBooking, noOfRoomsBooked, mealOption, totalBill);
        }
        s.nextLine();
        String month = s.nextLine();
        String mealOpted = s.nextLine();
        s.close();

        int roomsBooked = findNumberOfRoomsBookedInMonth(resortGuests, month);
        if(roomsBooked == 0)
            System.out.println("No rooms booked");
        else
            System.out.println(roomsBooked);

        ResortGuest resortGuest = searchResortGuestByMealOpted(resortGuests, mealOpted);
        if(resortGuest == null)
            System.out.println("No such meal");
        else
            System.out.println(resortGuest.getGuestId());
    }
    public static int findNumberOfRoomsBookedInMonth(ResortGuest[] resortGuests, String month){
        int countOfRoomsBooked = 0;
        for(ResortGuest resortGuest: resortGuests){
            String tempMonth = resortGuest.getDateOfBooking().substring(3,6);
            if(tempMonth.equalsIgnoreCase(month))
                countOfRoomsBooked++;
        }
        return countOfRoomsBooked;
    }
    public static ResortGuest searchResortGuestByMealOpted(ResortGuest[] resortGuests, String mealOpted){
        List<ResortGuest> tempList = new ArrayList<ResortGuest>();
        for(ResortGuest resortGuest: resortGuests){
            if(resortGuest.getMealOption().equalsIgnoreCase(mealOpted)){
                tempList.add(resortGuest);
            }
        }
        if(tempList.size() == 0) return null;
        Collections.sort(tempList, new Comparison());
        return tempList.get(tempList.size()-2);
    }
}
class Comparison implements Comparator<ResortGuest>{
    public int compare(ResortGuest obj1, ResortGuest obj2){
        return (int)(obj1.getTotalBill() - obj2.getTotalBill());
    }
}
