 public static boolean find(Node node, int data){
       if(node==null){
           return false;
       }
    if(node.data==data)
    return true;
    boolean l=find(node.left,data);
    boolean r=find(node.right,data);
    if(r||l) return true;
    
    return false;
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
       if(node==null){
           return new ArrayList<>();
       }
        if(node.data==data){
        ArrayList ba=new ArrayList<>();
        ba.add(data);
        return ba;
    }
    
        ArrayList rr1=nodeToRootPath(node.left,data);
        ArrayList rr2=nodeToRootPath(node.right,data);
        if(rr1.size()>0){
            rr1.add(node.data);
            return rr1;
        }
        if(rr2.size()>0){
            rr2.add(node.data);
            return rr2;
        }
    
    return new ArrayList<>();
  }
