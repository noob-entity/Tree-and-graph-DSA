  public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean[] vis){
       if(src==dest)
       return true;
       vis[src]=true;
       for(Edge edge:graph[src]){
           int nbr=edge.nbr;
           if(!vis[nbr]){
               boolean nans=hasPath(graph,nbr,dest,vis);
               if(nans){
                   return true;
               }
           }
       }
       return false;
   }
