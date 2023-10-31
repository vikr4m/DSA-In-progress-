public class removesduplicaterecur {
    public static void removedup(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        //kaam
        char currchar = str.charAt(idx);
        if(map[currchar-'a'] == true){
            removedup(str, idx+1, newstr, map);
        } else{
            map[currchar-'a'] = true;
            removedup(str, idx+1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        StringBuilder newstr = new StringBuilder("");
        boolean map[] = new boolean[26];
        removedup(str,0,newstr,map);
    }
}
