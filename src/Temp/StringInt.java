package Temp;

public class StringInt {
    public static void main(String args[]){
        String a = "1 2 3 4 5";
        char[] arr = a.toCharArray();
        for(int i=0; i< arr.length;i++){
            if(arr[i] != 32) {
                //System.out.println(Integer.parseInt(arr[i]));
            }
        }
    }
}
