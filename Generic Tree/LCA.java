  public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
    if (node.data == data) {
      ArrayList<Integer> path = new ArrayList<>();
      path.add(node.data);
      return path;
    }

    for (Node child : node.children) {
      ArrayList<Integer> ptc = nodeToRootPath(child, data);
      if (ptc.size() > 0) {
        ptc.add(node.data);
        return ptc;
      }
    }

    return new ArrayList<>();
  }

  public static int lca(Node node, int d1, int d2) {
    ArrayList<Integer> ar1=nodeToRootPath(node,d1);
    ArrayList<Integer> ar2=nodeToRootPath(node,d2);
    int i=ar1.size()-1;
    int j=ar2.size()-1;
    while(i>=0&&j>=0){
        if(ar1.get(i)==ar2.get(j)){
            i--;
            j--;
        } else break;
        
    }
    return ar1.get(i+1);
  }
