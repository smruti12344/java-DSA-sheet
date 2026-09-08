public class BackTracking{
    //Q. How many way i can arrange ABC
    public void Permutation(String str,String perm,int idx){
        //Base case
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        //run loop over the string
        for(int i=0;i<str.length();i++){
            //1st get current character
            char curr = str.charAt(i);
            //remove the current character from the string get new String
            String newStr = str.substring(0,i)+str.substring(i+1);
            //add current char to perm and call same function
            Permutation(newStr,perm+curr,idx++);

        }
    }

    public static void main(String args[]){
        String str = "ABC";
        BackTracking bt = new BackTracking();
        bt.Permutation(str,"",0);

    }
}