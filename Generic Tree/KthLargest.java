  static int floor;
  public static void Floor(Node node, int data) {
    
      if(node.data<data){
           floor=Math.max(node.data,floor);
          
        }
  
        
    for(Node child:node.children){
      
       Floor(child,data);
    }
 
  }

  public static int kthLargest(Node node, int k){
        int data=Integer.MAX_VALUE;
        floor=Integer.MIN_VALUE;
    while(k--!=0){
         Floor(node,data);
         data=floor;
         floor=Integer.MIN_VALUE;
    }
    return data;
  }
