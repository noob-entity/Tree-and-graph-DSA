  public static void levelOrder(Node node) {
    
     Queue<Node> que=new ArrayDeque<>();
    que.add(node);
    while(que.size()!=0){
        int t=que.size();
      
        while(t-->0){
            Node rm=que.remove();
            System.out.print(rm.data+" ");
            if(rm.left!=null)
                que.add(rm.left);
            if(rm.right!=null)
                que.add(rm.right);
        }
         System.out.println();
    }
  }
