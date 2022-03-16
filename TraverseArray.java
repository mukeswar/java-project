import java.util.Arrays;
public class TraverseArray{

public static void main(String args[]){

int myArray[]=new int[5];
 myArray[0]=1234;
 myArray[1]=7866;
 myArray[2]=8977;
 myArray[3]=8099;
 myArray[4]=3234;
 
 System.out.println("Contents of the array:");
 for(int element : myArray){
 System.out.println(element);
 }
 }
 }