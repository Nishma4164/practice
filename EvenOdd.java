public class EvenOdd {
    public static void main(String[] args) {
        int[]a = {12,7,25,18,30,11,4};
        int even=0;
        int odd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even="+even);
        System.out.println("odd="+odd);
    }
    
}
