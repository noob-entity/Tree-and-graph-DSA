public static void mirror(Node node){
    
    //faith
    for(Node child:node.children){
        mirror(child);
    }
     int left=0;
     int right=node.children.size()-1;
     while(left<right){
         Node lval=node.children.get(left);
         Node rval=node.children.get(right);
         node.children.set(left,rval);
        node.children.set(right,lval);
        left++;
        right--;

     }
  }
