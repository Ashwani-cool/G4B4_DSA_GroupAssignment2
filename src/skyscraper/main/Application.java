package skyscraper.main;

import skyscraper.assemblefloor.Assemble;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of floors in the building:-");
        n = sc.nextInt();
        int[] floorSize = new int[n];
        for(int i=0;i<n;i++){
            System.out.println(String.format("Enter the floor size given on day :%d",i+1));
            floorSize[i]=sc.nextInt();
        }
        Assemble asmbl = new Assemble();
        asmbl.assembleBuilding(floorSize,n);
    }
}
