  static int ceil=Integer.MIN_VALUE;
  static int floor=Integer.MAX_VALUE;
  public static void ceilAndFloor(Node node, int data) {
         if(node.data>data){
        
            ceil=Math.min(node.data,ceil);
   
        }
      else if(node.data<data){
           floor=Math.max(node.data,floor);
        }
  
        
    for(Node child:node.children){
      
       ceilAndFloor(child,data);
    }
  
  }
