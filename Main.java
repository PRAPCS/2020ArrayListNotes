import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // Create a dynamic array indicating the types of things it will store
    ArrayList<Integer> nums = new ArrayList<Integer>();
    // fill the ArrayList with values
    for (int i = 0; i < 4; i++) {
      nums.add(i);//appends on the the end of the arraylist 
    }

    nums.set(3,10);//places a 10 at index 3
    nums.add(1,7);//add a 7 in location 1 and move everyone else down
    nums.add(20);
    nums.remove(3);//removes the value at location 3 and moves everyone else down
   
    // Print all items in the ArrayList
    for (int j = 0; j < nums.size(); j++) {
      System.out.println(nums.get(j));//gets the value at the index j
    }

     ArrayList<Cars>garage = new ArrayList<Cars>();

     Cars car1 = new Cars("Red",32);
     garage.add(car1);
     garage.add(new Cars("Blue",42));

     for(int i=0;i<garage.size();i++){
       Cars temp = garage.get(i);
       System.out.println(temp);
     }

     for(Cars c:garage){
       System.out.println(c);
     }




  }
}