  public static void printSingleChildNodes(Node node){
    if(node==null)
    return;
    if(node.left!=null&&node.right==null){

        System.out.println(node.left.data);
        return;
        
    }
    if(node.right!=null&&node.left==null){
            
        System.out.println(node.right.data);
        return;
             
    }
    
    printSingleChildNodes(node.left);
    printSingleChildNodes(node.right);
    
  }
