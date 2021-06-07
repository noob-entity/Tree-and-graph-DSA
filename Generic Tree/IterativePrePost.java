  public static class Pair{
      Node n;
      int state;
      public Pair(Node n,int state){
          this.n=n;
          this.state=state;
      }
  }

  public static void IterativePreandPostOrder(Node node) {
    Stack<Pair> st=new Stack<>();
    st.push(new Pair(node,0));
    String pre="";
    String post="";
    while(st.size()>0){
        Pair tos=st.peek();
        if(tos.state==0){
             pre+=tos.n.data+" ";
            if(tos.n.children.size()>0){
               
                st.push(new Pair(tos.n.children.get(0),0));
                tos.state++;
            } else{
                post+=tos.n.data+" ";
                st.pop();
            }
        } else if(tos.state<tos.n.children.size()){
            st.push(new Pair(tos.n.children.get(tos.state),0));
            tos.state++;
            
        }
        else{
             post+=tos.n.data+" ";
                st.pop();
            
        }
        
    }
