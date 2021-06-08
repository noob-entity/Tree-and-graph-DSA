  public static int size(Node node) {
     if(node==null)
    return 0;
     
   int l= size(node.left);
   int r=size(node.right);
    
    return 1+l+r;
    
  }

 public static int sum(Node node) {
    if(node==null)
    return 0;
    int lsum=sum(node.left);
    int rsum=sum(node.right);
    return lsum+rsum+node.data;
  }

  public static int max(Node node) {
    if(node==null)
    return Integer.MIN_VALUE;
    int lmax=max(node.left);
    int rmax=max(node.right);
    return Math.max(node.data,Math.max(lmax,rmax));
  }

  public static int height(Node node) {
    if(node==null)
    return 0;
    int lmax=height(node.left);
    int rmax=height(node.right);
    return Math.max(lmax,rmax)+1;
  }
