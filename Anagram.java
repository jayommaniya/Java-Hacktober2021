import java.util.*;
class Anagram{
    public static void main(String[] args){
        String a, b; // Objects of String class  
        boolean isAnagram=true;
        int arr[]= new int[256];

        Scanner in = new Scanner(System.in);   
        System.out.println("Program to check if it is a Anagram\n");  
        System.out.print("a : ");  
        a = in.nextLine();  
        System.out.print("b : ");
        b = in.nextLine();  

        for(char c:a.toCharArray()){
            int index= (int) c;
            arr[index]++;
        }
        for(char c:b.toCharArray()){
            int index= (int) c;
            arr[index]--;
        }
        for(int i=0;i<256;i++){
            if(arr[i]!=0){
                isAnagram=false;
            }
        }
        
        if(isAnagram){
            System.out.println("\nIt is anagram");

        }
        else{
            System.out.println("\nIt is not anagram");
        }
    }

}