  public static Node remove(Node node, int data) {
    // write your code here
    if(node==null)
    return null;
    if(node.data==data){
        //both child
    if(node.left!=null&&node.right!=null){
         int maxright=max(node.left);
        node.data=maxright;
        node.left=remove(node.left,maxright);
        return node;
    }//right child
   else if(node.right!=null){
      return node.right;
        
    }//left child
    else if(node.left!=null){
        return node.left;
    } //no child
    else{
 
        return null;
    }
    }
    else if(data<node.data)
    node.left=remove(node.left,data);
     else 
     node.right=remove(node.right,data);
     return node;
  
  }
