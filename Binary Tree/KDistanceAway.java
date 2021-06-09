    public static ArrayList<Node> nodeToRootPath(Node node, int data){
       if(node==null){
           return new ArrayList<>();
       }
        if(node.data==data){
        ArrayList<Node> ba=new ArrayList<>();
        ba.add(node);
        return ba;
    }
    
        ArrayList rr1=nodeToRootPath(node.left,data);
        ArrayList rr2=nodeToRootPath(node.right,data);
        if(rr1.size()>0){
            rr1.add(node);
            return rr1;
        }
        if(rr2.size()>0){
            rr2.add(node);
            return rr2;
        }
    
    return new ArrayList<>();
  }
    public static void printKLevelsDown(Node node, int k,Node blocker){
    if(node==null||node==blocker)
    return ;
    if(k==0){
        System.out.println(node.data);
        return;
    }
    printKLevelsDown(node.left,k-1,blocker);
    printKLevelsDown(node.right,k-1,blocker);
  }

  public static void printKNodesFar(Node node, int data, int k) {
    ArrayList<Node> path=nodeToRootPath(node,data);
    for(int i=0;i<path.size();i++){
        printKLevelsDown(path.get(i),k-i,i==0?null:path.get(i-1));
    }
  }
