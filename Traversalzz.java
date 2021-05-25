 public static void levelOrderLinewiseZZ(Node node){
    Stack<Node> cs=new Stack<>();
    Stack<Node> ns=new Stack<>();
    cs.push(node);
    int level=0;
    while(cs.size()>0){
    while(cs.size()>0){
        Node rn=cs.pop();
        System.out.print(rn.data+" ");
        if(level%2==0){
            for(Node child : rn.children){
                ns.push(child);
            }
        } else{
            for(int i=rn.children.size()-1;i>=0;i--){
                ns.push(rn.children.get(i));
            }
        }
    }
    System.out.println();
    level++;
    cs=ns;
    ns=new Stack<>();
    }
  }
