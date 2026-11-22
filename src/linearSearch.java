//implemented linear search at string
public class linearSearch {
    public static void main(String[] args){
        String name = "Anjali";
        char target = 'l';
        System.out.println(search(name,target));
    }
    static int search(String str, char target){
        if(str.length() == 0){ //str.isEmpty() can be also written
            return -1;
        }
        for(int i =0; i<str.length(); i++){
            if(target ==  str.charAt(i)){
                return i;
            }
        }
return -1;
    }
}
