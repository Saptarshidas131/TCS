/**
 @author  sd
 Date : 11/03/2021
 CPAFeb25slot2_2021 
 
    Input:

211
National Rail Museum
Delhi
1977
4.4
false
456
National Museum
Delhi
1949
4.6
true
123
Government Museum
Chennai
1851
4.3
true
055
Salar Jung Museum
Hyderabad
1951
4.4
true
065
National Crafts Museum
Delhi
1956
4.5
true
Delhi
4.5

    Output:

2
National Crafts Museum
1956
    
 */

import java.util.*;
import java.lang.*;
public class MyClass{
    public static void main(String[] args){
        int museumId;
        String museumName;
        String museumLocation;
        int established;
        double rating;
        boolean researchCentre;
        Scanner s = new Scanner(System.in);
        Museum[] museums = new Museum[5];
        for(int i=0; i<museums.length; i++){
            museumId = s.nextInt();s.nextLine();
            museumName = s.nextLine();
            museumLocation = s.nextLine();
            established = s.nextInt();
            rating = s.nextDouble();
            researchCentre = s.nextBoolean();
            museums[i] = new Museum(museumId, museumName, museumLocation, established, rating, researchCentre);
        }
        s.nextLine();
        String newLocation = s.nextLine();
        double newRating = s.nextDouble();
        s.close();

        int countOfResearch = getCountOfResearchBasedOnRating(museums, newRating);
        if(countOfResearch == 0)
            System.out.println("No such Museums");
        else
            System.out.println(countOfResearch);

        Museum museum = getSecondOldMuseumBasedOnLocation(newLocation, museums);
        if(museum == null)
            System.out.println("No matching museum");
        else{
            System.out.println(museum.getMuseumName()+"\n"+museum.getEstablished());
        }
    }
    public static int getCountOfResearchBasedOnRating(Museum[] museums, double rating){
        int countOfResearch = 0;
        for(Museum museum: museums){
            if(museum.isResearchCentre()){
                if(museum.getRating() >= rating){
                    countOfResearch++;
                }
            }
        }
        return countOfResearch;
    }
    public static Museum getSecondOldMuseumBasedOnLocation(String location, Museum[] museums){
        List<Museum> newList = new ArrayList<Museum>();
        for(Museum museum: museums){
            if(museum.getMuseumLocation().equalsIgnoreCase(location)){
                newList.add(museum);
            }
        }
        if(newList.size() <= 1) return null;
        Collections.sort(newList, new SortingMuseum());
        return newList.get(newList.size()-2);
    }
}

class SortingMuseum implements Comparator<Museum>{
    public int compare(Museum obj1, Museum obj2){
        return (int)(obj1.getEstablished() - obj2.getEstablished());
    }
}
