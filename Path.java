public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    if(node.data==data){
        ArrayList ba=new ArrayList<>();
        ba.add(data);
        return ba;
    }
    for(Node child:node.children){
        ArrayList rr=nodeToRootPath(child,data);
        if(rr.size()>0){
            rr.add(node.data);
            return rr;
        }
    }
    return new ArrayList();
 }
