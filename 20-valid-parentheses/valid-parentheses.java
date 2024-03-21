class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2!=0) return false;
       Stack<Character> st = new Stack<>();
       int count=0;
       for(int i =0;i<n;i++)
       {
        char temp = s.charAt(i);
            if(temp =='{'||temp=='['||temp=='(')
            {
                 st.push(temp);
                 count++;
            }
               
            else if(temp=='}'&&!st.isEmpty()&&st.peek()=='{') st.pop();
            else if(temp==']'&&!st.isEmpty()&&st.peek()=='[') st.pop();
            else if(temp==')'&&!st.isEmpty()&&st.peek()=='(') st.pop();
       }
       return st.isEmpty()&&count==n/2;
    }
}