 static Node predecessor;
  static Node successor;
  static int state=0;
  public static void traversal(Node node, int data) {
   // int state=0;
     if(state==0){
         if(node.data!=data)
            predecessor=node;
            else state++;
        }
      else if(state==1){
           successor=node;
           state=2;
        }
        
    for(Node child:node.children){
      
       traversal(child,data);
    }
  }
