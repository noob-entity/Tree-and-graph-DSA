  public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi){
    if(node==null)
    return;
    if(node.left==null&&node.right==null){
        path+=node.data;
        sum+=node.data;
        if(sum>=lo&&sum<=hi)
        System.out.println(path);
        return;
    }
    pathToLeafFromRoot(node.left,path+node.data+" ",sum+node.data,lo,hi);
     pathToLeafFromRoot(node.right,path+node.data+" ",sum+node.data,lo,hi);
  }
