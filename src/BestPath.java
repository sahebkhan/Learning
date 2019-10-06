import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.ArrayDeque;

public class BestPath{

    static class Data{
        int x;
        int y;
        int size;
        Data next;
        Data prev;

        public Data(int x, int y, int size){
           this(x,y,size, null,null);
        }
        public Data(int x , int y , int s , Data n , Data p){
            this.x =x ;
            this.y = y;
            this.size = s;
            this.next =n;
            this.prev =p;
        }

        public String toString(){
           return "["+x+" ,"+y+" ="+size+"] <- "+ (prev == null ? "starts here ":prev);
        }
    }

   private static char [][]maze={{'O','O','D','O','O'},
                                 {'D','O','O','D','O'},
                                 {'O','D','O','D','O'},
                                 {'O','O','O','O','D'},
                                 {'O','O','D','X','O'}
                                };
    public static void main(String... args){
        System.out.println("found list "+best());   
    }

    static List<Data> best(){
        List<Data> bestPath = new ArrayList<>(); 

        Queue<Data> queue = new ArrayDeque<>();
        List<Data> allPaths = new ArrayList<>();
        queue.add(new Data(0,0,0));
        // maze[0][0]='D';
        Data point = null;
        while(!queue.isEmpty()){
            point = queue.poll();
            maze[point.x][point.y]='D';
            // System.out.println(point);
            //1. start from 0,0
            //2.  check all possible directions and add them in queue and mark them completed. 
            //3. when you reach destination add them in list
            addPossiblePaths(point, queue, allPaths,5);
        }

        return allPaths;
    }

    private static int[][] paths={{0,1},{0, -1}, {1,0},{-1,0}};

    static void addPossiblePaths(Data parentData, Queue<Data> queue,List<Data> allPaths,int size){
        int x = parentData.x , y = parentData.y, s = parentData.size, nx , ny;
        for(int i=0; i < 4; i ++){
                nx = x +paths[i][0];
                ny = y +paths[i][1];
               // System.out.print(nx+"   "+ny+"   ");
                if(nx > -1  && nx < size && ny > -1 && ny < size && maze[nx][ny] !='D' ){
                    if(maze[nx][ny] =='X'){
                    
                        allPaths.add(new Data(nx,ny,s+1,null,parentData));
                        // System.out.println("found in loop"+allPaths);
                    }else{
                        queue.add(new Data(nx,ny,s+1,null,parentData));
                        // maze[nx][ny]='D';
                    }
                }
            
        }
    }


}