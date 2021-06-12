 public static class BSTPair{
      int min;
      int max;
      boolean isBST;
      Node root;
      int size;
       BSTPair(){
          
      }
      BSTPair(int min,int max,boolean isBST,int size,Node root){
          this.min=min;
          this.max=max;
          this.isBST=isBST;
          this.size=size;
          this.root=root;
      }
  }
  public static BSTPair largestBSTSubtree(Node node){
      if(node==null){
          return new BSTPair(Integer.MAX_VALUE,Integer.MIN_VALUE,true,0,null);
      }
      BSTPair lp=largestBSTSubtree(node.left);
      BSTPair rp=largestBSTSubtree(node.right);
      boolean isBST=(lp.max<node.data&&rp.min>node.data)&&lp.isBST && rp.isBST;
      int max=Math.max(Math.max(rp.max,lp.max),node.data);
      int min=Math.min(Math.min(rp.min,lp.min),node.data);
      int size=0;
      Node root=null;
      if(isBST){
        size=lp.size+rp.size+1;
        root=node;
      }
      else if(lp.size>rp.size){
          size=lp.size;
          root=lp.root;
          
      }
      else{
          size=rp.size;
          root=rp.root;
      }
      BSTPair np=new BSTPair(min,max,isBST,size,root);
      return np;
  }
  
