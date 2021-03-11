/**

 @author  sd
 Date : 11/03/2021
 CPAFeb15_2021
 
 Input:

    1008
    Aman
    29 
    true
    cons1
    1003
    Saman
    43
    true
    cons1
    1004
    Kamal
    28
    false
    cons2
    1005
    Ritu
    48
    true
    cons1
    Cons1

 Output:

    3
    1004
    1008
 
 Input:

    1002
    Aman
    35
    true
    cons1
    1003
    Saman
    43
    true
    cons1
    1004
    Kamal
    48
    false
    cons2
    1005
    Ritu
    52
    true
    cons1
    Cons2

 Output:

    No voters casted
    No such voters
 
 */

import java.util.*;
import java.lang.*;

public class MyClass{
    public static void main(String[] args){
        int voterId;
        String voterName;
        int voterAge;
        boolean isVoteCasted;
        String constituency;
        Scanner scanner = new Scanner(System.in);
        Vote[] votes = new Vote[4];
        for(int i=0; i<votes.length; i++){
            voterId = scanner.nextInt();scanner.nextLine();
            voterName = scanner.nextLine();
            voterAge = scanner.nextInt();
            isVoteCasted = scanner.nextBoolean();scanner.nextLine();
            constituency = scanner.nextLine();
            votes[i] = new Vote(voterId, voterName, voterAge, isVoteCasted, constituency);
        }
        String checkConstituency = scanner.nextLine();
        scanner.close();
        int totalVotesCasted = findTotalVotesCastedByConstituency(votes, checkConstituency);
        if(totalVotesCasted == 0)
            System.out.println("No votes casted");
        else
            System.out.println(totalVotesCasted);
        int[] voterAgeArray = searchVoterByAge(votes);
        if(voterAgeArray == null)
            System.out.println("No such voters");
        else
            for(int voter: voterAgeArray)
                System.out.println(voter);
    }
    public static int findTotalVotesCastedByConstituency(Vote[] votes, String constituency){
        int totalVotesCasted = 0;
        for(Vote vote: votes){
            if(constituency.equalsIgnoreCase(vote.getConstituency())){
                if(vote.getIsVoteCasted())
                    totalVotesCasted++;
            }
        }
        return totalVotesCasted;
    }
    public static int[] searchVoterByAge(Vote[] votes){
         ArrayList<Integer> arrayOfVoterIdList = new ArrayList<Integer>();
         for(Vote vote: votes){
             if(vote.getVoterAge() < 30){
                 arrayOfVoterIdList.add(vote.getVoterId());
             }
         }
         if(arrayOfVoterIdList.size() == 0) return null;
         Collections.sort(arrayOfVoterIdList);
         int[] array = arrayOfVoterIdList.stream().mapToInt(i -> i).toArray();
         return array;
    }
}
