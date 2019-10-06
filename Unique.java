
public class Unique{


    public static void main(String[] args){
            char[] str = "how are you and what is going on ?".toCharArray();
            boolean b=true;
            for(int i =0; i < str.length; i ++){
                for(int j =i+1; j < str.length; j++){
                    if(str[i] == str[j])
                        b= false;
                }
            }
            System.out.println(b);
    }
}