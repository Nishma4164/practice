public class search {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int search=20;
        boolean found=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                found=true;
                
            }
        }
        if(found){
            System.out.println("found");
            
        }else{
            System.out.println("not found");
        }
    }
}
