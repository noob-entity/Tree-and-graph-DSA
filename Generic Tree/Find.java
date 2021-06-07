  public static boolean find(Node node, int data) {
      if(node.data==data)
      return true;
    for(Node child:node.children){
         boolean rr=find(child,data);
         if(rr)
         return true;
        
    }
    return false;
  }
