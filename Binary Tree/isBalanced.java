  public static int balFac(Node node){
    if(node==null) return 0;
    int lf=balFac(node.left);
    int rf=balFac(node.right);
    int bf=Math.abs(lf-rf);
    if(bf>1)
    isbalc=false;
    return Math.max(lf,rf)+1;
  }
  public static boolean isbalc=true;
  public static void isBalanced(Node node){
      isbalc=true;
      balFac(node);
      
  }
  
