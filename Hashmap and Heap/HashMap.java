// highest frequency character
public int HFC(String str){
HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        int max=0;
        char ch=str.charAt(0);
        for(char val:map.keySet()){
            if(map.get(val)>max){
                max=map.get(val);
                ch=val;
            }
        }
        System.out.println(ch);
}
