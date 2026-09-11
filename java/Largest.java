public class Largest {
    public static void main(String[] args) {
        int[] a={10,25,7,40,18};
        int largest=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("Largeat="+largest);
    }
    
}
