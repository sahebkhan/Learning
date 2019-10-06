import java.util.Arrays;

public class CharcterTest{

    public static void main(String ... atgs){

        int start = 48, end = 123;
        int []cnt = new int[end-start];
        int []cnt1 = new int[end-start];
        String a ="abbc";
        String b="cbabadcbbabbcbabaabccbabc";
        for(char c : a.toCharArray()){
            cnt[c - start]++;
        }
        char ch[] = b.toCharArray();
        for(int i =0; i < ch.length - a.length(); i ++){
            for(int j = i; j < a.length(); j++){
                cnt1[ch[j]]++;
            }
        }
        System.out.println(Arrays.toString(cnt));
    }
}