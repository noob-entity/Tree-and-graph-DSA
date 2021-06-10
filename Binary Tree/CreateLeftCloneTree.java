 public static Node createLeftCloneTree(Node node){
      if(node==null)
      return null;
     
      Node lc=createLeftCloneTree(node.left);
      Node rc=createLeftCloneTree(node.right);
      node.right=rc;
      Node n=new Node(node.data,null,null);
      n.left=lc;
      node.left=n;
      return node;
      
    
  }
