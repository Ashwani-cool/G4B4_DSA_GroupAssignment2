package skyscraper.assemblefloor;

import java.util.PriorityQueue;
import java.util.Queue;

public class Assemble {
    public void assembleBuilding(int[] floors,int buildingLength){
        int max_size = buildingLength;
        Queue<Integer> que = new PriorityQueue<>(java.util.Collections.reverseOrder());
        for(int i=0;i<buildingLength;i++){
            System.out.println(String.format("Day: %d",i+1));
            que.add(floors[i]);
            while(!que.isEmpty() && que.peek()==max_size){
                System.out.print(que.poll() + " ");
                max_size--;
            }
            System.out.println();
        }
    }
}
