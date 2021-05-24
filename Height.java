public static int height(Node node) {
    int ht=-1;
    for(Node child : node.children){
        ht=Math.max(ht,height(child));
    }
    return ht+1;
  }
