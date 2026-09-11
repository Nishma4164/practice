public class PostiveNegative {
    public static void main(String[] args) {
        int[]a= {10,-5,8,-2,7,-9};
        int positive=0;
        int negative=0;
        for(int i=0;i<a.length;i++){
            if (a[i]>0){
               positive++;
            }else if (a[i]<0){
                   negative++; 
                }
              
            }
        System.out.println("positive="+positive);
        System.out.println("negative="+negative);
    }
    }

