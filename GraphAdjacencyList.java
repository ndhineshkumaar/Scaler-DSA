import java.util.*;

public class GraphAdjacencyList {
    public static void main(String args[]){

        Scanner dk=new Scanner(System.in);
        
        int n=dk.nextInt();
        int m=dk.nextInt();

        List<List<Integer>> graph=new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for (int i=0;i<m;i++){

            int v=dk.nextInt();
            int u=dk.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i < graph.size(); i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(graph);
    }
}
