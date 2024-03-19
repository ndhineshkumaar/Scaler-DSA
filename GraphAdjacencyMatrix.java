import java.util.*;

public class GraphAdjacencyMatrix {
    public static void main(String args[]){

        Scanner dk=new Scanner(System.in);

        int n=dk.nextInt();
        int m=dk.nextInt();

        int[][] graph=new int[n][n];

        for (int i=0;i<m;i++){

            int u=dk.nextInt();
            int v=dk.nextInt();

            graph[u][v]=1;
            graph[v][u]=1;
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){

                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}
