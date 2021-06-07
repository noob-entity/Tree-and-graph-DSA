  static int maxsum;
 static Node maxsumnode;
  public static int sum(Node node){
     int ans=node.data;
     for(Node child: node.children){
         ans+=sum(child);
     }
    if(ans>maxsum){
        maxsum=ans;
        maxsumnode=node;
        
    }
    return ans;
  }
