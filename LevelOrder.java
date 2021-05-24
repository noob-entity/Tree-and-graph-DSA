  public static void levelOrder(Node node){
    Queue<Node> que=new ArrayDeque<>();
    que.add(node);
    while(que.size()>0){
        Node rm=que.remove();
        System.out.print(rm.data+" ");
        for(Node child:rm.children){
            que.add(child);
        }
    }
    System.out.print(".");
  }
