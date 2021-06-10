static int tilt = 0;
  public static int tilt(Node node){
      if(node==null)
      return 0;
      if(node.left==null&&node.right==null)
      return node.data;
    int lt=tilt(node.left);
    int rt=tilt(node.right);
    tilt+=Math.abs(lt-rt);
    int ans=lt+rt;
    return ans+node.data;
  }
