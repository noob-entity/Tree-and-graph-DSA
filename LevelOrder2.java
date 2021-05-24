 public static void levelOrderLinewise(Node node){
     Queue<Node> que=new ArrayDeque<>();
    que.add(node);
    while(que.size()>0){
        int t=que.size();
      
        while(t-->0){
        Node rm=que.remove();
        System.out.print(rm.data+" ");
      
       
        for(Node child:rm.children){
            que.add(child);
          
        }
        
        }
         System.out.println();
       
    }
 
  }
