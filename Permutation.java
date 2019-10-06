
import java.util.BitSet;

public class Permutation{

    public static void main(String[] args){
       System.out.println( permu("how","woh"));
       System.out.println( permu("aabcdef","fdeacba"));
       System.out.println( permu("aabcdef","fdeacaa"));
    }

    public static boolean permu(String one,String two){
        boolean flg = true;
        int perm[] = new int[80],second[] = new int[80];
        if(one.length() == two.length()){
          for(char c: one.toCharArray()){
              perm[c-48]++;
          }
          for(char c: two.toCharArray()){
            second[c-48]++;
        }
            for(int index=0; index< perm.length; index++){
                if(perm[index] != second[index]){
                    flg=false;
                    break;
                }
            }
        }else{
            flg = false;
        }
        return flg;
    }

}