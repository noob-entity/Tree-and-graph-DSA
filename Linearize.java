  //get tail function
  public static Node getTail(Node node){
      while(node.children.size()>0){
          node=node.children.get(0);
      }
      return node;
  }
  

  public static void linearize(Node node){
    for(Node child:node.children){
        linearize(child);
    }
    for(int i=node.children.size()-2;i>=0;i--){
      Node tail=getTail(node.children.get(i));
      tail.children.add(node.children.get(i+1));
      node.children.remove(i+1);
    }
  }
