  public static int size(Node node) {
      if(node==null)
      return 0;
    int ls=size(node.left);
    int rs=size(node.right);
    return ls+rs+1;
  }

  public static int sum(Node node) {
      if(node==null)
      return 0;
 int ls=sum(node.left);
 int rs=sum(node.right);
 return ls+rs+node.data;
  }

  public static int max(Node node) {
      if(node==null)
      return Integer.MIN_VALUE;
    int rm=max(node.right);
    return Math.max(rm,node.data);
  }

  public static int min(Node node) {
    if(node==null)
      return Integer.MAX_VALUE;
      int lm=min(node.left);
      return Math.min(lm,node.data);
  }

  public static boolean find(Node node, int data){
      boolean la=false,ra=false;
      if(node==null) return false;
      if(data==node.data)
      return true;
    if(data<node.data){
      la= find(node.left,data);
    }
    if(data>node.data){
    ra=  find(node.right,data);
    }
    return  la||ra;
    
  }  
