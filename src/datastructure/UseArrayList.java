package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

        ArrayList<Object> arr = new ArrayList<>();
        arr.add("Cali");
        arr.add("SunF");
        arr.add("Ver");
        arr.add("Fl");
        //arr.remove("Ver");

        // connect
        ConnectDB connectDB = new ConnectDB();
        connectDB.InsertDataFromArrayListToMySql(arr, "User", "Name" );
        connectDB.readDataBase("User", "Name");

//        Iterator it = arr.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//        for (Object n : arr) {
//            System.out.println(n);
//        }



    }
}
