import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){

        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(10);
        lists.add(20);
        lists.add(2,44);
        //check size
        System.out.println(lists.size());
        // Check element
        System.out.println(lists.contains(20));
        System.out.println(lists);
        //arralist traverse
        for(int i = 0; i<lists.size(); i++){
            System.out.println(lists.get(i));
        }
        //Enhanced for loop
        //for (int num : list) {
        //    System.out.println(num);
        //}

    }
}
//Function      	Purpose
//add(value)	Adds an element
//add(index, value)	Adds at a specific index
//get(index)	Returns an element
//set(index, value)	Updates an element
//remove(index)	Removes by index
//remove(Integer.valueOf(x))	Removes by value
//size()	Returns number of elements
//contains(x)	Checks if element exists
//indexOf(x)	Returns first index
//isEmpty()	Checks if list is empty
//clear()	Removes all elements
//toArray()	Converts list to array