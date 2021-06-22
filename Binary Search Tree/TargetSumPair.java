  public static void targetSumPair(Node node,int target,Node oroot){
      if(node==null) return;
      targetSumPair(node.left,target,oroot);
      int comp=target-node.data;
      if(comp>node.data){
          boolean isFound=find(oroot,comp);
          if(isFound){
              System.out.println(node.data+" "+comp);
          }
          
      }
      targetSumPair(node.right,target,oroot);
  }
    public static boolean find(Node node, int data){
      boolean la=false,ra=false;
      if(node==null) return false;
      if(data==node.data)
      return true;
    if(data<node.data){
      la= find(node.left,data);
    }
    if(data>node.data){
    ra=  find(node.right,data);
    }
    return  la||ra;
    
  } 
// time O(nlog n)
//Space O(log n)
    public static void inorder(Node node,ArrayList<Integer> list) {
    if (node == null) {
      return;
    }


    inorder(node.left,list);
    list.add(node.data);
    inorder(node.right,list);
  }
  public static void targetSumPair(Node node,int target){
     ArrayList<Integer> l=new ArrayList<>();
     inorder(node,l);
     int lo=0;
     int hi=l.size()-1;
     while(lo<hi){
         if(l.get(lo)+l.get(hi)==target){
            System.out.println(l.get(lo)+" "+l.get(hi)); 
            lo++;
            hi--;
         }
         else if(l.get(lo)+l.get(hi)<target){
             lo++;
             
         } else{
             hi--;
         }
         
     }
  }
//time O(n)
//space O(n)
  public static void targetSumPair(Node node,int target){
     Stack<Pair> ls=new Stack<>();
     Stack<Pair> rs=new Stack<>();
     ls.push(new Pair(node,0));
      rs.push(new Pair(node,0));
      int lo=inorder(ls);
      int hi=reverseinorder(rs);
     while(lo<hi){
         if(lo+hi==target){
            System.out.println(lo+" "+hi); 
             lo=inorder(ls);
      hi=reverseinorder(rs);
         }
         else if(lo+hi<target){
             lo=inorder(ls);
             
         } else{
             hi=reverseinorder(rs);
         }
         
     }
  }
  public static int inorder(Stack<Pair> st){
      while(st.size()>0){
          Pair top=st.peek();
          if(top.state==0){
              if(top.node.left!=null){
                  Pair lp=new Pair(top.node.left,0);
                  st.push(lp);
              }
              top.state++;
              
          } else if(top.state==1){
                if(top.node.right!=null){
                 Pair rp=new Pair(top.node.right,0);
                  st.push(rp);  
              }
              top.state++;
              return top.node.data;
              
          }
          else{
              st.pop();
          }
      }
      return -1;
      
  }
   public static int reverseinorder(Stack<Pair> st){
         while(st.size()>0){
          Pair top=st.peek();
          if(top.state==0){
                if(top.node.right!=null){
                 Pair rp=new Pair(top.node.right,0);
                  st.push(rp);  
              }
              top.state++;
              
              
          } else if(top.state==1){
               if(top.node.left!=null){
                  Pair lp=new Pair(top.node.left,0);
                  st.push(lp);
              }
              top.state++;
              return top.node.data;
            
              
          }
          else{
              st.pop();
          }
      }
      return -1;
      
  }
// time O(n)
//space O(logn)
