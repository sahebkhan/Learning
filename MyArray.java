
import java.util.Arrays;

public final class MyArray{

    private char[] source;

    private int size =0;

    public MyArray(){
        source = new char[16];
        StringBuilder sb = new StringBuilder();
    }


    public MyArray append(String str){
        char[] array = str.toCharArray();
        if(size + array.length > source.length){
            resize(array.length);
        }
       for(char ch: array){
           source[size++]= ch;
       }
        return this;
    }

    private void resize(int length){
        System.out.println("resizing");
        char src[] = new char[source.length + length];
        copy(source, src);
        source = src;
    }

    private void copy(char[] src, char[] dest){

        for(int i =0; i < src.length; i++){
            dest[i]=src[i];
        }
    }

    public static void main(String... args){
        MyArray m = new MyArray();
        m.append("how are you doing? ")
        .append("this is to much ")
        .append(" what is going on ")
        .append(" not to shabby");
        System.out.println(Arrays.toString(m.source));
    }
}
