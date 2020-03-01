package assignment08;

public class muno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbs1 = {3, 8, 12, 2, 9, 17, 43, -8, 46};
        System.out.println("isUnique returns: " + isUnique(numbs1));
        int[] numbs2 = {4, 7, 3, 9, 12, -47, 3, 74};
        System.out.println("isUnique returns: " + isUnique(numbs2));
    }
    
    public static boolean isUnique(int[] a){
        for (int i = 0; i < a.length; i++){
            for(int j = i + 1;j < a.length; j++){
                if(a[i] == a[j]){
                    return false;
                }
            }
        }
        return true;
 

	}

}
