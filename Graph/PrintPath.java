   public static void printAllPath(ArrayList<Edge>[] graph,int src,int dest,String psf,boolean[] vis){
       if(src==dest){
           System.out.println(psf);
           return;
       }
       vis[src]=true;
       for(Edge edge:graph[src]){
           int nbr=edge.nbr;
           if(!vis[nbr]){
               printAllPath(graph,nbr,dest,psf+nbr+"",vis);
             
              
           }
       }
          vis[src]=false;
       
   }
